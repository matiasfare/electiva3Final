package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.MedicoServicioDTO;
import com.github.electica3Final.entities.MedicoServicio;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class MedicoServicioMapper implements BaseMapper<MedicoServicio, MedicoServicioDTO>{

    private final OrikaBeanMapper mapper;

    public MedicoServicioMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<MedicoServicioDTO> mapAsList(List<MedicoServicio> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MedicoServicioDTO mapToDto(MedicoServicio entity) {
        return mapper.map(entity, MedicoServicioDTO.class);
    }

    @Override
    public MedicoServicio mapToEntity(MedicoServicioDTO dto) {
        return mapper.map(dto, MedicoServicio.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
