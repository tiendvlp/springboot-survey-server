package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PublishResultWithOverrideService {
    private SurveyResultDao mSurveyResultDao;
    private GetSurveyByIdService mGetSurveyByIdService;

    @Autowired
    PublishResultWithOverrideService (@Qualifier("MongoSurveyResultDaoImp") SurveyResultDao dao, GetSurveyByIdService getSurveyByIdService) {
        mGetSurveyByIdService = getSurveyByIdService;
        mSurveyResultDao = dao;
    }

    public int execute (String ownerEmail, String ownerName,String pictureUrl, String campus, int admission, String surveyId, int[] answer) {
        if (mGetSurveyByIdService.execute(surveyId) == null) {
            return 0;
        }
        mSurveyResultDao.removeSurveyResult(ownerEmail, surveyId);
        return mSurveyResultDao.insertNewResult(new SurveyResultDao.SurveyResult(ownerEmail, ownerName,pictureUrl, campus, admission, surveyId, answer));
    }
}
