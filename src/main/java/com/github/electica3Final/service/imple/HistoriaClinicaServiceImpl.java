package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.HistoriaClinicaDTO;
import com.github.electica3Final.mapper.impl.HistoriaClinicaMapper;
import com.github.electica3Final.repository.HistoriaClinicaRepository;
import com.github.electica3Final.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaServiceImpl implements HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository Repository;

    @Autowired
    private HistoriaClinicaMapper mapper;

    @Override
    public List<HistoriaClinicaDTO> getByidPaciente(Long idPaciente) {
        return mapper.mapAsList(Repository.findByIdPaciente(idPaciente));
    }

    @Override
    public List<HistoriaClinicaDTO> getByIdConsulta(Long idConsulta) {
        return mapper.mapAsList(Repository.findByIdConsulta(idConsulta));
    }

    @Override
    public List<HistoriaClinicaDTO> getByIdHospitalIdPaciente(Long idPaciente, Long idConsulta) {
        return mapper.mapAsList(Repository.findByIdPacienteAndIdConsulta(idConsulta, idConsulta));
    }

    @Override
    public List<HistoriaClinicaDTO> getAll() {
        return mapper.mapAsList(Repository.findAll());
    }

    @Override
    public HistoriaClinicaDTO save(HistoriaClinicaDTO hospital) {
        return mapper.mapToDto(Repository.save(mapper.mapToEntity(hospital)));
    }

}
