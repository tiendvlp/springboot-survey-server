package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.domain.entity.SurveyEntity;
import com.devlogs.apolo.osg.services.GetAllSurveyService;
import com.devlogs.apolo.osg.services.GetSurveyByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/api/v1/survey")
@RestController
public class SurveyController {
    private GetAllSurveyService mGetAllSurveyServices;
    private GetSurveyByIdService mGetSurveyByIdServices;

    @Autowired
    SurveyController (GetAllSurveyService getAllSurveyService) {
        mGetAllSurveyServices = getAllSurveyService;
    }

    @GetMapping(path = "getallsurveys")
    public ResponseEntity<List<SurveyEntity>> getAllSurvey (HttpServletRequest request) {
        return new ResponseEntity(mGetAllSurveyServices.execute(), HttpStatus.resolve(200));
    }


}

