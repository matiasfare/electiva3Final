package com.github.electica3Final.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PacienteDTO {
    private long id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
}
