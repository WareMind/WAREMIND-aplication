/*
 * Created by JFormDesigner on Sat May 04 20:06:31 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;
import javax.swing.GroupLayout;

public class RegistrarProductoProveedor extends JInternalFrame {
    public RegistrarProductoProveedor() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        	txtNombre = new javax.swing.JTextField();
        	textFecha = new javax.swing.JTextField();
        	btnLimpiar = new javax.swing.JButton();
        	btnGuardar = new javax.swing.JButton();
        	spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        	spnPrecio = new javax.swing.JSpinner();
        	txtUbicacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        	textTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        	txtProveedor = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel2.setText("Contraseña:");

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Producto");
        setPreferredSize(new java.awt.Dimension(670, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Expiracion:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ubicacion:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));

        textFecha.setBackground(new java.awt.Color(255, 255, 255));
        textFecha.setFont(new java.awt.Font("Segoe UI", 0, 18));
        textFecha.setForeground(new java.awt.Color(0, 0, 0));
        textFecha.setMinimumSize(new java.awt.Dimension(68, 40));
        textFecha.setPreferredSize(new java.awt.Dimension(75, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18));
        spnCantidad.setPreferredSize(new java.awt.Dimension(68, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");

        spnPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18));
        spnPrecio.setPreferredSize(new java.awt.Dimension(68, 40));

        txtUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtUbicacion.setFont(new java.awt.Font("Segoe UI", 0, 18));
        txtUbicacion.setForeground(new java.awt.Color(0, 0, 0));
        txtUbicacion.setMinimumSize(new java.awt.Dimension(68, 40));
        txtUbicacion.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");

        textTipo.setBackground(new java.awt.Color(255, 255, 255));
        textTipo.setFont(new java.awt.Font("Segoe UI", 0, 18));
        textTipo.setForeground(new java.awt.Color(0, 0, 0));
        textTipo.setMinimumSize(new java.awt.Dimension(68, 40));
        textTipo.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedor:");

        txtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18));
        txtProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtProveedor.setMinimumSize(new java.awt.Dimension(68, 40));
        txtProveedor.setPreferredSize(new java.awt.Dimension(75, 40));

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 	.addComponent(jLabel1)
                 	.addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 	.addComponent(jLabel3)
                 	.addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jLabel6)
                          .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jLabel4))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jLabel7)
                          .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    	.addComponent(jLabel8)
                    	.addComponent(txtProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jLabel5)
                          .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(btnLimpiar)
                          .addComponent(btnGuardar))
                    .addGap(28, 28, 28))
        );

        pack();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        /*Tst
        String nombreProducto = txtNombre.getText();
        double precio = (double) spnPrecio.getValue();
        int cantidad = (int) spnCantidad.getValue();
        String fechaExpiracion = textFecha.getText();
        String tipo = textTipo.getText();
        String ubicacion = txtUbicacion.getText();
        String proveedor = txtProveedor.getText(); // Nuevo campo para el proveedor

        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Fecha de Expiracion: " + fechaExpiracion);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Proveedor: " + proveedor);*/
    }

    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textTipo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtUbicacion;
}