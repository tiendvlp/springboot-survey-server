package com.devlogs.apolo.osg.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class RootController {

    @Autowired
    RootController () {
    }


    @GetMapping()
    public String getAllQuestionInSurvey () {
        return "Server is alive";
    }

}
