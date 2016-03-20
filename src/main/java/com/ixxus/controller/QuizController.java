package com.ixxus.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/booth")

public class QuizController {

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
    public @ResponseBody String getpersonality(@RequestBody String json) {
        String jsonData = "[{\"id\":\"3253123\",\"firstname\":\"Chris\",\"lastname\":\"Johnson\",\"address\":\"211, Geoffrey Drive\",\"city\":\"Newark\",\"phone\":\"999-888-6666\",\"email\":\"chrisj@yahoo.com\"},{\"id\":\"67643837\",\"firstname\":\"Bill\",\"lastname\":\"Derkson\",\"address\":\"201, Sleepy Hollow Drive\",\"city\":\"Newark\",\"phone\":\"999-777-2222\",\"email\":\"billd@gmail.com\"}]";
        return jsonData;
    }



}