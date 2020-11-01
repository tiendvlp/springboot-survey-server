package com.devlogs.apolo.osg.dao.model;

public class SurveyTopic {
    private String id;
    private String title;
    private String progress;

    public SurveyTopic(String id, String title, String progress) {
        this.id = id;
        this.title = title;
        this.progress = progress;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getProgress() {
        return progress;
    }
}
