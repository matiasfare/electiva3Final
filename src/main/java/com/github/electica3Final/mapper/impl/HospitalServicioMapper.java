package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.entities.HospitalServicio;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class HospitalServicioMapper implements BaseMapper<HospitalServicio, HospitalServicioDTO>{

    private final OrikaBeanMapper mapper;

    public HospitalServicioMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<HospitalServicioDTO> mapAsList(List<HospitalServicio> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public HospitalServicioDTO mapToDto(HospitalServicio entity) {
        return mapper.map(entity, HospitalServicioDTO.class);
    }

    @Override
    public HospitalServicio mapToEntity(HospitalServicioDTO dto) {
        return mapper.map(dto, HospitalServicio.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
