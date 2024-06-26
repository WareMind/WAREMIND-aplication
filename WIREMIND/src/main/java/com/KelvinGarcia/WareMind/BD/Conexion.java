package com.KelvinGarcia.WareMind.BD;

import lombok.SneakyThrows;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    @SneakyThrows
    public static Connection getConexion(){
        Connection con=null;
        String ip="localhost";
        String usuario="postgres";
        String contrasenia="admin";
        String basedatos="/WIREMIND";
        String puerto=":5433";
        String conexionURL = "jdbc:postgresql://"+ip+puerto+basedatos;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(conexionURL, usuario, contrasenia);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexion fallida con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.toString());
        }

        return con;
    }
}
