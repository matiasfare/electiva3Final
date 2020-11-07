package com.github.electica3Final.repository;

import com.github.electica3Final.dto.HospitalMedicoDTO;
import com.github.electica3Final.entities.HospitalMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HospitalMedicoRepository extends JpaRepository<HospitalMedico, HospitalMedicoDTO> {

    HospitalMedico findById(Long id);

    List<HospitalMedico> findAll();

    List<HospitalMedico> findByIdHospital(Long idHospital);

    List<HospitalMedico> findByIdHospitalAndIdMedico(Long idHospital, Long idMedico);

    List<HospitalMedico> findByIdMedico(Long idMedico);
}
