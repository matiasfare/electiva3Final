package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.service.MedicoService;
import com.github.electica3Final.web.response.ObjectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MEDICO ENDPOINTS
 */
@Controller
@RequestMapping("/medico")
public class MedicoController extends BaseRestController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO<MedicoDTO>> saveProject(@RequestBody MedicoDTO medico) {
        return ResponseEntity.ok(ObjectResponseDTO.success(medicoService.saveMedico(medico)));
    }


}
