package com.github.electica3Final.service;

import com.github.electica3Final.dto.MedicoServicioDTO;

import java.util.List;

public interface MedicoServicioService {

    List<MedicoServicioDTO> getByidServicio(Long idServicio);

    List<MedicoServicioDTO> getByIdMedico(Long idMedico);

    List<MedicoServicioDTO> getByIdMedicoIdServicio(Long idMedico, Long idServicio);

    List<MedicoServicioDTO> getAll();

    MedicoServicioDTO save(MedicoServicioDTO MedicoServicioDTO);
}
