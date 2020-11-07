package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.ConsultaMedicaDTO;
import com.github.electica3Final.entities.ConsultaMedica;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ConsultaMedicaMapper implements BaseMapper<ConsultaMedica, ConsultaMedicaDTO>{

    private final OrikaBeanMapper mapper;

    public ConsultaMedicaMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<ConsultaMedicaDTO> mapAsList(List<ConsultaMedica> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ConsultaMedicaDTO mapToDto(ConsultaMedica entity) {
        return mapper.map(entity, ConsultaMedicaDTO.class);
    }

    @Override
    public ConsultaMedica mapToEntity(ConsultaMedicaDTO dto) {
        return mapper.map(dto, ConsultaMedica.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
