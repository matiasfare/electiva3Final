package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.MedicoServicioDTO;
import com.github.electica3Final.mapper.impl.MedicoServicioMapper;
import com.github.electica3Final.repository.MedicoServicioRepository;
import com.github.electica3Final.service.MedicoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicioServiceImpl implements MedicoServicioService {

    @Autowired
    private MedicoServicioRepository hospitalServicioRepository;

    @Autowired
    private MedicoServicioMapper mapper;

    @Override
    public List<MedicoServicioDTO> getByidServicio(Long idServicio) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdServicio(idServicio));
    }

    @Override
    public List<MedicoServicioDTO> getByIdMedico(Long idMedico) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdMedico(idMedico));
    }

    @Override
    public List<MedicoServicioDTO> getByIdMedicoIdServicio(Long idMedico, Long idServicio) {
        return mapper.mapAsList(hospitalServicioRepository.findByIdMedicoAndIdServicio(idMedico, idServicio));
    }

    @Override
    public List<MedicoServicioDTO> getAll() {
        return mapper.mapAsList(hospitalServicioRepository.findAll());
    }

    @Override
    public MedicoServicioDTO save(MedicoServicioDTO hospital) {
        return mapper.mapToDto(hospitalServicioRepository.save(mapper.mapToEntity(hospital)));
    }

}
