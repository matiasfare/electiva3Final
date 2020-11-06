package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.mapper.impl.HospitalMapper;
import com.github.electica3Final.repository.HospitalRepository;
import com.github.electica3Final.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired
    private HospitalMapper mapper;

    @Override
    public HospitalDTO saveHospital(HospitalDTO hospital) {
        return mapper.mapToDto(hospitalRepository.save(mapper.mapToEntity(hospital)));
    }

    @Override
    public HospitalDTO getByCodHospital(Long codHospital){
        return mapper.mapToDto(hospitalRepository.findByCodHospital(codHospital));
    }

    public List<HospitalDTO> getAllHospital() {
        return mapper.mapAsList(hospitalRepository.findAll());
    }

}
