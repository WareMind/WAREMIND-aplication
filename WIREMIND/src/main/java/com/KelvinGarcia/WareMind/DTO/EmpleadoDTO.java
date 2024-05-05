package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Empleado;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDTO {

    private Conexion con = new Conexion();

    public boolean iniciarSesion(Empleado empleado) throws SQLException {
        boolean iniciar = false;
        Connection conexion = con.getConexion();
        try {
            String consulta = "SELECT nombre, contraseña FROM Empleado WHERE nombre = ?"; // Consulta SQL parametrizada
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, empleado.getNombre());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                String contraseñaBD = resultado.getString("contraseña");
                if(contraseñaBD.equals(empleado.getContraseña())){
                    iniciar = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + ex.getMessage());
        } finally {
            conexion.close();
        }
        return iniciar;
    }

    public String buscarPuesto(Empleado empleado) throws SQLException {
        String puesto="";
        Connection conexion = con.getConexion();
        try{
            String consulta = "SELECT puesto FROM Empleado WHERE nombre = '"+ empleado.getNombre()+"'";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                puesto = resultado.getString("puesto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + ex.getMessage());
        } finally {
            conexion.close();
        }
        return puesto;
    }

    public boolean agregarEmpleado(Empleado empleado) throws SQLException {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "insert into empleado values(?,?,?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, empleado.getId());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getContraseña());
            stmt.setString(4, empleado.getPuesto());
            stmt.setString(5, empleado.getTelefono());
            stmt.setString(6, "1");

            //ejecutamos la sentencia
            int cantidad = stmt.executeUpdate();

            fueAgregado = (cantidad>0);
        } catch (Exception e) {
            System.out.println("Error al agregar al empleado "+e.getMessage());
        } finally {
            conexion.close();
        }
        return fueAgregado;
    }
}
