package com.ixxus.controller;
import java.util.Map;

import com.ixxus.model.Personality;
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



}