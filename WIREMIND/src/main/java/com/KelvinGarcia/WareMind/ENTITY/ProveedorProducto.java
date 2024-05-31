package com.KelvinGarcia.WareMind.ENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProveedorProducto {

    private String id;
    private String nombre;
    private float precio;
    private int cantidad;
    private LocalDate fechaEntrada;
    private String tipo;
    private String idProveedor;
}
