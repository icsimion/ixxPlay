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
public class PersonalityServiceImpl implements PersonalityService{

    private final PersonalityRepository personalityRepository;

    @Autowired
    public PersonalityServiceImpl(final PersonalityRepository personalityRepository) {
        this.personalityRepository= personalityRepository;
    }

    @Override
    public Personality getPersonality(String answersJson) {
        Map<String, String> qas = parseAnswers(answersJson);
        Personality personality = determinePersonalityTraits(qas);

        return personality;
    }

    private Map<String, String> parseAnswers(String answersJson) {
        Map<String, String> qas = new HashMap<>();
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(answersJson);
            for(int i=0; i<=11; i++) {
                String answer = (String) jsonObject.get("q"+i);
                qas.put("q"+i, answer);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return qas;
    }

    private Personality determinePersonalityTraits(Map<String, String> qas) {
        Personality personality = new Personality();

        personality.setPlan(determineTraitPlan(qas));
        personality.setLevel(determineTraitLevel(qas));
        personality.setTeam(determineTraitTeam(qas));
        personality.setLiberal(determineTraitLiberal(qas));

        return personality;
    }

    private Trait determineTraitPlan(Map<String, String> qas) {
        // TODO
        return personalityRepository.getDoer();
    }

    private Trait determineTraitLevel(Map<String, String> qas) {
        // TODO
        return personalityRepository.getLevelHigh();
    }

    private Trait determineTraitTeam(Map<String, String> qas) {
        // TODO
        return personalityRepository.getTeam();
    }

    private Trait determineTraitLiberal(Map<String, String> qas) {
        // TODO
        return personalityRepository.getLiberal();
    }

}
