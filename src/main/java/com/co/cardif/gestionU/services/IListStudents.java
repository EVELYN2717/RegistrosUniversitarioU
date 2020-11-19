package com.co.cardif.gestionU.services;

import com.co.cardif.gestionU.models.dto.ResponseListStudentsDto;

import java.util.List;

public interface IListStudents {
    List<ResponseListStudentsDto> getListStudents();
}
