package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.QuickQuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddNewQuickQuestionService {
    private QuickQuestionDao mQuickQuestionDao;

    @Autowired
    public AddNewQuickQuestionService (@Qualifier("QuickQuestionDaoImp") QuickQuestionDao quickQuestionDao) {
        mQuickQuestionDao = quickQuestionDao;
    }

    public int execute (String question, List<String> answer) {
        return mQuickQuestionDao.addNewQuickQuestion(question, answer);
    }
}
