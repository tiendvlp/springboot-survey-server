package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyDao;
import com.devlogs.apolo.osg.domain.entity.SurveyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllSurveyService {
    private SurveyDao mSurveyDao;

    @Autowired
    GetAllSurveyService (@Qualifier("MemorySurveyDaoImp") SurveyDao surveyDao) {
        mSurveyDao = surveyDao;
    }

    public List<SurveyEntity> execute () {
        return mSurveyDao.getAllSurvey();
    }
}
