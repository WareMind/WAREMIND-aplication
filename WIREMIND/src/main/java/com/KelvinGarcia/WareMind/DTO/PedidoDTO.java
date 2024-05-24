package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PedidoDTO {

    private Conexion con = new Conexion();

    public boolean agragarPedido(Pedido pedido)throws Exception {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "insert into pedido values(?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, pedido.getId());
            stmt.setDate(2, Date.valueOf(pedido.getFecha_pedido()));
            stmt.setString(3, pedido.getIdCliente());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        }catch (Exception e){
            System.out.println("Error al agregar pedido"+e.getMessage());
        }finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public boolean buscarId(String id)throws Exception {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "select id_pedido from pedido where id_pedido = '"+id+"'";
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
