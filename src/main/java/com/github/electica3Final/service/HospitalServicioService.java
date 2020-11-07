package com.github.electica3Final.service;

import com.github.electica3Final.dto.HospitalServicioDTO;

import java.util.List;

public interface HospitalServicioService {

    List<HospitalServicioDTO> getByidServicio(Long idServicio);

    List<HospitalServicioDTO> getByIdHospital(Long idHospital);

    List<HospitalServicioDTO> getByIdHospitalIdServicio(Long idHospital, Long idServicio);

    List<HospitalServicioDTO> getAll();

    HospitalServicioDTO save(HospitalServicioDTO HospitalServicioDTO);
}
