package com.devlogs.apolo.osg.dao.model;

public class SurveyResult extends org.bson.Document {
    private String id;
    private String ownerEmail;
    private String ownerName;
    private String surveyId;
    private int[] answer;

    public SurveyResult(String ownerEmail, String ownerName, String surveyId, int[] answer) {
        this.ownerEmail = ownerEmail;
        this.ownerName = ownerName;
        this.surveyId = surveyId;
        this.answer = answer;
        append("ownerEmail", ownerEmail);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }
}
