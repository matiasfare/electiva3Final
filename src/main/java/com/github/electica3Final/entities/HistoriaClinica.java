package com.github.electica3Final.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "historia_clinica", schema = "public")
@Getter
@Setter
public class HistoriaClinica {

    @Id
    @SequenceGenerator(name = "historia_clinica_id_seq", sequenceName = "historia_clinica_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "historia_clinica_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "id_paciente")
    private Long idPaciente;

    @Column(name = "id_consulta")
    private Long idConsulta;


}