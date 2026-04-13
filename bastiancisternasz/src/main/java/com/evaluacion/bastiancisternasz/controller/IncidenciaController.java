package com.evaluacion.bastiancisternasz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.bastiancisternasz.model.Incidencia;
import com.evaluacion.bastiancisternasz.service.IncidenciaService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/incidencia")
public class IncidenciaController {
    @Autowired
    private IncidenciaService incidenciaService;

    @PostMapping
    public ResponseEntity<String>postIncidencia(@Valid @RequestBody Incidencia incidencia){
        try{
            Incidencia i = incidenciaService.create(incidencia);
            return ResponseEntity.ok("Incidencia agregada correctamente");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Datos incompletos" + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> getIncidencia(){
        List<Incidencia> lista = incidenciaService.readAll();
        if(lista.isEmpty()){
            return ResponseEntity
                .status(409)
                .body("Solicitud no valida");
        }
        return ResponseEntity.ok(lista);
    }
    
}
