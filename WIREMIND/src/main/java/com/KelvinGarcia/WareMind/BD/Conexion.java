package com.KelvinGarcia.WareMind.BD;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    @SneakyThrows
    public static Connection getConexion(){
        Connection con=null;
        String ip="localhost";
        String usuario="postgres";
        String contrasenia="200496";
        String basedatos="/WIREMIND";
        String puerto=":5432";
        String conexionURL = "jdbc:postgresql://"+ip+puerto+basedatos;
        try{
            Class.forName("org.postgresql.Driver");
            con =DriverManager.getConnection(conexionURL,usuario,contrasenia);
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return con;
    }
}
