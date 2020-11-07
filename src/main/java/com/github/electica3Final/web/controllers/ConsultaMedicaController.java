package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.ConsultaMedicaDTO;
import com.github.electica3Final.service.ConsultaMedicaService;
import com.github.electica3Final.web.response.ListResponseDTO;
import com.github.electica3Final.web.response.ObjectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CONSULTA-MEDICA ENDPOINTS
 */
@Controller
@RequestMapping("/consulta-medica")
public class ConsultaMedicaController extends BaseRestController {

    @Autowired
    private ConsultaMedicaService Service;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO<ConsultaMedicaDTO>> saveProject(@RequestBody ConsultaMedicaDTO consulta) {
        return ResponseEntity.ok(ObjectResponseDTO.success(Service.save(consulta)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HospitalDTO>> getAllHospitals() {
        return ResponseEntity.ok(ListResponseDTO.success(Service.getAllConsultaMedica()));
    }


}
