package com.evaluacion.bastiancisternasz.model;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Incidencia {
    private static final AtomicInteger contador = new AtomicInteger(1);
    private int id;

    @NotBlank(message = "La descripcion es obligatoria")
    @Size(min = 30, max = 200, message = "La descripcion debe tener entre 30 y 200 caracteres")
    private String descripcionProblema;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @NotBlank(message = "El usuario que hace el reporte es obligatorio")
    private String usuarioReporta;
    
    private int nivelPrioridad;
    private int fechaRegistro;
    
}
