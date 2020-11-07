package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.HospitalMedicoDTO;
import com.github.electica3Final.entities.HospitalMedico;
import com.github.electica3Final.service.HospitalMedicoService;
import com.github.electica3Final.service.HospitalService;
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
 * HOSPITAL ENDPOINTS
 */
@Controller
@RequestMapping("/hospital-medico")
public class HospitalMedicoController extends BaseRestController {

    @Autowired
    private HospitalMedicoService Service;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody HospitalMedicoDTO hospitalMedico) {
        return ResponseEntity.ok(ObjectResponseDTO.success(Service.save(hospitalMedico)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HospitalDTO>> getAllHospitalMedicos() {
        return ResponseEntity.ok(ListResponseDTO.success(Service.getAll()));
    }


}
