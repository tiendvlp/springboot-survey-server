package com.devlogs.apolo.osg.services.surveyservices;

import com.devlogs.apolo.osg.services.surveyservices.mbti_result.MBTIResult;
import com.devlogs.apolo.osg.services.surveyservices.mbti_result.MBTIResultManager;
import java.util.Random;

public class MBTIService {
    private MBTIResultManager manager = new MBTIResultManager();

    public MBTIResult execute () {
        int resultRandom = Math.abs(new Random().nextInt()%16);
        System.out.println("resultRamdom" + resultRandom + "");
        return manager.results.get(resultRandom);
    }
}
