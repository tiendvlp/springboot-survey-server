package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyResultDao;
import com.devlogs.apolo.osg.services.surveyservices.DocumentConvertible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SaveSurveyResultService {
    private SurveyResultDao mSurveyResultDao;

    @Autowired
    public SaveSurveyResultService(@Qualifier("MongoSurveyResultDaoImp") SurveyResultDao surveyResultDao) {
        mSurveyResultDao = surveyResultDao;
    }

    public String execute (String surveyId, String userEmail, DocumentConvertible resultDetail) {
            mSurveyResultDao.removeSurveyResult(userEmail, surveyId);
        return mSurveyResultDao.saveSurveyResult(surveyId, userEmail, resultDetail);
    }
}
