package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.QuickQuestionDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PushQuickQuestionAnswerService {
    private QuickQuestionDao mQuickQuestionDao;

    public PushQuickQuestionAnswerService(@Qualifier("QuickQuestionDaoImp") QuickQuestionDao quickQuestionDao) {
        mQuickQuestionDao = quickQuestionDao;
    }

    public int execute (String questionId, int answerOrder, String email) {
        return mQuickQuestionDao.addNewQuickQuestionAnswer(questionId, answerOrder, email);
    }
}
