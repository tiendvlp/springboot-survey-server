package com.devlogs.apolo.osg.dao;


import com.devlogs.apolo.osg.domain.entity.StatusEntity;

import java.util.List;

public interface StatusDao {
    int addNewStatus (String type, String content);
    List<StatusEntity> getAllStatus ();
    StatusEntity getStatus (String id);
}
