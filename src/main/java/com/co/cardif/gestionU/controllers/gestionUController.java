package com.co.cardif.gestionU.controllers;

import com.co.cardif.gestionU.models.dto.ListStudentsDto;
import com.co.cardif.gestionU.models.dto.ResponseListStudentsDto;
import com.co.cardif.gestionU.services.IListStudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/gestionU")
public class gestionUController {


    @Autowired
    private IListStudents iListStudents;

    @GetMapping("/list-students")
    public ResponseEntity getListStudents(){
        List<ResponseListStudentsDto> listStudents =  iListStudents.getListStudents();
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }
}
