package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.dao.model.Survey;
import com.devlogs.apolo.osg.domain.entity.SurveyTopicEntity;
import com.devlogs.apolo.osg.services.GetAllTopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/surveytopic")
@RestController
public class SurveyTopicController {
    private GetAllTopicService mGetAllSurveyTopicService;

    public SurveyTopicController (GetAllTopicService getAllTopicService) {
        mGetAllSurveyTopicService = getAllTopicService;
    }

    @GetMapping("getall")
    public ResponseEntity<List<SurveyTopicEntity>> getAllSurveyTopic () {
        List<SurveyTopicEntity> result = mGetAllSurveyTopicService.execute();
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
