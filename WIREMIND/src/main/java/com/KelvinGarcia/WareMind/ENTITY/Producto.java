package com.KelvinGarcia.WareMind.ENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.ResultSet;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {

    private String id;
    private String nombre;
    private float precio;
    private int cantidad;
    private LocalDate fecha_entrada;
    private LocalDate fecha_expiracion;
    private String tipo;
    private String ubicacion;

    private String id_Almacen;
    //private String idProveedor;


}
