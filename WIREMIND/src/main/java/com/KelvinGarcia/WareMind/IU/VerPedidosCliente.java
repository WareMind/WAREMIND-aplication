/*
 * Created by JFormDesigner on Sat May 04 20:11:16 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.ClienteDTO;
import com.KelvinGarcia.WareMind.DTO.PedidoDTO;
import com.KelvinGarcia.WareMind.DTO.ProductoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

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

        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        txtNombre = new JTextField();
        btnLimpiar = new JButton();
        btnBuscar = new JButton();
        jScrollPane2 = new JScrollPane();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        btnVerProductosPedido = new JButton();

        jLabel2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        setBackground(Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver Pedidos del Cliente");
        setPreferredSize(new Dimension(670, 550));
        setVisible(true);

        jLabel1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("DNI del Cliente:");

        txtNombre.setBackground(new Color(255, 255, 255));
        txtNombre.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new Color(0, 0, 0));
        txtNombre.setMinimumSize(new Dimension(68, 40));
        txtNombre.setPreferredSize(new Dimension(75, 40));

        btnLimpiar.setBackground(new Color(255, 255, 255));
        btnLimpiar.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new Color(255, 255, 255));
        btnBuscar.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setForeground(new Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setBackground(Color.darkGray);
        jTable1.setForeground(new Color(255, 255, 255));
        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
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

        btnVerProductosPedido.setBackground(new Color(255, 255, 255));
        btnVerProductosPedido.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        btnVerProductosPedido.setForeground(new Color(0, 0, 0));
        btnVerProductosPedido.setText("VER PRODUCTOS DEL PEDIDO");
        btnVerProductosPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnVerProductosPedidoActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(430, 430, 430)
                                                                .addComponent(btnLimpiar)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnBuscar))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnVerProductosPedido, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar))
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnVerProductosPedido))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextField txtNombre;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
