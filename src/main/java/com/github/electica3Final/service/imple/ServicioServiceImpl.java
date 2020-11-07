package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.ServicioDTO;
import com.github.electica3Final.mapper.impl.ServicioMapper;
import com.github.electica3Final.repository.ServicioRepository;
import com.github.electica3Final.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Autowired
    private ServicioMapper mapper;

    @Override
    public ServicioDTO saveServicio(ServicioDTO servicio) {
        return mapper.mapToDto(servicioRepository.save(mapper.mapToEntity(servicio)));
    }

    @Override
    public ServicioDTO getById(Long id){
        return mapper.mapToDto(servicioRepository.findById(id));
    }

    public List<ServicioDTO> getAllServicio() {
        return mapper.mapAsList(servicioRepository.findAll());
    }

}
