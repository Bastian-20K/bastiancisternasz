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


    public Incidencia incidenciaporId(int id){
        for(Incidencia incidencia : incidencias){
            if(id == incidencia.getId()){
                return incidencia;
            }
        }
        return null;
    }

    public Incidencia modificarIncidencia(int id, Incidencia incidencia){
        Incidencia buscado = incidenciaporId(id);
        if(buscado != null){
            buscado.setDescripcionProblema(incidencia.getDescripcionProblema());
            buscado.setEstado(incidencia.getEstado());
            buscado.setUsuarioReporta(incidencia.getUsuarioReporta());
            buscado.setNivelPrioridad(incidencia.getNivelPrioridad());
            buscado.setUsuarioReporta(incidencia.getUsuarioReporta());
        }
        return null;
    }
    
    public String borrar(int id){
        if(incidencias.removeIf(inc -> inc.getId() == id)){
            return "Libro eliminado";
        }
        return "Error al eliminar";
    }



}
