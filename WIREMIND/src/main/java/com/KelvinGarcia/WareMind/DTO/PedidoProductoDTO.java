package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;
import com.KelvinGarcia.WareMind.ENTITY.PedidoProducto;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public ArrayList<Producto> reportarProductos(String id)throws IOException{
        ArrayList<Producto> producto= new ArrayList<>();
        Connection conexion = con.getConexion();
        try{
            String sql = "SELECT Pedido_Producto.id_producto, Pedido_Producto.nombre, Pedido_Producto.precio, Pedido_Producto.cantidad, Producto.tipo " +
                         "FROM Pedido_Producto INNER JOIN Producto " +
                         "ON Pedido_Producto.id_producto = Producto.id_producto " +
                         "WHERE Pedido_Producto.id_pedido = '"+id+"'";

            PreparedStatement stmt = conexion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Producto pr= new Producto();
                pr.setId(rs.getString("id_producto"));
                pr.setNombre(rs.getString("nombre"));
                pr.setCantidad(Integer.parseInt(rs.getString("precio")));
                pr.setPrecio(rs.getFloat("cantidad"));
                pr.setTipo(rs.getString("tipo"));
                producto.add(pr);
            }
        }catch (Exception e){
            System.out.println("Error al listar los pedidos" + e.getMessage());
        }finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexiÃ³n: " + e.getMessage());
                }
            }
        }
        return producto;
    }

    public boolean buscarProducto(String id) throws SQLException {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "SELECT id_pedido FROM Pedido_Producto where id_pedido = '"+id+"'";
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
