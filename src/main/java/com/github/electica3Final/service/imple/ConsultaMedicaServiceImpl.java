package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.ConsultaMedicaDTO;
import com.github.electica3Final.mapper.impl.ConsultaMedicaMapper;
import com.github.electica3Final.repository.ConsultaMedicaRepository;
import com.github.electica3Final.service.ConsultaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaMedicaServiceImpl implements ConsultaMedicaService {

    @Autowired
    private ConsultaMedicaRepository consultaMedicaRepository;

    @Autowired
    private ConsultaMedicaMapper mapper;

    @Override
    public ConsultaMedicaDTO save(ConsultaMedicaDTO consultaMedica) {
        return mapper.mapToDto(consultaMedicaRepository.save(mapper.mapToEntity(consultaMedica)));
    }

    @Override
    public ConsultaMedicaDTO getById(Long id){
        return mapper.mapToDto(consultaMedicaRepository.findById(id));
    }

    @Override
    public List<ConsultaMedicaDTO> getAllConsultaMedica() {
        return mapper.mapAsList(consultaMedicaRepository.findAll());
    }

}
