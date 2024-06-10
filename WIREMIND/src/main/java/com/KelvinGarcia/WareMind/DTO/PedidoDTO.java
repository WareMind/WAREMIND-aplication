package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoDTO {

    private Conexion con = new Conexion();

    public boolean agragarPedido(Pedido pedido) throws Exception {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "insert into pedido values(?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, pedido.getId());
            stmt.setDate(2, Date.valueOf(pedido.getFecha_pedido()));
            stmt.setString(3, pedido.getIdCliente());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al agregar pedido" + e.getMessage());
        } finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public boolean buscarId(String id) throws Exception {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "select id_pedido from pedido where id_pedido = '" + id + "'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (!resultado.next()) {
                buscado = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        } finally {
            conexion.close();
        }
        return buscado;
    }

    public ArrayList<Pedido> ListarPedidos(String id) throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<Producto> productos= new ArrayList<>();
        Connection conexion = con.getConexion();
        try {
            String sql = "SELECT id_pedido, fecha_pedido, id_cliente FROM Pedido where id_cliente= '"+id+"'";

            PreparedStatement stmt = conexion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido p = new Pedido();
                p.setId(rs.getString("id_pedido"));
                p.setFecha_pedido(rs.getDate("fecha_pedido").toLocalDate());
                pedidos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los pedidos" + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexiÃ³n: " + e.getMessage());
                }
            }
        }
        return pedidos;
    }

    public boolean buscarPedido(String id)throws Exception {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "select id_pedido from Pedido where id_cliente = '"+id+"'";
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
