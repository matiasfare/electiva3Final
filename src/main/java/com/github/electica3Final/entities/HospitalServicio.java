package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hospital_servicio", schema = "public")
@Getter
@Setter
public class HospitalServicio {

    @Id
    @SequenceGenerator(name = "hospital_servicio_id_seq", sequenceName = "hospital_servicio_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "hospital_servicio_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "id_servicio")
    private Long idServicio;

    @Column(name = "cod_hospital")
    private Long codHospital;

    @Column(name = "total_camas")
    private Integer totalCamas;
}