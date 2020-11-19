package com.co.cardif.gestionU.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseListCollageDto {
    private String idUniversidad;
    private String nomUniversidad;

    @JsonProperty("ID_UNIVERSIDAD")
    public String getIDUniversidad() { return idUniversidad; }
    @JsonProperty("ID_UNIVERSIDAD")
    public void setIDUniversidad(String value) { this.idUniversidad = value; }

    @JsonProperty("NOM_UNIVERSIDAD")
    public String getNomUniversidad() { return nomUniversidad; }
    @JsonProperty("NOM_UNIVERSIDAD")
    public void setNomUniversidad(String value) { this.nomUniversidad = value; }
}
