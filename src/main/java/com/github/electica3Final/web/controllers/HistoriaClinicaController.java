package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HistoriaClinicaDTO;
import com.github.electica3Final.service.HistoriaClinicaService;
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
 * HISTORIA CLINICA ENDPOINTS
 */
@Controller
@RequestMapping("/historia-clinica")
public class HistoriaClinicaController extends BaseRestController {

    @Autowired
    private HistoriaClinicaService Service;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody HistoriaClinicaDTO historia) {
        return ResponseEntity.ok(ObjectResponseDTO.success(Service.save(historia)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HistoriaClinicaDTO>> getAll() {
        return ResponseEntity.ok(ListResponseDTO.success(Service.getAll()));
    }


}
