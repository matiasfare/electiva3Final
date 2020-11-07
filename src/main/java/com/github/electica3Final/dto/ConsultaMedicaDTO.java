package com.github.electica3Final.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class ConsultaMedicaDTO {

    private Long id;
    private Long paciente;
    private Long hospital;
    private Long medico;
    private Date fecha;
    private String diagnostico;
    private Long servicio;
    private Boolean reposo;
    private Integer edad;
    private Double altura;
    private Double peso;
}
