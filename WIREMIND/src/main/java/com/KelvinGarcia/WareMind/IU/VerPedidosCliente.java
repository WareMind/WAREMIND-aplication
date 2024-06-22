/*
 * Created by JFormDesigner on Sat May 04 20:11:16 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.ClienteDTO;
import com.KelvinGarcia.WareMind.DTO.PedidoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static com.KelvinGarcia.WareMind.IU.IniciarSesion.desktop;

/**
 * @author user
 */
public class VerPedidosCliente extends JInternalFrame {

    private VerProductosPedido verProductosPedido;

    public VerPedidosCliente() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVerProductosPedido = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver pedidos del cliente");
        setPreferredSize(new java.awt.Dimension(670, 550));
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI del Cliente:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));

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
                        "ID", "FECHA", "PRECIO TOTAL"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        btnVerProductosPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnVerProductosPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerProductosPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnVerProductosPedido.setText("VER PRODUCTOS DEL PEDIDO");
        btnVerProductosPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnBuscar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnVerProductosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(btnLimpiar))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                        .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnVerProductosPedido))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnVerProductosPedidoActionPerformed(ActionEvent evt) {
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
    private void btnLimpiarActionPerformed(ActionEvent evt) {
        txtNombre.setText("");
    }

    private void btnBuscarActionPerformed(ActionEvent evt){
        String dni= txtNombre.getText();
        ClienteDTO c= new ClienteDTO();
        try {
            if(c.buscarDNI(dni)){
                this.listar();
                JOptionPane.showMessageDialog(this, "Cliente encontrado");
            }else{
                JOptionPane.showMessageDialog(this, "Cliente no encontrado");
                txtNombre.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void listar() {
        PedidoDTO pedidoDTO = new PedidoDTO();
        ArrayList<Pedido> pedido = null;
        String id= txtNombre.getText();
        try {
            if (pedidoDTO.buscarPedido(id)) {
                pedido=pedidoDTO.ListarPedidos();
            }
        } catch (Exception e) {
            System.out.println("Error al listar los pedidos: " + e.getMessage());
            txtNombre.setText("");
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("PRECIO TOTAL");

        double total = pedidoDTO.calcularTotal(pedido);

        for(Pedido pedido1 : pedido){
            String[] fila = new String[8];
            fila[0] = pedido1.getId();
            fila[1] = String.valueOf(pedido1.getFecha_pedido());
            fila[2] = String.valueOf(pedido1.getIdCliente());
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton btnBuscar;
    private JButton btnLimpiar;
    private JButton btnVerProductosPedido;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextField txtNombre;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
