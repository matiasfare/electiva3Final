package com.github.electica3Final.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalDTO {

    private Long codHospital;
    private String nombre;
    private String ciudad;
    private String telefono;
    private Long idDirector;
    private String descripcion;
}
