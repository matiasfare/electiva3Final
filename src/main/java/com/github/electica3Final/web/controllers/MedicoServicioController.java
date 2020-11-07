package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.MedicoDTO;
import com.github.electica3Final.dto.MedicoServicioDTO;
import com.github.electica3Final.service.MedicoServicioService;
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
@RequestMapping("/medico-servicio")
public class MedicoServicioController extends BaseRestController {

    @Autowired
    private MedicoServicioService Service;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody MedicoServicioDTO medicoServicio) {
        return ResponseEntity.ok(ObjectResponseDTO.success(Service.save(medicoServicio)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<MedicoDTO>> getAllMedicoServicios() {
        return ResponseEntity.ok(ListResponseDTO.success(Service.getAll()));
    }


}
