package com.ixxus.service;

import com.ixxus.model.Personality;
import com.ixxus.model.Trait;
import com.ixxus.repository.PersonalityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service("personalityService")
public class PersonalityServiceImpl implements PersonalityService {

    private final PersonalityRepository personalityRepository;

    @Autowired
    public PersonalityServiceImpl(final PersonalityRepository personalityRepository) {
        this.personalityRepository = personalityRepository;
    }

    @Override
    public Personality getPersonality(String answersJson) {
        Map<String, Integer> qas = parseAnswers(answersJson);
        Personality personality = determinePersonalityTraits(qas);

        return personality;
    }

    private Map<String, Integer> parseAnswers(String answersJson) {
        Map<String, Integer> qas = new HashMap<>();
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject)jsonParser.parse(answersJson);
            for (int i = 1; i <= 12; i++) {
                String answer = (String)jsonObject.get("q" + i);
                Integer score = answer.equals("A") ? 1 : 0;
                qas.put("q" + i, score);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return qas;
    }

    private Personality determinePersonalityTraits(Map<String, Integer> qas) {
        Personality personality = new Personality();

        personality.setPlan(determineTraitPlan(qas));
        personality.setLevel(determineTraitLevel(qas));
        personality.setTeam(determineTraitTeam(qas));
        personality.setLiberal(determineTraitLiberal(qas));

        return personality;
    }

    private Trait determineTraitPlan(Map<String, Integer> qas) {
        String[] traitQuestions = { "q7" };
        int score = calculateTraitScore(traitQuestions, qas);
        if (score >= 1) {
            return personalityRepository.getDoer();
        }
        return personalityRepository.getPlanner();
    }

    private Trait determineTraitLevel(Map<String, Integer> qas) {
        String[] traitQuestions = { "q2", "q5", "q8" };
        int score = calculateTraitScore(traitQuestions, qas);
        if (score >= 2) {
            return personalityRepository.getLevelLow();
        }
        return personalityRepository.getLevelHigh();
    }

    private Trait determineTraitTeam(Map<String, Integer> qas) {
        String[] traitQuestions = { "q1", "q3", "q6", "q9", "q11" };
        int score = calculateTraitScore(traitQuestions, qas);
        if (score >= 3) {
            return personalityRepository.getTeam();
        }
        return personalityRepository.getSolo();
    }

    private Trait determineTraitLiberal(Map<String, Integer> qas) {
        String[] traitQuestions = { "q4", "q10", "q12" };
        int score = calculateTraitScore(traitQuestions, qas);
        if (score >= 2) {
            return personalityRepository.getLiberal();
        }
        return personalityRepository.getConservative();
    }

    private int calculateTraitScore(String[] traitQuestions, Map<String, Integer> qas) {
        int score = 0;
        for (String q : traitQuestions) {
            score = score + qas.get(q);
        }
        return score;
    }

}
