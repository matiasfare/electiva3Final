package com.github.electica3Final.repository;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HospitalRepository extends JpaRepository<Hospital, HospitalDTO> {

    Hospital findByCodHospital(String codHospital);

    List<Hospital> findAll();
}
