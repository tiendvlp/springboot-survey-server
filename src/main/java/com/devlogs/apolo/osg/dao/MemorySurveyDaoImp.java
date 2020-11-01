package com.devlogs.apolo.osg.dao;


import com.devlogs.apolo.osg.dao.common.*;
import com.devlogs.apolo.osg.dao.model.Survey;
import com.devlogs.apolo.osg.domain.entity.SurveyEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("MemorySurveyDaoImp")
public class MemorySurveyDaoImp implements SurveyDao {
    private ArrayList<Survey> surveys = new ArrayList();

    MemorySurveyDaoImp() {
        SurveyMbtiSpawn mbti = new SurveyMbtiSpawn();
        SurveyDASS21Spawn dass = new SurveyDASS21Spawn();
        SurveyHealthSpawn health = new SurveyHealthSpawn();
        SevenElevenSurveySpawn sevenEleven = new SevenElevenSurveySpawn();
        FacilitiesSurveySpawn facilitiesSurveySpawn = new FacilitiesSurveySpawn();

        surveys.add(new Survey(mbti.id, mbti.name, mbti.desciption, mbti.topicId, mbti.questions.length));
        surveys.add(new Survey(dass.id, dass.name, dass.description, dass.topicId, dass.questions.length));
        surveys.add(new Survey(health.id, health.title, health.description, health.topicId, health.questions.length));
        surveys.add(new Survey(sevenEleven.id, sevenEleven.title, sevenEleven.description, sevenEleven.topicId, sevenEleven.questions.length));
        surveys.add(new Survey(facilitiesSurveySpawn.id, facilitiesSurveySpawn.title, facilitiesSurveySpawn.description, facilitiesSurveySpawn.topicId, facilitiesSurveySpawn.questions.length));
    }

    @Override
    public SurveyEntity getSurveyById(String id) {
        Survey survey;
        for (int i = 0; i < surveys.size(); i++) {
            survey = surveys.get(i);
            if (survey.getId().equals(id)) {
                return new SurveyEntity(survey.getId(), survey.getName(), survey.getDescription(), survey.getTopicId(), survey.getNumOfQuestion());
            }
        }
        return null;
    }

    @Override
    public List<SurveyEntity> getAllSurvey() {
        ArrayList<SurveyEntity> result = new ArrayList();
        Survey survey;
        for (int i = 0; i < surveys.size(); i++) {
            survey = surveys.get(i);
            result.add(new SurveyEntity(survey.getId(),survey.getName(), survey.getDescription(), survey.getTopicId(), survey.getNumOfQuestion()));
        }
        return result;
    }
}