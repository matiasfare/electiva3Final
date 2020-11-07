package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.HospitalMedicoDTO;
import com.github.electica3Final.mapper.impl.HospitalMedicoMapper;
import com.github.electica3Final.repository.HospitalMedicoRepository;
import com.github.electica3Final.service.HospitalMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalMedicoServiceImpl implements HospitalMedicoService {

    @Autowired
    private HospitalMedicoRepository hospitalMedicoRepository;

    @Autowired
    private HospitalMedicoMapper mapper;

    @Override
    public List<HospitalMedicoDTO> getByidMedico(Long idMedico) {
        return mapper.mapAsList(hospitalMedicoRepository.findByIdMedico(idMedico));
    }

    @Override
    public List<HospitalMedicoDTO> getByIdHospital(Long idHospital) {
        return mapper.mapAsList(hospitalMedicoRepository.findByIdHospital(idHospital));
    }

    @Override
    public List<HospitalMedicoDTO> getByIdHospitalIdMedico(Long idHospital, Long idMedico) {
        return mapper.mapAsList(hospitalMedicoRepository.findByIdHospitalAndIdMedico(idHospital, idMedico));
    }

    @Override
    public List<HospitalMedicoDTO> getAll() {
        return mapper.mapAsList(hospitalMedicoRepository.findAll());
    }

    @Override
    public HospitalMedicoDTO save(HospitalMedicoDTO hospital) {
        return mapper.mapToDto(hospitalMedicoRepository.save(mapper.mapToEntity(hospital)));
    }

}
