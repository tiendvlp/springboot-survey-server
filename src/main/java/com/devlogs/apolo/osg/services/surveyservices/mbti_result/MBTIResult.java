package com.devlogs.apolo.osg.services.surveyservices.mbti_result;

import com.devlogs.apolo.osg.services.surveyservices.DocumentConvertible;
import org.bson.Document;


public class MBTIResult implements DocumentConvertible {
    public  String result;
    public  String description;

    public MBTIResult (String result, String description) {
        this.result = result;
        this.description = description;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return result;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Document toDocument() {
        return new Document()
                .append("result", result)
                .append("description", description);
    }
}
