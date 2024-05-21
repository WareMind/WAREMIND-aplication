package com.KelvinGarcia.WareMind.ENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PedidoProducto {

    private String id;
    private String nombre;
    private float precio;
    private int cantidad;
    private String idPedido;
}
