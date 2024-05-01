package com.KelvinGarcia.WareMind.Model;

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
public class Pedido {

    private String id;
    private LocalDate fecha_pedido;

    public void productosDePedidos(ResultSet resultados){

    }
}
