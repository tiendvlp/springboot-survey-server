package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.springframework.stereotype.Repository;


@Repository("MongoSurveyAnswerDaoImp")
public class MongoSurveyAnswerDaoImp implements SurveyAnswerDao {
    private MongoDatabase mMongoDatabase ;

    MongoSurveyAnswerDaoImp() {
        mMongoDatabase = MongodbConfig.getDatabase();
    }

    @Override
    public int insertNewResult(SurveyResult surveyResult) {
        Document newResultDocument = new org.bson.Document()
                .append("ownerEmail", surveyResult.getOwnerEmail())
                .append("ownerName", surveyResult.getOwnerName())
                .append("surveyId", surveyResult.getSurveyId())
                .append("answer", surveyResult.getAnswer())
                .append("ownerPicture", surveyResult.getOwnerPictureUrl())
                .append("campus", surveyResult.getCampus())
                .append("admission", surveyResult.getAdmission());

        BsonValue b = MongodbConfig.getDatabase().getCollection("surveyanswer").insertOne(newResultDocument).getInsertedId();

        if (b.isNull()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public long removeSurveyResult(String ownerEmail, String surveyId) {
        BasicDBObject query = new BasicDBObject();
        query.put("ownerEmail", ownerEmail);
        query.put("surveyId", surveyId);
        DeleteResult result = MongodbConfig.getDatabase().getCollection("surveyanswer").deleteMany(query);
        return 1;
    }
}
