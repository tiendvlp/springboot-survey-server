package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.domain.entity.SurveyEntity;

import java.util.List;

public interface SurveyDao {
    SurveyEntity getSurveyById (String id);
    List<SurveyEntity> getAllSurvey ();
}
