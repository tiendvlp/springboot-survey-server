package com.devlogs.apolo.osg.dao;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import com.devlogs.apolo.osg.domain.entity.StatusEntity;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository("StatusDaoImp")
public class StatusDaoImp implements StatusDao {
    private MongoDatabase mMongoDatabase ;

    public StatusDaoImp () {
        mMongoDatabase = MongodbConfig.getDatabase();
    }

    @Override
    public int addNewStatus(String type, String content) {
        Document newResultDocument = new org.bson.Document()
                .append("type", type)
                .append("content", content);

        BsonValue b = MongodbConfig.getDatabase().getCollection("status").insertOne(newResultDocument).getInsertedId();

        if (b == null || b.isNull()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public List<StatusEntity> getAllStatus() {
       Iterator<Document> bunchOfStatus = mMongoDatabase.getCollection("status").find().iterator();
       List<StatusEntity> result = new ArrayList();
       Document doc;
       while (bunchOfStatus.hasNext()) {
           doc = bunchOfStatus.next();
            result.add(new StatusEntity(doc.getObjectId("_id").toString(),doc.getString("type"), doc.getString("content")));
       }
       return result;
    }

    @Override
    public StatusEntity getStatus(String id) {
        ObjectId objId= new ObjectId(id);
        Document myDoc = mMongoDatabase.getCollection("status").find(Filters.eq("_id", objId)).first();

        return new StatusEntity(myDoc.getString("_id"), myDoc.getString("type"), myDoc.getString("content"));
    }
}
