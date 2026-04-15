package com.evaluacion.bastiancisternasz.model;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor

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
    
    @Min(value = 1, message = "El nivel de prioridad minimo es 1 ")
    @Max(value = 10, message = "El nivel de prioridad maximo es 10")
    private int nivelPrioridad;

    @NotNull(message = "La fecha de registro no puede ser nula")
    private int fechaRegistro;
    

        //public Incidencia(String descripcionProblema, String estado, String usuarioReporta, int nivelPrioridad, int fechaRegistro, int id){
        //    this.id=id;
        //    this.descripcionProblema=descripcionProblema;
        //    this.estado=estado;
        //    this.usuarioReporta=usuarioReporta;
        //    this.nivelPrioridad=nivelPrioridad;
        //    this.fechaRegistro=fechaRegistro;
       // }
    }
