package com.devlogs.apolo.osg.dao.model;

public class Survey {
    private String id;
    private String name;
    private String description;
    private String topicId;
    private int numberOfQuestion;

    public Survey(String id, String name, String description, String topicId, int numOfQuestion) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topicId = topicId;
        this.numberOfQuestion = numOfQuestion;
    }

    public int getNumOfQuestion() {
        return numberOfQuestion;
    }

    public String getDescription() {
        return description;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
