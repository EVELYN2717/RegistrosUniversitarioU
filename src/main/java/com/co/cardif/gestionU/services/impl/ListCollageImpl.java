package com.co.cardif.gestionU.services.impl;

import com.co.cardif.gestionU.dao.RequestGetListCollageDao;
import com.co.cardif.gestionU.models.dto.ResponseListCollageDto;
import com.co.cardif.gestionU.services.IListCollage;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListCollageImpl implements IListCollage {

    private static final Logger logger = LoggerFactory.getLogger(ListStudentsImpl.class);

    @Autowired
    private Jdbi jdbi;

    @Override
    public List<ResponseListCollageDto> getListCollage() {
        logger.info("Getting LIST COLLAGE");
        List<ResponseListCollageDto> response = jdbi.withExtension(RequestGetListCollageDao.class, dao -> dao.getListCollage());
        return response;
    }
}
