package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.HospitalMedicoDTO;
import com.github.electica3Final.entities.HospitalMedico;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class HospitalMedicoMapper implements BaseMapper<HospitalMedico, HospitalMedicoDTO>{

    private final OrikaBeanMapper mapper;

    public HospitalMedicoMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<HospitalMedicoDTO> mapAsList(List<HospitalMedico> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public HospitalMedicoDTO mapToDto(HospitalMedico entity) {
        return mapper.map(entity, HospitalMedicoDTO.class);
    }

    @Override
    public HospitalMedico mapToEntity(HospitalMedicoDTO dto) {
        return mapper.map(dto, HospitalMedico.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
