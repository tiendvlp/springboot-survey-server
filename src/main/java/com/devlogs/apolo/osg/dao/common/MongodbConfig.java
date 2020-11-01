package com.devlogs.apolo.osg.dao.common;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongodbConfig {

    private static MongoDatabase database;

    public static void connect () {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://tiendvlp:tiendeveloper@cluster0.8yq3x.mongodb.net/survey?retryWrites=true&w=majority");
        database = mongoClient.getDatabase("survey");
    }

    public static MongoDatabase getDatabase () {
        return database;
    }
}
