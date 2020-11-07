package com.github.electica3Final.service;

import com.github.electica3Final.dto.ServicioDTO;

import java.util.List;

public interface ServicioService {
    /**
     * Guardar nuevo Servicio
     * @param servicio
     * @return
     */
    ServicioDTO saveServicio(ServicioDTO servicio);
    

    /**
     * Encontrar medico por id
     * @param id
     * @return
     */
    ServicioDTO getById(Long id);

    /**
     * Encontrar medico por id
     * @return
     */
    List<ServicioDTO> getAllServicio();

}
