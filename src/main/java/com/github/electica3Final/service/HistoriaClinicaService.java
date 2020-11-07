package com.github.electica3Final.service;

import com.github.electica3Final.dto.HistoriaClinicaDTO;

import java.util.List;

public interface HistoriaClinicaService {

    List<HistoriaClinicaDTO> getByidPaciente(Long idPaciente);

    List<HistoriaClinicaDTO> getByIdConsulta(Long idConsulta);

    List<HistoriaClinicaDTO> getByIdHospitalIdPaciente(Long idHospital, Long idPaciente);

    List<HistoriaClinicaDTO> getAll();

    HistoriaClinicaDTO save(HistoriaClinicaDTO HistoriaClinicaDTO);
}
