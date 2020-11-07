package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "servicio", schema = "public")
@Getter
@Setter
public class Servicio {

    @Id
    @SequenceGenerator(name = "servicio_id_seq", sequenceName = "servicio_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "servicio_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", unique = true)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "camas_disponibles")
    private Integer camasDisponibles;

    @Column(name = "camas_ocupadas")
    private Integer camasOcupadas;
}