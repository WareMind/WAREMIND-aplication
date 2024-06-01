package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Proveedor;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProveedorDTO {

    private Conexion con = new Conexion();

    public boolean agregarProveedor(Proveedor proveedor) throws SQLException {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "insert into proveedor values(?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, proveedor.getId());
            stmt.setString(2, proveedor.getNombre());
            stmt.setString(3, proveedor.getTelefono());
            stmt.setString(4, proveedor.getEmail());

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

    public boolean buscarDNI(String dni)throws Exception {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "select id_proveedor from proveedor where id_proveedor = '"+dni+"'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                buscado = true;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        }finally {
            conexion.close();
        }
        return buscado;
    }

}