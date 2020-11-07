package com.github.electica3Final.mapper.impl;

import com.github.electica3Final.dto.HistoriaClinicaDTO;
import com.github.electica3Final.entities.HistoriaClinica;
import com.github.electica3Final.mapper.BaseMapper;
import com.github.electica3Final.mapper.OrikaBeanMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class HistoriaClinicaMapper implements BaseMapper<HistoriaClinica, HistoriaClinicaDTO>{

    private final OrikaBeanMapper mapper;

    public HistoriaClinicaMapper(OrikaBeanMapper mapper) { this.mapper = mapper; }

    @Override
    public List<HistoriaClinicaDTO> mapAsList(List<HistoriaClinica> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public HistoriaClinicaDTO mapToDto(HistoriaClinica entity) {
        return mapper.map(entity, HistoriaClinicaDTO.class);
    }

    @Override
    public HistoriaClinica mapToEntity(HistoriaClinicaDTO dto) {
        return mapper.map(dto, HistoriaClinica.class);
    }

    @Override
    public MapperFacade getMapper() {
        return null;
    }

}
