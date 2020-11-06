package com.github.electica3Final.service;

import com.github.electica3Final.dto.MedicoDTO;

import java.util.List;

public interface MedicoService {
    /**
     * Guardar nuevo medico
     * @param medico
     * @return
     */
    MedicoDTO saveMedico(MedicoDTO medico);
    

    /**
     * Encontrar medico por id
     * @param id
     * @return
     */
    MedicoDTO getById(Long id);

    /**
     * Devuelve todos los medicos
     * @return
     */
    List<MedicoDTO> getAllMedicos();

}
