package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import com.devlogs.apolo.osg.domain.entity.SurveyResultEntity;
import com.devlogs.apolo.osg.services.surveyservices.DocumentConvertible;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository("MongoSurveyResultDaoImp")
public class MongoSurveyResultDaoImp implements SurveyResultDao {
    private MongoDatabase mDatabase;

    public MongoSurveyResultDaoImp () {
        mDatabase = MongodbConfig.getDatabase();
    }

    @Override
    public String saveSurveyResult(String surveyId, String userEmail, DocumentConvertible resultDetail) {
        Document newSurveyResultDoc = new Document()
                .append("surveyId", surveyId)
                .append("userEmail", userEmail)
                .append("resultDetail", resultDetail.toDocument());

        BsonValue value = mDatabase.getCollection("surveyresult").insertOne(newSurveyResultDoc).getInsertedId();

        if (!value.asObjectId().isNull()) {
            System.out.println("Publish result success: " + value.asObjectId().getValue().toHexString());
            return value.asObjectId().getValue().toHexString();
        }
        return "";
    }

    @Override
    public SurveyResultEntity getSurveyResultByid(String surveyResultId) {
        Document doc = MongodbConfig.getDatabase().getCollection("surveyresult")
                .find(Filters.eq("_id", new ObjectId(surveyResultId)))
                .first();
        Object surveyResultDetail = doc.getOrDefault("resultDetail", null);

        return new SurveyResultEntity(doc.getObjectId("_id").toHexString(),
                doc.getString("surveyId"),
                doc.getString("userEmail"),
                doc.getOrDefault("resultDetail", null));
    }

    @Override
    public long removeSurveyResult(String ownerEmail, String surveyId) {
        BasicDBObject query = new BasicDBObject();
        query.put("userEmail", ownerEmail);
        query.put("surveyId", surveyId);
        DeleteResult result = MongodbConfig.getDatabase().getCollection("surveyresult").deleteMany(query);
        return 1;
    }
}
