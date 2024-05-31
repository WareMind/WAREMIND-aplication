/*
 * Created by JFormDesigner on Sat May 04 20:13:49 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author user
 */
public class VerProductosProveedor extends JInternalFrame {
    public VerProductosProveedor() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        jLabel3 = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver productos del proveedor");
        setPreferredSize(new java.awt.Dimension(670, 550));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI del Proveedor:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Producto:");

        txtProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtProducto.setMinimumSize(new java.awt.Dimension(68, 40));
        txtProducto.setPreferredSize(new java.awt.Dimension(75, 40));
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarProducto.setText("BUSCAR");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setBackground(java.awt.Color.darkGray);
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "NOMBRE", "PRECIO", "CANTIDAD", "FECHA", "TIPO"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnLimpiar)
                                                .addGap(53, 53, 53))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                //.addGap(18, 18, 18)
                                                                .addGap(18,18,18)
                                                                .addComponent(btnBuscar))


                                                        ////////////////////////////////////////////////////////////////
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12,12,12)
                                                                .addComponent(btnBuscarProducto)
                                                        )
                                                        ////////////////////////////////////////////////////////////////


                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                        .addComponent(jLabel1))


                                ////////////////////////////////////////////////////////////////////////////////////////
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscarProducto)
                                        .addComponent(jLabel3)
                                )
                                ////////////////////////////////////////////////////////////////////////////////////////


                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnLimpiar)
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt){
        /*
        try {
            String nombre = txtNombre.getText();
            ProductoDTO productoDTO = new ProductoDTO();
            producto = productoDTO.buscarProducto(nombre);

            if (!producto.getTipo().isEmpty()) {
                labelPrecio.setText(String.valueOf(producto.getPrecio()));
                labelTipo.setText(producto.getTipo());
            } else {
                JOptionPane.showMessageDialog(this, "El producto no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    */
    }

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1; //DNI del cliente
    private javax.swing.JLabel jLabel2; //Contraseña
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNombre;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private javax.swing.JLabel jLabel3; //Nombre del producto
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JTextField txtProducto;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
