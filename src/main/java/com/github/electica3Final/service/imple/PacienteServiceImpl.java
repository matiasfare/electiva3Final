package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.PacienteDTO;
import com.github.electica3Final.repository.PacienteRepository;
import com.github.electica3Final.mapper.impl.PacienteMapper;
import com.github.electica3Final.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteMapper mapper;

    @Override
    public PacienteDTO savePaciente(PacienteDTO paciente) {
        return mapper.mapToDto(pacienteRepository.save(mapper.mapToEntity(paciente)));
    }

    @Override
    public PacienteDTO getById(Long id){
        return mapper.mapToDto(pacienteRepository.findById(id));
    }

}
