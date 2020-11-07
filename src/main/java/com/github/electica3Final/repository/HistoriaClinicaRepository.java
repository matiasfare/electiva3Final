package com.github.electica3Final.repository;

import com.github.electica3Final.dto.HistoriaClinicaDTO;
import com.github.electica3Final.entities.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, HistoriaClinicaDTO> {

    HistoriaClinica findById(Long id);

    List<HistoriaClinica> findAll();

    List<HistoriaClinica> findByIdPaciente(Long idPaciente);

    List<HistoriaClinica> findByIdPacienteAndIdConsulta(Long idPaciente, Long idConsulta);

    List<HistoriaClinica> findByIdConsulta(Long idConsulta);
}
