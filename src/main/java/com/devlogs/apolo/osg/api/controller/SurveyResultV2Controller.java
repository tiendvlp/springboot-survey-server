package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.domain.entity.SurveyResultEntity;
import com.devlogs.apolo.osg.services.GetSurveyResultService;
import com.devlogs.apolo.osg.services.surveyservices.client_layout.MBTIResultLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api/v1/survey/resultv2")
@RestController
public class SurveyResultV2Controller {
    private GetSurveyResultService getSurveyResultService;

    @Autowired
    public SurveyResultV2Controller(GetSurveyResultService getSurveyResultService) {
        this.getSurveyResultService = getSurveyResultService;
    }


    @GetMapping("/getResult/{id}")
    public ResponseEntity<GetSurveyResultRes> getSurveyResult(@PathVariable("id") String id) {
        SurveyResultEntity result = getSurveyResultService.execute(id);
        Object layout = null;
        if (result.getSurveyId().equals("9121dev92log")) {
            layout = new MBTIResultLayout();
        }

        return new ResponseEntity(new GetSurveyResultRes(result, layout), HttpStatus.OK);
    }

    public static class GetSurveyResultReqBody {
        public String resultId;

        public GetSurveyResultReqBody(String resultId) {
            this.resultId = resultId;
        }

        public String getResultId() {
            return resultId;
        }

        public void setResultId(String resultId) {
            this.resultId = resultId;
        }
    }

    public static class GetSurveyResultRes {
        private SurveyResultEntity surveyresult;
        private Object clientLayout;

        public GetSurveyResultRes(SurveyResultEntity surveyresult, Object clientLayout) {
            this.surveyresult = surveyresult;
            this.clientLayout = clientLayout;
        }

        public SurveyResultEntity getSurveyresult() {
            return surveyresult;
        }

        public void setSurveyresult(SurveyResultEntity surveyresult) {
            this.surveyresult = surveyresult;
        }

        public Object getClientLayout() {
            return clientLayout;
        }

        public void setClientLayout(Object clientLayout) {
            this.clientLayout = clientLayout;
        }
    }
}
