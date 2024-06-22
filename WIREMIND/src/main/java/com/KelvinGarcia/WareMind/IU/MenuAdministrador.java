/*
 * Created by JFormDesigner on Sat May 04 19:41:21 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;

import static com.KelvinGarcia.WareMind.IU.IniciarSesion.desktop;
import static com.KelvinGarcia.WareMind.IU.IniciarSesion.jPanel1;

/**
 * @author user
 */
public class MenuAdministrador extends JInternalFrame {
    private RegistrarEmpleado registrarEmpleado;
    private RegistrarProveedor registrarProveedor;
    private RegistrarProducto registrarProducto;
    private RegistrarCliente registrarCliente;
    private RegistrarPedidos registrarPedidos;
    private ActualizarProductos actualizarProductos;
    private VerPedidosCliente verPedidosCliente;
    private VerProductosProveedor verProductosProveedor;
    private VerProductosPedido verProductosPedido;
    private HistorialPedidosDia historialPedidosDia;
    private MostrarProductosVencer mostrarProductosVencer;
    private ActualizarInfoAdministrador actualizarInfoAdministrador;
    private MostrarProductosAgotadosPorAgotarse mostrarProductosAgotadosPorAgotar;

    public MenuAdministrador() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnRegistrarEmpleado = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnRegistrarPedidos = new javax.swing.JButton();
        btnRegistrarProductos = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnActualizarProductos = new javax.swing.JButton();
        btnMostrarProductosVencidos = new javax.swing.JButton();
        btnVerPedidosCliente = new javax.swing.JButton();
        btnVerProdcutosProveedor = new javax.swing.JButton();
        btnVerProductosPedido = new javax.swing.JButton();
        btnHistorialPedidosDia = new javax.swing.JButton();
        btnActualizarInformacionEmpleado = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnMostrarProductosAgotados = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Menu administrador");
        setPreferredSize(new java.awt.Dimension(670, 550));

        btnRegistrarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarEmpleado.setText("REGISTRAR EMPLEADO");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistrarProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarProveedor.setText("REGISTRAR PROVEEDOR");
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        btnRegistrarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarPedidos.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarPedidos.setText("REGISTRAR PEDIDOS");
        btnRegistrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidosActionPerformed(evt);
            }
        });

        btnRegistrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarProductos.setText("REGISTRAR PRODUCTOS");
        btnRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductosActionPerformed(evt);
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

        btnActualizarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarProductos.setText("ACTUALIZAR PRODUCTOS");
        btnActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductosActionPerformed(evt);
            }
        });

        btnMostrarProductosVencidos.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarProductosVencidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostrarProductosVencidos.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarProductosVencidos.setText("MOSTRAR PRODUCTOS VENCIDOS O POR VENCER");
        btnMostrarProductosVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosVencidosActionPerformed(evt);
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

        btnVerProdcutosProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnVerProdcutosProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerProdcutosProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnVerProdcutosProveedor.setText("VER PRODUCTOS DEL PROVEEDOR");
        btnVerProdcutosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProdcutosProveedorActionPerformed(evt);
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

        btnHistorialPedidosDia.setBackground(new java.awt.Color(255, 255, 255));
        btnHistorialPedidosDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHistorialPedidosDia.setForeground(new java.awt.Color(0, 0, 0));
        btnHistorialPedidosDia.setText("HISTORIAL DE PEDIDOS / DIA");
        btnHistorialPedidosDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialPedidosDiaActionPerformed(evt);
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

        btnMostrarProductosAgotados.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarProductosAgotados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostrarProductosAgotados.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarProductosAgotados.setText("MOSTRAR PRODUCTOS AGOTADOS O POR AGOTARSE");
        btnMostrarProductosAgotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosAgotadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnRegistrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnRegistrarProveedor)
                                                        .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnRegistrarProductos)
                                                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnVerPedidosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnActualizarProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnVerProdcutosProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnVerProductosPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnHistorialPedidosDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnMostrarProductosVencidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnMostrarProductosAgotados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnActualizarInformacionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnCerrarSesion)))))
                                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrarEmpleado)
                                        .addComponent(btnActualizarProductos))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrarProveedor)
                                        .addComponent(btnVerPedidosCliente))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrarProductos)
                                        .addComponent(btnVerProdcutosProveedor))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrarCliente)
                                        .addComponent(btnVerProductosPedido))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrarPedidos)
                                        .addComponent(btnHistorialPedidosDia))
                                .addGap(31, 31, 31)
                                .addComponent(btnMostrarProductosVencidos)
                                .addGap(27, 27, 27)
                                .addComponent(btnMostrarProductosAgotados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnActualizarInformacionEmpleado)
                                        .addComponent(btnCerrarSesion))
                                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnRegistrarEmpleado){
            if(registrarEmpleado!=null){
                desktop.remove(registrarEmpleado);
                registrarEmpleado=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                registrarEmpleado= new RegistrarEmpleado();
                desktop.add(registrarEmpleado);
            }
            registrarEmpleado.setVisible(true);
        }
    }

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnRegistrarProveedor){
            if(registrarProveedor!=null){
                desktop.remove(registrarProveedor);
                registrarProveedor=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                registrarProveedor= new RegistrarProveedor();
                desktop.add(registrarProveedor);
            }
            registrarProveedor.setVisible(true);
        }
    }

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

    private void btnMostrarProductosVencidosActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnMostrarProductosVencidos){
            if(mostrarProductosVencer!=null){
                desktop.remove(mostrarProductosVencer);
                mostrarProductosVencer=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                mostrarProductosVencer= new MostrarProductosVencer();
                desktop.add(mostrarProductosVencer);
            }
            mostrarProductosVencer.setVisible(true);
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

    private void btnHistorialPedidosDiaActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnHistorialPedidosDia){
            if(historialPedidosDia!=null){
                desktop.remove(historialPedidosDia);
                historialPedidosDia=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                historialPedidosDia= new HistorialPedidosDia();
                desktop.add(historialPedidosDia);
            }
            historialPedidosDia.setVisible(true);
        }
    }

    private void btnActualizarInformacionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnActualizarInformacionEmpleado){
            if(actualizarInfoAdministrador!=null){
                desktop.remove(actualizarInfoAdministrador);
                actualizarInfoAdministrador=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                actualizarInfoAdministrador= new ActualizarInfoAdministrador();
                desktop.add(actualizarInfoAdministrador);
            }
            actualizarInfoAdministrador.setVisible(true);
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

    private void btnMostrarProductosAgotadosActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==btnMostrarProductosAgotados){
            if(mostrarProductosAgotadosPorAgotar!=null){
                desktop.remove(mostrarProductosAgotadosPorAgotar);
                mostrarProductosAgotadosPorAgotar=null;
                desktop.revalidate();
                desktop.repaint();
            }
            else{
                mostrarProductosAgotadosPorAgotar= new MostrarProductosAgotadosPorAgotarse();
                desktop.add(mostrarProductosAgotadosPorAgotar);
            }
            mostrarProductosAgotadosPorAgotar.setVisible(true);
        }
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnActualizarInformacionEmpleado;
    private javax.swing.JButton btnActualizarProductos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnHistorialPedidosDia;
    private javax.swing.JButton btnMostrarProductosAgotados;
    private javax.swing.JButton btnMostrarProductosVencidos;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarPedidos;
    private javax.swing.JButton btnRegistrarProductos;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JButton btnVerPedidosCliente;
    private javax.swing.JButton btnVerProdcutosProveedor;
    private javax.swing.JButton btnVerProductosPedido;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}