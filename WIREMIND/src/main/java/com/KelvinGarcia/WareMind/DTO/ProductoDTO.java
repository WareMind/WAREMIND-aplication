package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class ProductoDTO {

    Conexion con = new Conexion();

    public Producto buscarProducto(String nombre)throws Exception {
        Producto producto = new Producto();
        Connection conexion = con.getConexion();

        try{
            String sql = "select * from producto where nombre = '"+nombre+"'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                producto.setId(resultado.getString("id_producto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getFloat("precio"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setTipo(resultado.getString("tipo"));
                producto.setUbicacion(resultado.getString("ubicacion"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        }finally {
            conexion.close();
        }
        return producto;
    }
}
