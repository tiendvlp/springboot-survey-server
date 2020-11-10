package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.domain.entity.QuickQuestionEntity;

import java.util.List;

public interface QuickQuestionDao {

    int addNewQuickQuestion (String question, List<String> answer);

    List<QuickQuestionEntity> getAllQuickQuestion ();

    int addNewQuickQuestionAnswer (String questionId, int answerOrder, String userEmail);

}
