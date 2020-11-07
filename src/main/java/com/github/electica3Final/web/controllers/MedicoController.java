package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.service.MedicoService;
import com.github.electica3Final.web.response.ListResponseDTO;
import com.github.electica3Final.web.response.ObjectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * MEDICO ENDPOINTS
 */
@Controller
@RequestMapping("/medico")
public class MedicoController extends BaseRestController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody MedicoDTO medico) {
        return ResponseEntity.ok(ObjectResponseDTO.success(medicoService.saveMedico(medico)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<MedicoDTO>> getAllMedicos() {
        return ResponseEntity.ok(ListResponseDTO.success(medicoService.getAllMedicos()));
    }


}
