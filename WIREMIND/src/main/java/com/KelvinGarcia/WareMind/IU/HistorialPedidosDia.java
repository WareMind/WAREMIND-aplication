/*
 * Created by JFormDesigner on Sat May 04 19:33:10 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.PedidoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 * @author user
 */
public class HistorialPedidosDia extends JInternalFrame {
    public HistorialPedidosDia() {
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
        setTitle("Historial de pedidos al dia");
        setPreferredSize(new java.awt.Dimension(670, 550));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos del dia:");

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
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
                        "ID", "CLIENTE", "FECHA", "PRECIO TOTAL"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnBuscar))
                                                        .addComponent(btnLimpiar))
                                                .addGap(53, 53, 53))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))))
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
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        PedidoDTO pedidoDTO = new PedidoDTO();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        try{
            pedidos = pedidoDTO.ListarPedidosDeHoy();

            if(pedidos.isEmpty()){
                JOptionPane.showMessageDialog(this, "No se realzaron pedidos el dia de hoy");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CLIENTE");
        modelo.addColumn("FECHA");
        modelo.addColumn("PRECIO TOTAL");

        for(Pedido pedido : pedidos){
            String[] fila = new String[4];
            fila[0] = pedido.getId();
            try{
            fila[1] = pedidoDTO.buscarClienteDelPedido(pedido.getId());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            fila[2] = String.valueOf(pedido.getFecha_pedido());
            fila[3] = String.valueOf(pedido.getIdCliente());
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
