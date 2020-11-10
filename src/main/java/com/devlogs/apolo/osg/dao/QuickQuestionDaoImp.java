package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import com.devlogs.apolo.osg.domain.entity.QuickQuestionEntity;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("QuickQuestionDaoImp")
public class QuickQuestionDaoImp implements QuickQuestionDao{
    private MongoDatabase mMongodb;

    public QuickQuestionDaoImp () {
        mMongodb = MongodbConfig.getDatabase();
    }

    @Override
    public int addNewQuickQuestion(String question, List<String> answer) {
        Document quickQuestionDoc = new org.bson.Document()
                .append("answer", answer)
                .append("question", question)
                // For user to answer there question
                .append("userAnswer", List.of(Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));

        BsonValue result = mMongodb.getCollection("quickquestion").insertOne(quickQuestionDoc).getInsertedId();

        if (result == null || result.isNull()) {
            return 0;
        }

        return 1;
    }

    @Override
    public List<QuickQuestionEntity> getAllQuickQuestion() {
        Iterator<Document> bunchOfQuickQuestion = mMongodb.getCollection("quickquestion").find().iterator();

        Document quickQuestionDoc;

        List<QuickQuestionEntity> result = new ArrayList();

        while (bunchOfQuickQuestion.hasNext()) {
            quickQuestionDoc = bunchOfQuickQuestion.next();
            result.add(new QuickQuestionEntity(quickQuestionDoc.getObjectId("_id").toString(), quickQuestionDoc.getString("question"), quickQuestionDoc.getList("answer", String.class), quickQuestionDoc.getList("userAnswer", List.class)));
        }

        return result;
    }

    @Override
    public int addNewQuickQuestionAnswer(String questionId, int answerOrder, String email) {
        Document quickQuestionDoc = mMongodb.getCollection("quickquestion").find(Filters.eq("_id", new ObjectId(questionId))).first();

        List<List> answer = quickQuestionDoc.getList("userAnswer", List.class);

        List listOfUserVoted = answer.get(answerOrder);
        listOfUserVoted.add(email);

        answer.set(answerOrder, listOfUserVoted);

        UpdateResult result = mMongodb.getCollection("quickquestion").updateOne(Filters.eq("_id", new ObjectId(questionId)), new BasicDBObject("$set", new BasicDBObject("userAnswer", answer)));

        if (result == null || result.getMatchedCount() == 0) {
            return 0;
        }
        return 1;
    }
}
