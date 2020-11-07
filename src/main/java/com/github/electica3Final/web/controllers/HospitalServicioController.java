package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.service.HospitalServicioService;
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
@RequestMapping("/hospital-servicio")
public class HospitalServicioController extends BaseRestController {

    @Autowired
    private HospitalServicioService Service;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody HospitalServicioDTO hospitalServicio) {
        return ResponseEntity.ok(ObjectResponseDTO.success(Service.save(hospitalServicio)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HospitalDTO>> getAllHospitalServicios() {
        return ResponseEntity.ok(ListResponseDTO.success(Service.getAll()));
    }


}
