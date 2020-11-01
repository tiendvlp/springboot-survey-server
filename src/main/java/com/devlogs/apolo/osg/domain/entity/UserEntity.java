package com.devlogs.apolo.osg.domain.entity;

public class UserEntity {
    private String id;
    private String ownerEmail;
    private String ownerName;
    private String surveyId;
    private int[] answer;

    public UserEntity(String id, String ownerEmail, String ownerName, String surveyId, int[] answer) {
        this.ownerEmail = ownerEmail;
        this.ownerName = ownerName;
        this.surveyId = surveyId;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public int[] getAnswer() {
        return answer;
    }
}
