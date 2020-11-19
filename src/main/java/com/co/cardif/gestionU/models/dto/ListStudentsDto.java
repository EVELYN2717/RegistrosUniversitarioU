package com.co.cardif.gestionU.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListStudentsDto {
    private ResponseListStudentsDto[] response;

    @JsonProperty("response")
    public ResponseListStudentsDto[] getResponse() { return response; }
    @JsonProperty("response")
    public void setResponse(ResponseListStudentsDto[] value) { this.response = value; }

}
