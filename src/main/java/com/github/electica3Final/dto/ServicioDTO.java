package com.github.electica3Final.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicioDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private Integer totalCamas;
    private Integer camasDisponibles;
    private Integer camasOcupadas;
}
