package com.github.electica3Final.repository;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.entities.HospitalServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HospitalServicioRepository extends JpaRepository<HospitalServicio, HospitalServicioDTO> {

    HospitalServicio findById(Long id);

    List<HospitalServicio> findAll();

    List<HospitalServicio> findByIdServicio(Long idServicio);
}
