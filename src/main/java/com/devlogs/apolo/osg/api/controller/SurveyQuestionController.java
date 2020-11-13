package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.domain.entity.SurveyQuestionEntity;
import com.devlogs.apolo.osg.services.GetQuestionInSurveyService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/question")
@RestController()
public class SurveyQuestionController {
    private GetQuestionInSurveyService mGetQuestionsService;

    @Autowired
    SurveyQuestionController (GetQuestionInSurveyService getQuestionInSurveyService) {
        mGetQuestionsService = getQuestionInSurveyService;
    }

    @GetMapping("allquestioninsurvey")
    public ResponseEntity<List<SurveyQuestionEntity>> getAllQuestionInSurvey (@RequestParam("surveyId") String surveyId) {
        return new ResponseEntity(mGetQuestionsService.execute(surveyId), HttpStatus.OK);
    }

    public static class GetAllQuestionInSurveyBody {
        private String surveyId;

        GetAllQuestionInSurveyBody(@JsonProperty("surveyId") String surveyId) {
            this.surveyId = surveyId;
        }

        public String getSurveyId () {
            return this.surveyId;
        }
    }
}
