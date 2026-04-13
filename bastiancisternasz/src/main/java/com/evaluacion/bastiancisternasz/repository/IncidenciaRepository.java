package com.evaluacion.bastiancisternasz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.evaluacion.bastiancisternasz.model.Incidencia;

@Repository

public class IncidenciaRepository {
    List<Incidencia> incidencias = new ArrayList<>();

    public Incidencia agregar(Incidencia incidencia){
        incidencias.add(incidencia);
        return incidencia;
    }

    public List<Incidencia> leerTodos(){
        return incidencias;
    }

    public Incidencia modificarIncidencia
}
