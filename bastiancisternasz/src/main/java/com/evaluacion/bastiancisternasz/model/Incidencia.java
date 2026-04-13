package com.evaluacion.bastiancisternasz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Incidencia {
    private String descripcionProblema;
    private String estado;
    private String usuarioReporta;
    private int nivelPrioridad;
    private int fechaRegistro;
    
}
