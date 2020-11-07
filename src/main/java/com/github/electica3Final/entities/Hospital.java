package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hospital", schema = "public")
@Getter
@Setter
public class Hospital {

    @Id
    @Column(name = "cod_hospital", unique = true)
    private Long codHospital;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "id_director")
    private Long idDirector;

    @Column(name = "descripcion")
    private String descripcion;
}