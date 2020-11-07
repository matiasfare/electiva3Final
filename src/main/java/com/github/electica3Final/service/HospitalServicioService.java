package com.github.electica3Final.service;

import com.github.electica3Final.dto.HospitalServicioDTO;

import java.util.List;

public interface HospitalServicioService {

    int getCamasByHospital(Long codHospital);

    int getCamasByServicio(Long idServicio);

    List<HospitalServicioDTO> getAll();

    HospitalServicioDTO save(HospitalServicioDTO HospitalServicioDTO);
}
