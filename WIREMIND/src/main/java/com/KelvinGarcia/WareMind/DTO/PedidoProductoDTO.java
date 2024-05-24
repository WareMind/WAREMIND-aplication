package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.PedidoProducto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PedidoProductoDTO {

    private Conexion con = new Conexion();

    public boolean agragarProductoDelPedido(PedidoProducto pedidoProducto)throws Exception {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "insert into pedido_producto values(?,?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, pedidoProducto.getId());
            stmt.setString(2, pedidoProducto.getNombre());
            stmt.setFloat(3, pedidoProducto.getPrecio());
            stmt.setInt(4, pedidoProducto.getCantidad());
            stmt.setString(5, pedidoProducto.getIdPedido());

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
