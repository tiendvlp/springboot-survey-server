package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyDao;
import com.devlogs.apolo.osg.domain.entity.SurveyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GetSurveyByIdService {
    private SurveyDao mSurveyDao;

    @Autowired
    GetSurveyByIdService (@Qualifier("MemorySurveyDaoImp") SurveyDao surveyDao) {
        mSurveyDao = surveyDao;
    }

    public SurveyEntity execute (String surveyId) {
        return mSurveyDao.getSurveyById(surveyId);
    }
}
