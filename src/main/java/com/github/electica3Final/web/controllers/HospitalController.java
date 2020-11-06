package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HospitalDTO;
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
 * MEDICO ENDPOINTS
 */
@Controller
@RequestMapping("/hospital")
public class HospitalController extends BaseRestController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody HospitalDTO hospital) {
        return ResponseEntity.ok(ObjectResponseDTO.success(hospitalService.saveHospital(hospital)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HospitalDTO>> getAllHospitals() {
        return ResponseEntity.ok(ListResponseDTO.success(hospitalService.getAllHospital()));
    }


}
