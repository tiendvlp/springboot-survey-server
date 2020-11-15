package com.devlogs.apolo.osg.domain.entity;

public class SurveyResultEntity {
    private String id;
    private String surveyId;
    private String userEmail;
    private Object resultDetail;


    public SurveyResultEntity(String id, String surveyId, String userEmail, Object resultDetail) {
        this.id = id;
        this.surveyId = surveyId;
        this.userEmail = userEmail;
        this.resultDetail = resultDetail;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Object getResultDetail() {
        return resultDetail;
    }

    public void setResultDetail(Object resultDetail) {
        this.resultDetail = resultDetail;
    }
}
