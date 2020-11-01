package com.devlogs.apolo.osg.domain.entity;

public class SurveyQuestionEntity {
    private String question;
    private String id;
    private String surveyId;
    private String[] answer;

    public SurveyQuestionEntity(String question, String id, String surveyId, String[] answer) {
        this.question = question;
        this.id = id;
        this.surveyId = surveyId;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getId() {
        return id;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public String[] getAnswer() {
        return answer;
    }
}