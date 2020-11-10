package com.devlogs.apolo.osg.services;

import com.devlogs.apolo.osg.dao.StatusDao;
import com.devlogs.apolo.osg.domain.entity.StatusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllStatusService {
    private StatusDao mStatusDao;

    @Autowired
    public GetAllStatusService (@Qualifier("StatusDaoImp") StatusDao statusDao) {
        mStatusDao = statusDao;
    }

    public List<StatusEntity> execute () {
        return mStatusDao.getAllStatus();
    }


}
