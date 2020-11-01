package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.model.SurveyTopic;
import com.devlogs.apolo.osg.domain.entity.SurveyTopicEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("MemorySurveyTopicDaoImp")
public class MemorySurveyTopicDaoImp implements SurveyTopicDao {
    public List<SurveyTopic> db = Arrays.asList(
            new SurveyTopic("8291", "Students'personalities", "We’re trying to improve the way our teachers interact with you"),
            new SurveyTopic("7121", "Food", "We’re trying to improve the price"),
            new SurveyTopic("7672", "Facilities", "We know wifi is too slow"),
            new SurveyTopic("7673", "Students'health", "We're developing a new study online program")

    );


    @Override
    public List<SurveyTopicEntity> getAllTopic() {
        ArrayList<SurveyTopicEntity> result = new ArrayList();

        for (SurveyTopic surveyTopic : db) {
            result.add(new SurveyTopicEntity(surveyTopic.getId(), surveyTopic.getTitle(), surveyTopic.getProgress()));
        }

        return result;
    }
}
