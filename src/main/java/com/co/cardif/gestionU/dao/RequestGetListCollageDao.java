package com.co.cardif.gestionU.dao;

import com.co.cardif.gestionU.models.dto.ResponseListCollageDto;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface RequestGetListCollageDao {

    @SqlQuery("SELECT * FROM UNIVERSIDAD;")
    @RegisterBeanMapper(ResponseListCollageDto.class)
    List<ResponseListCollageDto> getListCollage();


}
