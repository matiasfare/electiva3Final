package com.github.electica3Final.repository;

import com.github.electica3Final.dto.PacienteDTO;
import com.github.electica3Final.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Component
public interface PacienteRepository extends JpaRepository<Paciente, PacienteDTO> {

    Paciente findById(Long id);

    List<Paciente> findAll();


    //@Transactional
    //@Modifying
    //@Query(value = "DELETE FROM public.paciente WHERE id= :id", nativeQuery = true)
    //void deleteById(@Param("id") Long id);
}
