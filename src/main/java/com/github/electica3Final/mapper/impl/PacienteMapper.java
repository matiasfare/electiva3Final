package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.PacienteDTO;
import com.github.electica3Final.entities.Paciente;
import ma.glasnost.orika.MapperFacade;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import com.github.electica3Final.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PacienteMapper implements BaseMapper<Paciente, PacienteDTO>{

    private final OrikaBeanMapper mapper;

    public PacienteMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<PacienteDTO> mapAsList(List<Paciente> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public PacienteDTO mapToDto(Paciente entity) {
        return mapper.map(entity, PacienteDTO.class);
    }

    @Override
    public Paciente mapToEntity(PacienteDTO dto) {
        return mapper.map(dto, Paciente.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
