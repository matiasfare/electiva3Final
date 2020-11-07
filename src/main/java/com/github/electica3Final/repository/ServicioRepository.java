package com.github.electica3Final.repository;

import com.github.electica3Final.dto.ServicioDTO;
import com.github.electica3Final.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ServicioRepository extends JpaRepository<Servicio, ServicioDTO> {

    List<Servicio> findAll();

    Servicio findById(Long id);
}
