package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hospital_medico", schema = "public")
@Getter
@Setter
public class HospitalMedico {

    @Id
    @SequenceGenerator(name = "hospital_medico_id_seq", sequenceName = "hospital_medico_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "hospital_medico_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "id_medico")
    private Long idMedico;

    @Column(name = "id_hospital")
    private Long idHospital;

    @Column(name = "recide_hospital")
    private Boolean recideHospital;
}