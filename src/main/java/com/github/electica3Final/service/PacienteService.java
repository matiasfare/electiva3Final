package com.github.electica3Final.service;

import com.github.electica3Final.dto.PacienteDTO;

import java.util.List;

/**
 * @author jvillagra
 * 2020-09-01
 */
public interface PacienteService {
    /**
     * Guardar nuevo paciente
     * @param Paciente
     * @return
     */
    PacienteDTO savePaciente(PacienteDTO Paciente);

    /**
     * Encontrar fases por id
     * @param id
     * @return
     */
    PacienteDTO getById(Long id);

}
