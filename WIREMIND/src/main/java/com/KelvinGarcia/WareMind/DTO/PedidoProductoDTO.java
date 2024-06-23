package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.PedidoProducto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PedidoProductoDTO {

    private Conexion con = new Conexion();

    public boolean agragarProductoDelPedido(PedidoProducto pedidoProducto)throws SQLException {
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
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public ArrayList<PedidoProducto> reportarProductos(String id)throws SQLException{
        ArrayList<PedidoProducto> productos= new ArrayList<>();
        Connection conexion = con.getConexion();
        try{
            String sql = "SELECT * FROM pedido_producto WHERE id_pedido = '"+id+"'";

            PreparedStatement stmt = conexion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                PedidoProducto producto= new PedidoProducto();
                producto.setId(rs.getString("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(Float.parseFloat(rs.getString("precio")));
                producto.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                productos.add(producto);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return productos;
    }

}
