package com.github.electica3Final.repository;

import com.github.electica3Final.dto.MedicoServicioDTO;
import com.github.electica3Final.entities.MedicoServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MedicoServicioRepository extends JpaRepository<MedicoServicio,MedicoServicioDTO> {

    MedicoServicio findById(Long id);

    List<MedicoServicio> findAll();

    List<MedicoServicio> findByIdServicio(Long idServicio);

    List<MedicoServicio> findByIdMedicoAndIdServicio(Long idMedico, Long idServicio);

    List<MedicoServicio> findByIdMedico(Long idMedico);
}
