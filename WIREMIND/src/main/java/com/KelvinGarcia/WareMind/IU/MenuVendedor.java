/*
 * Created by JFormDesigner on Sat May 04 19:47:33 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;

import static com.KelvinGarcia.WareMind.IU.IniciarSesion.desktop;
import static com.KelvinGarcia.WareMind.IU.IniciarSesion.jPanel1;

/**
 * @author user
 */
public class MenuVendedor extends JInternalFrame {

    private RegistrarCliente registrarCliente;
    private RegistrarPedidos registrarPedidos;
    private VerProductosPedido verProductosPedido;
    private VerPedidosCliente verPedidosCliente;
    private ActualizarInfoEmpleado actualizarInfoEmpleado;
    private String idEmpleado;

    public MenuVendedor(String idEmpleado) {
        initComponents();
        this.idEmpleado = idEmpleado;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnRegistrarPedidos = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnVerProductosPedido = new javax.swing.JButton();
        btnActualizarInformacionEmpleado = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnVerPedidosCliente = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Menu Vendedor");
        setPreferredSize(new java.awt.Dimension(670, 550));

        btnRegistrarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarPedidos.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarPedidos.setText("REGISTRAR PEDIDOS");
        btnRegistrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidosActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarCliente.setText("REGISTRAR CLIENTE");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnVerProductosPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnVerProductosPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerProductosPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnVerProductosPedido.setText("VER PRODUCTOS DEL PEDIDO");
        btnVerProductosPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosPedidoActionPerformed(evt);
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

        btnVerPedidosCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnVerPedidosCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerPedidosCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnVerPedidosCliente.setText("VER PEDIDOS DEL CLIENTE");
        btnVerPedidosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRegistrarPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnVerProductosPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnActualizarInformacionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                                                        .addComponent(btnVerPedidosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(237, 237, 237)
                                                .addComponent(btnCerrarSesion)))
                                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnRegistrarCliente)
                                .addGap(45, 45, 45)
                                .addComponent(btnRegistrarPedidos)
                                .addGap(41, 41, 41)
                                .addComponent(btnVerPedidosCliente)
                                .addGap(42, 42, 42)
                                .addComponent(btnVerProductosPedido)
                                .addGap(43, 43, 43)
                                .addComponent(btnActualizarInformacionEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion)
                                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>

    private void btnRegistrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnRegistrarPedidos){
            if(registrarPedidos!=null){
                desktop.remove(registrarPedidos);
                registrarPedidos=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                registrarPedidos= new RegistrarPedidos();
                desktop.add(registrarPedidos);
            }
            registrarPedidos.setVisible(true);
        }
    }

    private void btnVerPedidosClienteActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnVerPedidosCliente){
            if(verPedidosCliente!=null){
                desktop.remove(verPedidosCliente);
                verPedidosCliente=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                verPedidosCliente= new VerPedidosCliente();
                desktop.add(verPedidosCliente);
            }
            verPedidosCliente.setVisible(true);
        }
    }

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnRegistrarCliente){
            if(registrarCliente!=null){
                desktop.remove(registrarCliente);
                registrarCliente=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                registrarCliente= new RegistrarCliente();
                desktop.add(registrarCliente);
            }
            registrarCliente.setVisible(true);
        }
    }

    private void btnVerProductosPedidoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnVerProductosPedido){
            if(verProductosPedido!=null){
                desktop.remove(verProductosPedido);
                verProductosPedido=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                verProductosPedido= new VerProductosPedido();
                desktop.add(verProductosPedido);
            }
            verProductosPedido.setVisible(true);
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
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnVerPedidosCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarPedidos;
    private javax.swing.JButton btnVerProductosPedido;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
