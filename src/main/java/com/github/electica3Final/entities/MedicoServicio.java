package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "medico_servicio", schema = "public")
@Getter
@Setter
public class MedicoServicio {

    @Id
    @SequenceGenerator(name = "medico_servicio_id_seq", sequenceName = "medico_servicio_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "medico_servicio_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "id_medico")
    private Long idMedico;

    @Column(name = "id_servicio")
    private Long idServicio;

}