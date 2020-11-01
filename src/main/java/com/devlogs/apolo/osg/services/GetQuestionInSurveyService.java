package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyQuestionDao;
import com.devlogs.apolo.osg.domain.entity.SurveyQuestionEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetQuestionInSurveyService {
    private SurveyQuestionDao mQuestionDao;

    GetQuestionInSurveyService (@Qualifier("MemorySurveyQuestionDaoImp") SurveyQuestionDao surveyQuestionDao) {
        mQuestionDao = surveyQuestionDao;
    }

    public List<SurveyQuestionEntity> execute (String surveyId) {
        return mQuestionDao.getAllQuestionInSurvey(surveyId);
    }
}
