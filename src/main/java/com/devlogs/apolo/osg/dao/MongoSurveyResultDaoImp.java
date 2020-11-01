package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.Arrays;


@Repository("MongoSurveyResultDaoImp")
public class MongoSurveyResultDaoImp implements SurveyResultDao {
    private MongoDatabase mMongoDatabase ;

    MongoSurveyResultDaoImp () {
        mMongoDatabase = MongodbConfig.getDatabase();
    }

    @Override
    public int insertNewResult(SurveyResult surveyResult) {
        Document newResultDocument = new org.bson.Document()
                .append("ownerEmail", surveyResult.getOwnerEmail())
                .append("ownerName", surveyResult.getOwnerName())
                .append("surveyId", surveyResult.getSurveyId())
                .append("answer", Arrays.asList(1,2,3,1,2))
                .append("ownerPicture", surveyResult.getOwnerPictureUrl())
                .append("campus", surveyResult.getCampus())
                .append("admission", surveyResult.getAdmission());

        BsonValue b = MongodbConfig.getDatabase().getCollection("surveyresult").insertOne(newResultDocument).getInsertedId();

        if (b != null && b.isNull()) {
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
        DeleteResult result = MongodbConfig.getDatabase().getCollection("surveyresult").deleteMany(query);
        return 1;
    }
}
