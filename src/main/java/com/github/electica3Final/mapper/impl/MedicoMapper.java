package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.entities.Medico;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class MedicoMapper implements BaseMapper<Medico, MedicoDTO>{

    private final OrikaBeanMapper mapper;

    public MedicoMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<MedicoDTO> mapAsList(List<Medico> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MedicoDTO mapToDto(Medico entity) {
        return mapper.map(entity, MedicoDTO.class);
    }

    @Override
    public Medico mapToEntity(MedicoDTO dto) {
        return mapper.map(dto, Medico.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
