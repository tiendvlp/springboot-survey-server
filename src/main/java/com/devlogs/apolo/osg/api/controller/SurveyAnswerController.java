package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.services.GetSurveyResultService;
import com.devlogs.apolo.osg.services.PublishAnswerWithOverrideService;
import com.devlogs.apolo.osg.services.SaveSurveyResultService;
import com.devlogs.apolo.osg.services.surveyservices.MBTIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/api/v1/survey/result")
@RestController
public class SurveyAnswerController {
    private PublishAnswerWithOverrideService mPublishResultService;
    private SaveSurveyResultService mSaveSurveyResultService;
    private GetSurveyResultService getSurveyResultService;
    private MBTIService mbtiService =  new MBTIService();

    @Autowired
    SurveyAnswerController(PublishAnswerWithOverrideService publishResult,GetSurveyResultService getSurveyResultService, SaveSurveyResultService saveSurveyResultService) {
        mPublishResultService = publishResult;
        this.getSurveyResultService = getSurveyResultService;
        mSaveSurveyResultService = saveSurveyResultService;
    }

    @PostMapping("/publishresult")
    public ResponseEntity<PublishSurveyResultRespondModel> publishResult (@RequestBody PublishResultReqBody reqBody, HttpServletRequest request) {
        String ownerEmail = (String) request.getAttribute("userEmail");
        String ownerName = (String) request.getAttribute("userName");
        String campus = (String) request.getAttribute("campus");
        int admission = (int) request.getAttribute("admission");
        String pictureUrl = (String) request.getAttribute("pictureUrl");

        if (mPublishResultService.execute(ownerEmail, ownerName, pictureUrl, campus, admission, reqBody.surveyId, reqBody.answer) == 1) {
            String surveyResultId = "";
            // equal MBIT.id
            if (reqBody.surveyId.equals("9121dev92log")) {
                surveyResultId = mSaveSurveyResultService.execute(reqBody.surveyId, ownerEmail, mbtiService.execute());

                if (surveyResultId.isEmpty()) {
                    return new ResponseEntity(new PublishSurveyResultRespondModel("", false), HttpStatus.resolve(400));
                }
                return new ResponseEntity(new PublishSurveyResultRespondModel(surveyResultId, true), HttpStatus.OK);
            }
            return new ResponseEntity(new PublishSurveyResultRespondModel("", true), HttpStatus.OK);
        }
        return new ResponseEntity(new PublishSurveyResultRespondModel("", false), HttpStatus.resolve(400));
    }

    public static class PublishSurveyResultRespondModel {
        String surveyResultId;
        Boolean isSuccess;

        public PublishSurveyResultRespondModel(String surveyResultId, Boolean isSuccess) {
            this.surveyResultId = surveyResultId;
            this.isSuccess = isSuccess;
        }

        public String getSurveyResultId() {
            return surveyResultId;
        }

        public void setSurveyResultId(String surveyResultId) {
            this.surveyResultId = surveyResultId;
        }

        public Boolean getSuccess() {
            return isSuccess;
        }

        public void setSuccess(Boolean success) {
            isSuccess = success;
        }
    }

    public static class PublishResultReqBody {
        private String surveyId;
        private List<Integer> answer;

        public PublishResultReqBody(String surveyId, List<Integer> answer) {
            this.surveyId = surveyId;
            this.answer = answer;
        }

        public String getSurveyId() {
            return surveyId;
        }

        public List<Integer> getAnswer() {
            return answer;
        }
    }
}
