package com.github.electica3Final.repository;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MedicoRepository extends JpaRepository<Medico, MedicoDTO> {

    Medico findById(Long id);

    List<Medico> findAll();

}
