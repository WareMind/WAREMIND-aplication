package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProductoDTO {
    private Conexion con = new Conexion();

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
                    LocalDate fechaExpiracion = fechaExpiracionSql.toLocalDate();
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
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return productos;
    }


}
