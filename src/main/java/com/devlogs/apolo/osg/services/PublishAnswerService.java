package com.devlogs.apolo.osg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishAnswerService {

    @Autowired
    PublishAnswerService() {

    }

    public int execute (String ownerEmail, String ownerName,  String surveyId, int[] answer) {

        return 0;
    }
}