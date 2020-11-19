package com.co.cardif.gestionU.services.impl;


import com.co.cardif.gestionU.dao.RequestGetLIstStudentsDao;
import com.co.cardif.gestionU.models.dto.ListStudentsDto;
import com.co.cardif.gestionU.models.dto.ResponseListStudentsDto;
import com.co.cardif.gestionU.services.IListStudents;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class ListStudentsImpl implements IListStudents {

    private static final Logger logger = LoggerFactory.getLogger(ListStudentsImpl.class);

    @Autowired
    private Jdbi jdbi;

    @Override
    public List<ResponseListStudentsDto> getListStudents() {
        logger.info("Getting LIST STUDENTS");
        List<ResponseListStudentsDto> response = jdbi.withExtension(RequestGetLIstStudentsDao.class, dao -> dao.getListStudents());
        return response;
    }
}
