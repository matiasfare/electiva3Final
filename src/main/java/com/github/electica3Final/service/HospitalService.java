package com.github.electica3Final.service;

import com.github.electica3Final.dto.HospitalDTO;

import java.util.List;

public interface HospitalService {
    /**
     * Guardar nuevo Hospital
     * @param hospital
     * @return
     */
    HospitalDTO saveHospital(HospitalDTO hospital);
    

    /**
     * Encontrar medico por id
     * @param codHospital
     * @return
     */
    HospitalDTO getByCodHospital(Long codHospital);

    /**
     * Encontrar medico por id
     * @return
     */
    List<HospitalDTO> getAllHospital();

}
