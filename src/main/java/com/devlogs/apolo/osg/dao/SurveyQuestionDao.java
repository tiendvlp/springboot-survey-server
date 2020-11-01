package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.domain.entity.SurveyQuestionEntity;

import java.util.List;

public interface SurveyQuestionDao {
    List<SurveyQuestionEntity> getAllQuestionInSurvey (String surveyId);
}
