package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.entities.Hospital;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class HospitalMapper implements BaseMapper<Hospital, HospitalDTO>{

    private final OrikaBeanMapper mapper;

    public HospitalMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<HospitalDTO> mapAsList(List<Hospital> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public HospitalDTO mapToDto(Hospital entity) {
        return mapper.map(entity, HospitalDTO.class);
    }

    @Override
    public Hospital mapToEntity(HospitalDTO dto) {
        return mapper.map(dto, Hospital.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
