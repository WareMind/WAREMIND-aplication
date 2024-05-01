package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.Model.Conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InicioSesion extends JFrame {

    private String nombre;
    private String contraseña;
    private JTextField name;
    private JPasswordField password;
    private JPanel panel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel1;
    private JButton btnInicio;

    public InicioSesion() {
        add(panel1);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                nombre = name.getText(); // Obtener el nombre de usuario del campo de texto
                contraseña = new String(password.getPassword()); // Obtener la contraseña del campo de texto de contraseña

                try {
                    Connection conexion = Conexion.getConexion();
                    String consulta = "SELECT nombre, contraseña FROM Empleado WHERE nombre = ?"; // Consulta SQL parametrizada
                    PreparedStatement statement = conexion.prepareStatement(consulta);
                    statement.setString(1, nombre); // Establecer el nombre de usuario como parámetro
                    ResultSet resultado = statement.executeQuery();

                    if (resultado.next()) { // Verificar si se encontró un usuario con ese nombre
                        String contraseñaBD = resultado.getString("contraseña");
                        if (contraseñaBD.equals(contraseña)) {
                            JOptionPane.showMessageDialog(null, "Eres tremendo crack");
                            // La contraseña coincide, procede con la autenticación exitosa
                            // Aquí puedes colocar el código para navegar a la siguiente interfaz
                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario no existe");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al intentar iniciar sesión: " + ex.getMessage());
                }
            }
        });

        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                nombre=evt.getActionCommand();
            }
        });

        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                contraseña =evt.getActionCommand();
            }
        });
    }

    private void createUIComponents() {
        name = new JTextField();
        password = new JPasswordField();
        panel1=new JPanel();
        jLabel2=new JLabel();
        jLabel3 = new JLabel();
        jLabel1 = new JLabel();
        btnInicio = new JButton();
    }
}
