package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.ProveedorProducto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProovedorProductoDTO {
    private Conexion con = new Conexion();

    public boolean agregarProductoDelProveedor(ProveedorProducto proveedorProducto)throws Exception {
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
            System.out.println("Error al agregar el producto"+e.getMessage());
        }finally {
            conexion.close();
        }
        return fueAgregado;
    }
}
