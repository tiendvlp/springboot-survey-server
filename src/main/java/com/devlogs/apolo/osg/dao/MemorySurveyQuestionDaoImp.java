package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.*;
import com.devlogs.apolo.osg.dao.model.SurveyQuestion;
import com.devlogs.apolo.osg.domain.entity.SurveyQuestionEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("MemorySurveyQuestionDaoImp")
public class MemorySurveyQuestionDaoImp implements SurveyQuestionDao{
    private ArrayList<SurveyQuestion> db = new ArrayList();

    MemorySurveyQuestionDaoImp () {
        SurveyMbtiSpawn mbti = new SurveyMbtiSpawn();

        for (int i = 0; i < mbti.questions.length; i++) {
            db.add(new SurveyQuestion(i+"", mbti.questions[i].question, mbti.questions[i].answers, mbti.id));
        }

        SurveyDASS21Spawn dass = new SurveyDASS21Spawn();

        for (int i = 0; i < dass.questions.length; i++) {
            db.add(new SurveyQuestion((i + mbti.questions.length)+"", dass.questions[i].question, dass.questions[i].answers, dass.id));
        }

        SurveyHealthSpawn health = new SurveyHealthSpawn();

        for (int i = 0; i < health.questions.length; i++) {
            db.add(new SurveyQuestion((i + dass.questions.length)+"", health.questions[i].question, health.questions[i].answers, health.id));
        }

        FacilitiesSurveySpawn facilities = new FacilitiesSurveySpawn();

        for (int i = 0; i < facilities.questions.length; i++) {
            db.add(new SurveyQuestion((i + health.questions.length)+"", facilities.questions[i].question, facilities.questions[i].answers, facilities.id));
        }


        SevenElevenSurveySpawn sevenEleven = new SevenElevenSurveySpawn();

        for (int i = 0; i < sevenEleven.questions.length; i++) {
            db.add(new SurveyQuestion((i + facilities.questions.length)+"", sevenEleven.questions[i].question, sevenEleven.questions[i].answers, sevenEleven.id));
        }
    }

    @Override
    public List<SurveyQuestionEntity> getAllQuestionInSurvey(String surveyId) {
        ArrayList<SurveyQuestionEntity> result = new ArrayList();
        SurveyQuestion surveyQuestion;
        for (int i = 0; i < db.size(); i++) {
            surveyQuestion = db.get(i);
            if (surveyQuestion.getSurveyId().equals(surveyId)) {
                result.add(new SurveyQuestionEntity(surveyQuestion.getQuestion(), surveyQuestion.getId(), surveyQuestion.getSurveyId(),surveyQuestion.getAnswer()));
            }
        }
        return result;
    }
}
