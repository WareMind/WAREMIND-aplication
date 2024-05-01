package com.KelvinGarcia.WareMind.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.ResultSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Cliente {

    private String id;
    private String nombre;
    private String telefono;
    private String email;

    public void pedidosRealizados(ResultSet resultados){

    }
}
