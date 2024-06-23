package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.ProveedorProducto;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class ProveedorProductoDTO {
    private Conexion con = new Conexion();

    public boolean agregarProductoDelProveedor(ProveedorProducto proveedorProducto)throws SQLException {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "insert into proveedor_producto values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, proveedorProducto.getId());
            stmt.setString(2, proveedorProducto.getNombre());
            stmt.setFloat(3, proveedorProducto.getPrecio());
            stmt.setInt(4, proveedorProducto.getCantidad());
            stmt.setDate(5, Date.valueOf(proveedorProducto.getFechaEntrada()));
            stmt.setString(6, proveedorProducto.getTipo());
            stmt.setString(7, proveedorProducto.getIdProveedor());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public ArrayList<ProveedorProducto> listarProductos(String id) throws SQLException {
        ArrayList<ProveedorProducto> productos = new ArrayList<>();
        Connection conexion = con.getConexion();
        try {
            String sql = "select prp.id_producto, prp.nombre, prp.precio, prp.cantidad, prp.fecha_entrada, prp.tipo from Proveedor_Producto prp " +
                    "where prp.id_proveedor = '"+id+"'"+
                    "group by prp.id_producto, prp.nombre, prp.precio, prp.cantidad, prp.fecha_entrada, prp.tipo";

            PreparedStatement stmt = conexion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProveedorProducto prod = new ProveedorProducto();
                prod.setId(rs.getString("id_producto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecio(rs.getFloat("precio"));
                prod.setCantidad(rs.getInt("cantidad"));
                prod.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                prod.setTipo(rs.getString("tipo"));
                productos.add(prod);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return productos;
    }
}
