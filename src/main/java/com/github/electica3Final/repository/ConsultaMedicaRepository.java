package com.github.electica3Final.repository;

import com.github.electica3Final.dto.ConsultaMedicaDTO;
import com.github.electica3Final.entities.ConsultaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ConsultaMedicaRepository extends JpaRepository<ConsultaMedica, ConsultaMedicaDTO> {

    ConsultaMedica findById(Long id);

    List<ConsultaMedica> findAll();

}
