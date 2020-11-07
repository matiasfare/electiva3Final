package com.github.electica3Final.web.controllers;

import com.github.electica3Final.dto.HospitalDTO;
import com.github.electica3Final.dto.HospitalServicioDTO;
import com.github.electica3Final.service.HospitalServicioService;
import com.github.electica3Final.web.response.ListResponseDTO;
import com.github.electica3Final.web.response.ObjectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * HOSPITAL ENDPOINTS
 */
@Controller
@RequestMapping("/hospital-servicio")
public class HospitalServicioController extends BaseRestController {

    @Autowired
    private HospitalServicioService camasService;

    @PostMapping("/save")
    public ResponseEntity<ObjectResponseDTO> saveProject(@RequestBody HospitalServicioDTO hospitalServicio) {
        return ResponseEntity.ok(ObjectResponseDTO.success(camasService.save(hospitalServicio)));
    }

    @GetMapping("")
    public ResponseEntity<ListResponseDTO<HospitalDTO>> getAllHospitalServicios() {
        return ResponseEntity.ok(ListResponseDTO.success(camasService.getAll()));
    }

    @GetMapping("hospital/{codHospital}")
    public ResponseEntity<Integer> getCamasDisponiblesByCodHospital(@PathVariable Long codHospital) {
        return ResponseEntity.ok(camasService.getCamasByHospital(codHospital));
    }
    @GetMapping("/servicio/{idServicio}")
    public ResponseEntity<String> getCamasDisponiblesByIdServicio(@PathVariable Long idServicio) {
        return ResponseEntity.ok(camasService.getCamasByServicio(idServicio));
    }


}
