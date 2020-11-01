package com.devlogs.apolo.osg;

import com.devlogs.apolo.osg.dao.common.MongodbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.security.GeneralSecurityException;

@SpringBootApplication
public class MySurveyApplication {

	public static void main(String[] args) throws GeneralSecurityException, IOException {
		MongodbConfig.connect();
		SpringApplication.run(MySurveyApplication.class, args);
	}

}


