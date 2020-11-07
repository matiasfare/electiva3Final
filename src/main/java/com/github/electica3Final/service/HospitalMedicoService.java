package com.github.electica3Final.service;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.HospitalMedicoDTO;
import com.github.electica3Final.entities.HospitalMedico;

import java.util.List;

public interface HospitalMedicoService {

    List<HospitalMedicoDTO> getByidMedico(Long idMedico);

    List<HospitalMedicoDTO> getByIdHospital(Long idHospital);

    List<HospitalMedicoDTO> getByIdHospitalIdMedico(Long idHospital, Long idMedico);

    List<HospitalMedicoDTO> getAll();

    HospitalMedicoDTO save(HospitalMedicoDTO HospitalMedicoDTO);
}
