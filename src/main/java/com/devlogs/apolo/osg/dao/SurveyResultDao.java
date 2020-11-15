package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.domain.entity.SurveyResultEntity;
import com.devlogs.apolo.osg.services.surveyservices.DocumentConvertible;

public interface SurveyResultDao {
    String saveSurveyResult (String surveyId, String userEmail, DocumentConvertible resultDetail);
    SurveyResultEntity getSurveyResultByid (String surveyResultId);
    long removeSurveyResult(String ownerEmail, String surveyId);
}
