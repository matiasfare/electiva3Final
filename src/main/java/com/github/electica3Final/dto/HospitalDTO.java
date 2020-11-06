package com.github.electica3Final.dto;


public class HospitalDTO {

    private long codHospital;
    private String nombre;
    private String ciudad;
    private String telefono;
    private int idDirector;

    public long getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(long codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }
}
