package com.github.electica3Final.service;

import com.github.electica3Final.dto.ConsultaMedicaDTO;

import java.util.List;

public interface ConsultaMedicaService {
    /**
     * Guardar nuevo ConsultaMedica
     * @param consultaMedica
     * @return
     */
    ConsultaMedicaDTO save(ConsultaMedicaDTO consultaMedica);
    

    /**
     * Encontrar medico por id
     * @param id
     * @return
     */
    ConsultaMedicaDTO getById(Long id);

    /**
     * Encontrar medico por id
     * @return
     */
    List<ConsultaMedicaDTO> getAllConsultaMedica();

}
