package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.ServicioDTO;
import com.github.electica3Final.service.ServicioService;
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
 * Servicio ENDPOINTS
 */
@Controller
@RequestMapping("/servicio")
public class ServicioController extends BaseRestController {

    @Autowired
    private ServicioService servicioService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody ServicioDTO servicio) {
        return ResponseEntity.ok(ObjectResponseDTO.success(servicioService.saveServicio(servicio)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<ServicioDTO>> getAllServicio() {
        return ResponseEntity.ok(ListResponseDTO.success(servicioService.getAllServicio()));
    }


}
