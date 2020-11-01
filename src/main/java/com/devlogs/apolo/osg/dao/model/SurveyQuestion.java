package com.devlogs.apolo.osg.dao.model;

public class SurveyQuestion {
    private String id;
    private String question;
    private String[] answer;


    public SurveyQuestion(String id, String question, String[] answer, String surveyId) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.surveyId = surveyId;
    }

    private String surveyId;

    public String getSurveyId() {
        return surveyId;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswer() {
        return answer;
    }
}
