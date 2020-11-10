package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.QuickQuestionDao;
import com.devlogs.apolo.osg.domain.entity.QuickQuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllQuickQuestionService {
    private QuickQuestionDao mQuickQuestionDao;

    @Autowired
    public GetAllQuickQuestionService (@Qualifier("QuickQuestionDaoImp") QuickQuestionDao quickQuestionDao) {
        mQuickQuestionDao = quickQuestionDao;
    }

    public List<QuickQuestionEntity> execute () {
        return mQuickQuestionDao.getAllQuickQuestion();
    }
}
