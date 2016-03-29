package com.ixxus.service;

import com.ixxus.model.Game;
import com.ixxus.repository.GamesRepository;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by simion on 29/03/2016.
 */
@Service("gamesService")
public class GamesServiceImpl implements GamesService{

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesServiceImpl(final GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    @Override
    public Game getGame1(String answerJson) {
        String answer = parseAnswer(answerJson, "g1q1");
        Game game = new Game();
        game.setExplanation(gamesRepository.getGame1Explanation());
        if (answer.equals(gamesRepository.getGame1Answer())) {
            game.setStatus(gamesRepository.CORRECT);
        } else {
            game.setStatus(gamesRepository.INCORRECT);
        }

        return game;
    }

    @Override
    public Game getGame2(String answerJson) {
        String answer = parseAnswer(answerJson, "g2q1");
        Game game = new Game();
        game.setExplanation(gamesRepository.getGame2Explanation());
        if (answer.equals(gamesRepository.getGame2Answer())) {
            game.setStatus(gamesRepository.CORRECT);
        } else {
            game.setStatus(gamesRepository.INCORRECT);
        }

        return game;
    }


    private String parseAnswer(String answersJson, String question) {
        String answer = "";
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject)jsonParser.parse(answersJson);
            answer = (String)jsonObject.get(question);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return answer;
    }

}
