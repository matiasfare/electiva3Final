package com.github.electica3Final.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hospital", schema = "public")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private Long nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento", updatable = false)
    private Date fechaNacimiento;

}