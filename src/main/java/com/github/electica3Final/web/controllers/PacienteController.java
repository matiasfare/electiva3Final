package com.github.electica3Final.web.controllers;

import com.github.electica3Final.constants.ApiPaths;
import com.github.electica3Final.dto.*;
import com.github.electica3Final.service.*;
import com.github.electica3Final.web.response.ListResponseDTO;
import com.github.electica3Final.web.response.ObjectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

/**
 * PACIENTE ENDPOINTS
 */
@Controller
@RequestMapping("/paciente")
public class PacienteController extends BaseRestController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO<PacienteDTO>> saveProject(@RequestBody PacienteDTO paciente) {
        return ResponseEntity.ok(ObjectResponseDTO.success(pacienteService.savePaciente(paciente)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<PacienteDTO>> getAllServicio() {
        return ResponseEntity.ok(ListResponseDTO.success(pacienteService.getAll()));
    }

}
