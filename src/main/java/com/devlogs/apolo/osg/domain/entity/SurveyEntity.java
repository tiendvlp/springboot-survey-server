package com.devlogs.apolo.osg.domain.entity;

public class SurveyEntity {
    private String id;
    private String name;
    private String description;
    private String topicId;
    private int numberOfQuestion;

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public SurveyEntity(String id, String name, String description, String topicId, int numberOfQuestion) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topicId = topicId;
        this.numberOfQuestion = numberOfQuestion;
    }

    public String getTopicId() {
        return topicId;
    }


    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
