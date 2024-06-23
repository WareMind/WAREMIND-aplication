package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.ProductoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class MostrarProductosAgotadosPorAgotarse extends javax.swing.JInternalFrame {
    ArrayList<Producto> productos = null;

    public MostrarProductosAgotadosPorAgotarse() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mostrar los productos agotados o por agotarse");
        setPreferredSize(new java.awt.Dimension(670, 550));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos agotados o por agotarse:");

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("ELIMINAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        jTable1.setBackground(java.awt.Color.darkGray);
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jTable1.setRowHeight(25);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "NOMBRE", "PRECIO", "CANTIDAD", "FECHA VENCIMIENTO", "TIPO", "UBICACION"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
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
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnLimpiar)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(84, 84, 84)
                                                                .addComponent(btnBuscar)))
                                                .addGap(53, 53, 53))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBuscar)
                                        .addComponent(jLabel1))
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnLimpiar)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        int indice = jTable1.getSelectedRow();

        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar");
            return;
        }

        Producto producto = this.productos.get(indice);

        ProductoDTO productoDTO = new ProductoDTO();

        try{
            if(productoDTO.eliminarProducto(producto)){
                JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            } else{
                JOptionPane.showMessageDialog(this, "No se ha podido eliminar");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        this.listar();
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        this.listar();
    }

    private void listar(){
        ProductoDTO productoDTO = new ProductoDTO();
        try {
            productos = productoDTO.ListarProductosAgotados();
        } catch (SQLException ex) {
            System.out.println("Error al listar productos agotados: " + ex.getMessage());
            return; // Salir del método si ocurre una excepción
        }
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("FECHA VENCIMIENTO");
        modelo.addColumn("TIPO");
        modelo.addColumn("UBICACION");

        for(Producto producto1 : productos){
            String[] fila = new String[8];
            fila[0] = producto1.getId();
            fila[1] = producto1.getNombre();
            fila[2] = String.valueOf(producto1.getPrecio());
            fila[3] = String.valueOf(producto1.getCantidad());
            fila[4] = String.valueOf(producto1.getFecha_expiracion());
            fila[5] = producto1.getTipo();
            fila[6] = producto1.getUbicacion();
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
