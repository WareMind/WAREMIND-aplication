package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDTO {

    Conexion con = new Conexion();

    public boolean buscarDNI(String dni)throws Exception {
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
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos: " + e.getMessage());
        }finally {
            conexion.close();
        }
        return buscado;
    }
}
