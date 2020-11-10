package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.StatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PushNewStatusService {
    private StatusDao mStatusDao;

    @Autowired
    public PushNewStatusService(@Qualifier("StatusDaoImp") StatusDao statusDao) {
        mStatusDao = statusDao;
    }


    public int execute (String type, String content) {
        return mStatusDao.addNewStatus(type, content);
    }



}


