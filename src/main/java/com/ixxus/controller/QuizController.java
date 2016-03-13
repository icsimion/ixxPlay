package com.ixxus.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController {

//    private final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

//        logger.debug("index() is executed!");

        model.put("title", ".getTitle");
        model.put("msg", "helloWorldService.getDesc()");

        return "index";
    }



}