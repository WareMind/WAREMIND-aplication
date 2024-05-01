package com.KelvinGarcia.WareMind.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Empleado {

    private String id;
    private String contraseña;
    private String nombre;
    private String puesto;
    private String telefono;

}
