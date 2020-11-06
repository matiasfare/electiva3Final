package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.mapper.impl.MedicoMapper;
import com.github.electica3Final.repository.MedicoRepository;
import com.github.electica3Final.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoMapper mapper;

    @Override
    public MedicoDTO saveMedico(MedicoDTO medico) {
        return mapper.mapToDto(medicoRepository.save(mapper.mapToEntity(medico)));
    }

    @Override
    public MedicoDTO getById(Long id){
        return mapper.mapToDto(medicoRepository.findById(id));
    }

    public List<MedicoDTO> getAllMedicos() {
        return mapper.mapAsList(medicoRepository.findAll());
    }


}
