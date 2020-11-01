package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.services.PublishResultWithOverrideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api/v1/survey/result")
@RestController
public class SurveyResultController {
    private PublishResultWithOverrideService mPublishResultService;

    @Autowired
    SurveyResultController (PublishResultWithOverrideService publishResult) {
        mPublishResultService = publishResult;
    }

    @PostMapping("/publishresult")
    public ResponseEntity publishResult (@RequestBody PublishResultReqBody reqBody, HttpServletRequest request) {
        String ownerEmail = (String) request.getAttribute("userEmail");
        String ownerName = (String) request.getAttribute("userName");
        String campus = (String) request.getAttribute("campus");
        int admission = (int) request.getAttribute("admission");
        String pictureUrl = (String) request.getAttribute("pictureUrl");

        if (mPublishResultService.execute(ownerEmail, ownerName, pictureUrl, campus, admission, reqBody.surveyId, reqBody.answer) == 1) {
            return new ResponseEntity(new Object() {
                public String message = "Publish Success";
            }, HttpStatus.OK);
        }
        return new ResponseEntity(new Object() {
           public String message = "Publish failed";
        }, HttpStatus.resolve(400));
    }

    public static class PublishResultReqBody {
        private String surveyId;
        private int[] answer;

        public PublishResultReqBody(String surveyId, int[] answer) {
            this.surveyId = surveyId;
            this.answer = answer;
        }

        public String getSurveyId() {
            return surveyId;
        }

        public int[] getAnswer() {
            return answer;
        }
    }
}