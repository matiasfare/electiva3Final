package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "consulta_medica", schema = "public")
@Getter
@Setter
public class ConsultaMedica {

    @Id
    @SequenceGenerator(name = "consulta_medica_id_seq", sequenceName = "consulta_medica_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "consulta_medica_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "paciente")
    private Long paciente;

    @Column(name = "hospital")
    private Long hospital;

    @Column(name = "medico")
    private Long medico;

    //fecha con hora por eso se utiliza LocalDateTime
    @Column(name = "fecha_hora")
    private Date fecha;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "servicio")
    private Long servicio;

    @Column(name = "reposo")
    private Boolean reposo;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "peso")
    private Double peso;




}