package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.mapper.impl.HospitalServicioMapper;
import com.github.electica3Final.repository.HospitalServicioRepository;
import com.github.electica3Final.service.HospitalServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServicioServiceImpl implements HospitalServicioService {

    @Autowired
    private HospitalServicioRepository hospitalServicioRepository;

    @Autowired
    private HospitalServicioMapper mapper;

    @Override
    public List<HospitalServicioDTO> getByidServicio(Long idServicio) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdServicio(idServicio));
    }

    @Override
    public List<HospitalServicioDTO> getByIdHospital(Long idHospital) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdHospital(idHospital));
    }

    @Override
    public List<HospitalServicioDTO> getByIdHospitalIdServicio(Long idHospital, Long idServicio) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdHospitalAndIdServicio(idHospital, idServicio));
    }

    @Override
    public List<HospitalServicioDTO> getAll() {
        return mapper.mapAsList(hospitalServicioRepository.findAll());
    }

    @Override
    public HospitalServicioDTO save(HospitalServicioDTO hospital) {
        return mapper.mapToDto(hospitalServicioRepository.save(mapper.mapToEntity(hospital)));
    }

}
