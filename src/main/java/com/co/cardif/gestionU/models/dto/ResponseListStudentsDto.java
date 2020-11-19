package com.co.cardif.gestionU.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseListStudentsDto {
    private String idEstudiante;
    private String nombre;
    private String apellido;
    private String idUniversidad;
    private String fechaNacimiento;
    private String telefono;
    private String email;
    private String direccion;

    @JsonProperty("ID_ESTUDIANTE")
    public String getIDEstudiante() { return idEstudiante; }
    @JsonProperty("ID_ESTUDIANTE")
    public void setIDEstudiante(String value) { this.idEstudiante = value; }

    @JsonProperty("NOMBRE")
    public String getNombre() { return nombre; }
    @JsonProperty("NOMBRE")
    public void setNombre(String value) { this.nombre = value; }

    @JsonProperty("APELLIDO")
    public String getApellido() { return apellido; }
    @JsonProperty("APELLIDO")
    public void setApellido(String value) { this.apellido = value; }

    @JsonProperty("ID_UNIVERSIDAD")
    public String getIDUniversidad() { return idUniversidad; }
    @JsonProperty("ID_UNIVERSIDAD")
    public void setIDUniversidad(String value) { this.idUniversidad = value; }

    @JsonProperty("FECHA_NACIMIENTO")
    public String getFechaNacimiento() { return fechaNacimiento; }
    @JsonProperty("FECHA_NACIMIENTO")
    public void setFechaNacimiento(String value) { this.fechaNacimiento = value; }

    @JsonProperty("TELEFONO")
    public String getTelefono() { return telefono; }
    @JsonProperty("TELEFONO")
    public void setTelefono(String value) { this.telefono = value; }

    @JsonProperty("EMAIL")
    public String getEmail() { return email; }
    @JsonProperty("EMAIL")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("DIRECCION")
    public String getDireccion() { return direccion; }
    @JsonProperty("DIRECCION")
    public void setDireccion(String value) { this.direccion = value; }
}
