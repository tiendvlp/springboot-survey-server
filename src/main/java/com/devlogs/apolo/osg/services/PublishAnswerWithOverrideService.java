package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyAnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishAnswerWithOverrideService {
    private SurveyAnswerDao mSurveyAnswerDao;
    private GetSurveyByIdService mGetSurveyByIdService;

    @Autowired
    PublishAnswerWithOverrideService(@Qualifier("MongoSurveyAnswerDaoImp") SurveyAnswerDao dao, GetSurveyByIdService getSurveyByIdService) {
        mGetSurveyByIdService = getSurveyByIdService;
        mSurveyAnswerDao = dao;
    }

    public int execute (String ownerEmail, String ownerName,String pictureUrl, String campus, int admission, String surveyId, List<Integer> answer) {
        if (mGetSurveyByIdService.execute(surveyId) == null) {
            return 0;
        }
        mSurveyAnswerDao.removeSurveyResult(ownerEmail, surveyId);
        return mSurveyAnswerDao.insertNewResult(new SurveyAnswerDao.SurveyResult(ownerEmail, ownerName,pictureUrl, campus, admission, surveyId, answer));
    }
}
