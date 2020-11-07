package com.github.electica3Final.service.imple;

import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.entities.HospitalServicio;
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
    public int getCamasByHospital(Long codHospital) {
        //List<HospitalServicio> ListaCamas = hospitalServicioRepository.findByIdHospital(codHospital);
        List<HospitalServicio> ListaCamas = null;
        int cont = 0;
        for (HospitalServicio camas : ListaCamas )
            cont = cont + camas.getTotalCamas();
        return cont;
    }

    @Override
    public String getCamasByServicio(Long idServicio) {
        int cont = 0;
                List<HospitalServicio> Lista = hospitalServicioRepository.findByIdServicio(idServicio);
        for (HospitalServicio camas : Lista )
            cont = cont + camas.getTotalCamas();
        return "El servicio cuenta con " + cont + " camas";
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
