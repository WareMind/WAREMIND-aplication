package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Cliente;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDTO {

    Conexion con = new Conexion();

    public boolean buscarDNI(String dni)throws SQLException {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try{
            String sql = "select id_cliente from cliente where id_cliente = '"+dni+"'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                buscado = true;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return buscado;
    }

    public boolean agregarCliente(Cliente cliente) throws SQLException {
        boolean fueRegistrado = false;
        Connection conexion = con.getConexion();
        try {
            String sql = "INSERT INTO Cliente(id_Cliente, nombre, telefono, email) VALUES(?,?,?,?)";
            PreparedStatement st = conexion.prepareStatement(sql);

            st.setString(1, cliente.getId());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getTelefono());
            st.setString(4, cliente.getEmail());

            int cantidad = st.executeUpdate();

            fueRegistrado = (cantidad > 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return fueRegistrado;
    }
}
