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
    PersonalityService personalityService;  //Service which will do all data retrieval/manipulation work

//    private final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

//        logger.debug("index() is executed!");

        model.put("title", ".getTitle");
        model.put("msg", "helloWorldService.getDesc()");

        return "index";
    }

//    @RequestMapping(value = "/personality", method = RequestMethod.POST)
//    public @ResponseBody String getMock(@RequestBody String json){
//        return "POST" + json;
//    }

//    public String personality(Map<String, Object> model) {

//        logger.debug("index() is executed!");

//        model.put("title", ".getTitle");
//        model.put("msg", "helloWorldService.getDesc()");
//
//        return "index";
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/personality")
//    public ResponseEntity<Person> deleteObject(@RequestBody Person id) {
//        Person person = personService.findById(id);
//        personService.deleteObject(id);
//        return new ResponseEntity<Person>(person, HttpStatus.ACCEPTED);
//    }

    @RequestMapping(method = RequestMethod.POST, value = "/personality")
    public @ResponseBody ResponseEntity<Personality> getPersonality(@RequestBody String answersJson) {
        Personality personality = personalityService.getPersonality(answersJson);

        return new ResponseEntity<Personality>(personality, HttpStatus.OK);

//        String jsonData = "[{\"id\":\"3253123\",\"firstname\":\"Chris\",\"lastname\":\"Johnson\",\"address\":\"211, Geoffrey Drive\",\"city\":\"Newark\",\"phone\":\"999-888-6666\",\"email\":\"chrisj@yahoo.com\"},{\"id\":\"67643837\",\"firstname\":\"Bill\",\"lastname\":\"Derkson\",\"address\":\"201, Sleepy Hollow Drive\",\"city\":\"Newark\",\"phone\":\"999-777-2222\",\"email\":\"billd@gmail.com\"}]";
//        return jsonData;
    }



}