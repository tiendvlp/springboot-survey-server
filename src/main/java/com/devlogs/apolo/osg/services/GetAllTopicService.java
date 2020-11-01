package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.SurveyTopicDao;
import com.devlogs.apolo.osg.domain.entity.SurveyTopicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllTopicService {
    private SurveyTopicDao mDao;

    @Autowired
    public GetAllTopicService (@Qualifier("MemorySurveyTopicDaoImp") SurveyTopicDao dao) {
        mDao = dao;
    }

    public List<SurveyTopicEntity> execute () {
        return mDao.getAllTopic();
    }

}
