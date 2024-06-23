/*
 * Created by JFormDesigner on Sat May 04 19:43:40 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;

import static com.KelvinGarcia.WareMind.IU.IniciarSesion.desktop;
import static com.KelvinGarcia.WareMind.IU.IniciarSesion.jPanel1;

/**
 * @author user
 */
public class MenuAlmacenero extends JInternalFrame {

    private RegistrarProducto registrarProducto;
    private ActualizarProductos actualizarProductos;
    private VerProductosProveedor verProductosProveedor;
    private ActualizarInfoEmpleado actualizarInfoEmpleado;
    private String idEmpleado;

    public MenuAlmacenero(String idEmpleado) {
        initComponents();
        this.idEmpleado = idEmpleado;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnRegistrarProductos = new javax.swing.JButton();
        btnActualizarProductos = new javax.swing.JButton();
        btnVerProdcutosProveedor = new javax.swing.JButton();
        btnActualizarInformacionEmpleado = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Menu almacenero");
        setPreferredSize(new java.awt.Dimension(670, 550));

        btnRegistrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarProductos.setText("REGISTRAR PRODUCTOS");
        btnRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductosActionPerformed(evt);
            }
        });

        btnActualizarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarProductos.setText("ACTUALIZAR PRODUCTOS");
        btnActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductosActionPerformed(evt);
            }
        });

        btnVerProdcutosProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnVerProdcutosProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerProdcutosProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnVerProdcutosProveedor.setText("VER PRODUCTOS DEL PROVEEDOR");
        btnVerProdcutosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProdcutosProveedorActionPerformed(evt);
            }
        });

        btnActualizarInformacionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarInformacionEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizarInformacionEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarInformacionEmpleado.setText("ACTUALIZAR INFORMACION DEL EMPLEADO");
        btnActualizarInformacionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInformacionEmpleadoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnRegistrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnVerProdcutosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnActualizarInformacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnActualizarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(92, 92, 92))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnCerrarSesion)
                                                .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnRegistrarProductos)
                                .addGap(57, 57, 57)
                                .addComponent(btnActualizarProductos)
                                .addGap(55, 55, 55)
                                .addComponent(btnVerProdcutosProveedor)
                                .addGap(56, 56, 56)
                                .addComponent(btnActualizarInformacionEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion)
                                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>

    private void btnRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnRegistrarProductos){
            if(registrarProducto!=null){
                desktop.remove(registrarProducto);
                registrarProducto=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                registrarProducto= new RegistrarProducto();
                desktop.add(registrarProducto);
            }
            registrarProducto.setVisible(true);
        }
    }

    private void btnActualizarProductosActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnActualizarProductos){
            if(actualizarProductos!=null){
                desktop.remove(actualizarProductos);
                actualizarProductos=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                actualizarProductos= new ActualizarProductos();
                desktop.add(actualizarProductos);
            }
            actualizarProductos.setVisible(true);
        }
    }

    private void btnVerProdcutosProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnVerProdcutosProveedor){
            if(verProductosProveedor!=null){
                desktop.remove(verProductosProveedor);
                verProductosProveedor=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                verProductosProveedor= new VerProductosProveedor();
                desktop.add(verProductosProveedor);
            }
            verProductosProveedor.setVisible(true);
        }
    }

    private void btnActualizarInformacionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnActualizarInformacionEmpleado){
            if(actualizarInfoEmpleado!=null){
                desktop.remove(actualizarInfoEmpleado);
                actualizarInfoEmpleado=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                actualizarInfoEmpleado= new ActualizarInfoEmpleado(idEmpleado);
                desktop.add(actualizarInfoEmpleado);
            }
            actualizarInfoEmpleado.setVisible(true);
        }
    }

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnCerrarSesion){
            desktop.removeAll();
            jPanel1.setVisible(true);
            desktop.add(jPanel1);
            desktop.revalidate();
            desktop.repaint();
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnActualizarInformacionEmpleado;
    private javax.swing.JButton btnActualizarProductos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnRegistrarProductos;
    private javax.swing.JButton btnVerProdcutosProveedor;
    private javax.swing.JLabel jLabel2;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
