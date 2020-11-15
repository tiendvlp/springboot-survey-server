package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyResultDao;
import com.devlogs.apolo.osg.domain.entity.SurveyResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GetSurveyResultService {
    private SurveyResultDao mSurveyResultDao;

    @Autowired
    public GetSurveyResultService(@Qualifier("MongoSurveyResultDaoImp") SurveyResultDao surveyResultDao) {
        mSurveyResultDao = surveyResultDao;
    }

    public SurveyResultEntity execute (String id) {
       return mSurveyResultDao.getSurveyResultByid(id);
    }
}
