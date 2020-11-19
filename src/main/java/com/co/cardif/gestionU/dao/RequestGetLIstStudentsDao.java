package com.co.cardif.gestionU.dao;

import com.co.cardif.gestionU.models.dto.ResponseListStudentsDto;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface RequestGetLIstStudentsDao {
    @SqlQuery("SELECT * FROM ESTUDIANTE;")
    @RegisterBeanMapper(ResponseListStudentsDto.class)
    List<ResponseListStudentsDto> getListStudents();
}
