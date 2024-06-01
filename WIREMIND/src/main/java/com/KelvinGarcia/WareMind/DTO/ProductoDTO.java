package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Producto;
import com.KelvinGarcia.WareMind.ENTITY.Proveedor;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProductoDTO {

    Conexion con = new Conexion();

    public Producto buscarProducto(String nombre) throws Exception {


        Producto producto = new Producto();
        Connection conexion = con.getConexion();

        try {
            String sql = "select * from producto where nombre = '" + nombre + "'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                producto.setId(resultado.getString("id_producto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getFloat("precio"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setTipo(resultado.getString("tipo"));
                producto.setUbicacion(resultado.getString("ubicacion"));
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        }finally {
            conexion.close();
        }
        return producto;
    }

    public ArrayList<Producto> ListarProductosVencidos() throws SQLException {
        ArrayList<Producto> productos = new ArrayList<>();
        Connection conexion = con.getConexion();

        try {
            String sql = "SELECT id_producto, nombre, precio, cantidad, fecha_expiracion, tipo, ubicacion " +
                    "FROM producto " +
                    "WHERE fecha_expiracion <= CURRENT_DATE " +
                    "OR fecha_expiracion BETWEEN CURRENT_DATE AND (CURRENT_DATE + INTERVAL '7 DAY');";

            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getString("id_producto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                p.setCantidad(rs.getInt("cantidad"));

                // Convertir java.sql.Date a java.time.LocalDate para fecha_expiracion
                Date fechaExpiracionSql = rs.getDate("fecha_expiracion");
                if (fechaExpiracionSql != null) {
                    LocalDate fechaExpiracion =  fechaExpiracionSql.toLocalDate();
                    p.setFecha_expiracion(fechaExpiracion);
                }

                p.setTipo(rs.getString("tipo"));
                p.setUbicacion(rs.getString("ubicacion"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar productos vencidos: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexiÃ³n: " + e.getMessage());
                }
            }
        }
        return productos;
    }
  
    public boolean actualizarProducto(Producto producto) throws SQLException {
        boolean fueActualizado = false;
        Connection conexion = con.getConexion();
        try{
            String sql = "UPDATE producto SET precio = "+producto.getPrecio()
                    +", cantidad = "+producto.getCantidad()
                    +", ubicacion = '"+producto.getUbicacion()+"'"
                    +" WHERE id_producto = '"+producto.getId()+"'";

            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.executeUpdate();

            int cantidad = stmt.executeUpdate();

            fueActualizado = (cantidad>0);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        }finally {
            conexion.close();
        }
        return fueActualizado;
    }

    public boolean agregarProducto(Producto producto) throws SQLException {
        boolean agregado = false;
        Connection conexion = con.getConexion();

        try {
            PreparedStatement stmt = conexion.prepareStatement("insert into producto values(?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, producto.getId());
            stmt.setString(2, producto.getNombre());
            stmt.setFloat(3, producto.getPrecio());
            stmt.setInt(4, producto.getCantidad());
            stmt.setDate(5, Date.valueOf(producto.getFecha_entrada()));
            stmt.setDate(6, Date.valueOf(producto.getFecha_expiracion()));
            stmt.setString(7, producto.getTipo());
            stmt.setString(8, producto.getUbicacion());
            stmt.setString(9,"1");

            int cantidad = stmt.executeUpdate();

            agregado = (cantidad > 0);
        } catch (Exception e) {
            System.out.println("Error al agregar producto " + e.getMessage());
        } finally {
            conexion.close();
        }
        return agregado;
    }

    public boolean buscarId(String id)throws Exception {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "select id_producto from producto where id_producto = '"+id+"'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if(!resultado.next()){
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
