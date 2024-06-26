/*
 * Created by JFormDesigner on Sat May 04 19:38:26 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.EmpleadoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Empleado;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author user
 */
public class IniciarSesion extends JFrame {

    private MenuAdministrador menuAdministrador;
    private MenuAlmacenero menuAlmacenero;
    private MenuVendedor menuVendedor;

    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textContraseña = new javax.swing.JPasswordField();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(java.awt.Color.darkGray);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WAREMIND");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        textNombre.setBackground(new java.awt.Color(255, 255, 255));
        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNombre.setPreferredSize(new java.awt.Dimension(68, 40));

        textContraseña.setBackground(new java.awt.Color(255, 255, 255));
        textContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textContraseña.setPreferredSize(new java.awt.Dimension(68, 40));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("Iniciar Sesion");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(193, 193, 193)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(textContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(248, 248, 248)
                                                .addComponent(btnInicio)))
                                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(textContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
        );

        desktop.add(jPanel1);
        jPanel1.setBounds(20, 20, 640, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        desktop.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt){
        try {
            Empleado empleado = new Empleado();

            empleado.setNombre(textNombre.getText());
            empleado.setContraseña(textContraseña.getText());

            EmpleadoDTO empleadoDTO= new EmpleadoDTO();

            if (empleadoDTO.iniciarSesion(empleado)) {
                String puesto = empleadoDTO.buscarPuesto(empleado);
                String idEmpleado = empleadoDTO.buscarIdEmpleado(empleado);
                if(puesto.equalsIgnoreCase("ADMINISTRADOR")){
                    menuAdministrador=null;
                    desktop.remove(jPanel1);
                    if(menuAdministrador!=null){
                        desktop.remove(menuAdministrador);
                        menuAdministrador=null;
                        desktop.revalidate();
                        desktop.repaint();
                    }
                    else{
                        menuAdministrador= new MenuAdministrador();
                        desktop.add(menuAdministrador);
                    }
                    menuAdministrador.setVisible(true);
                }
                if(puesto.equalsIgnoreCase("ALMACENERO")){
                    menuAlmacenero=null;
                    desktop.remove(jPanel1);
                    if(menuAlmacenero!=null){
                        desktop.remove(menuAlmacenero);
                        menuAlmacenero=null;
                        desktop.revalidate();
                        desktop.repaint();
                    }
                    else{
                        menuAlmacenero= new MenuAlmacenero(idEmpleado);
                        desktop.add(menuAlmacenero);
                    }
                    menuAlmacenero.setVisible(true);
                }
                if(puesto.equalsIgnoreCase("VENDEDOR")){
                    menuVendedor=null;
                    desktop.remove(jPanel1);
                    if(menuVendedor!=null){
                        desktop.remove(menuVendedor);
                        menuVendedor=null;
                        desktop.revalidate();
                        desktop.repaint();
                    }
                    else{
                        menuVendedor= new MenuVendedor(idEmpleado);
                        desktop.add(menuVendedor);
                    }
                    menuVendedor.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "El nombre o la contraseña son incorrectos", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        this.limpiar();
    }

    private void limpiar(){
        textNombre.setText("");
        textContraseña.setText("");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnInicio;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textNombre;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
