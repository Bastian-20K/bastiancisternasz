package com.evaluacion.bastiancisternasz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.bastiancisternasz.model.Incidencia;
import com.evaluacion.bastiancisternasz.repository.IncidenciaRepository;

@Service

public class IncidenciaService {
    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public Incidencia create(Incidencia incidencia){
        return incidenciaRepository.agregar(incidencia);
    }

    public List<Incidencia> readAll(){
        return incidenciaRepository.leerTodos();
    }
}
