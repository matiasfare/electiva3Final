package com.github.electica3Final.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoDTO {

    private long id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String ciudad;
    private String telefono;
}
