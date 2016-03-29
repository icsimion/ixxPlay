package com.ixxus.controller;
import java.util.Map;

import com.ixxus.model.Game;
import com.ixxus.model.Personality;
import com.ixxus.service.GamesService;
import com.ixxus.service.PersonalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class QuizController {

    @Autowired
    PersonalityService personalityService;

    @Autowired
    GamesService gamesService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        model.put("title", ".getTitle");
        model.put("msg", "helloWorldService.getDesc()");
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/personality")
    public @ResponseBody ResponseEntity<Personality> getPersonality(@RequestBody String answersJson) {
        Personality personality = personalityService.getPersonality(answersJson);

        return new ResponseEntity<Personality>(personality, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/game1")
    public @ResponseBody ResponseEntity<Game> getGame1(@RequestBody String answerJson) {
        Game game = gamesService.getGame1(answerJson);

        return new ResponseEntity<Game>(game, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/game2")
    public @ResponseBody ResponseEntity<Game> getGame2(@RequestBody String answerJson) {
        Game game = gamesService.getGame2(answerJson);

        return new ResponseEntity<Game>(game, HttpStatus.OK);
    }



}