/*
 * Created by JFormDesigner on Sat May 04 20:04:04 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.ClienteDTO;
import com.KelvinGarcia.WareMind.DTO.PedidoDTO;
import com.KelvinGarcia.WareMind.DTO.PedidoProductoDTO;
import com.KelvinGarcia.WareMind.DTO.ProductoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;
import com.KelvinGarcia.WareMind.ENTITY.PedidoProducto;
import com.KelvinGarcia.WareMind.ENTITY.Producto;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author user
 */
public class RegistrarPedidos extends JInternalFrame {
    public RegistrarPedidos() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar pedidos");
        setPreferredSize(new java.awt.Dimension(670, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                salirDelNombre(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        spnCantidad.setPreferredSize(new java.awt.Dimension(68, 40));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editarSpinner(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");

        labelTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(255, 255, 255));

        labelPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI del cliente:");

        textDNI.setBackground(new java.awt.Color(255, 255, 255));
        textDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textDNI.setForeground(new java.awt.Color(0, 0, 0));
        textDNI.setPreferredSize(new java.awt.Dimension(68, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel7))
                                                .addGap(77, 77, 77)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                                        .addComponent(labelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnBuscar)
                                                                .addGap(0, 91, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(btnLimpiar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnAgregar)
                                                                .addGap(59, 59, 59))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel8))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(textDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(spnCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnAgregar))
                                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>

    private String id;
    private ArrayList<Producto> productos;
    int identificador;
    ProductoDTO productoDTO = new ProductoDTO();

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt){

        try{
            String dni =textDNI.getText();
            ClienteDTO clienteDTO = new ClienteDTO();
            if(clienteDTO.buscarDNI(dni)){
                Pedido pedido = new Pedido();
                PedidoDTO pedidoDTO = new PedidoDTO();
                boolean idEncontrado;

                do {
                    id = obtenerId();
                    idEncontrado = pedidoDTO.buscarId(id);
                } while (!idEncontrado);

                pedido.setId(id);
                pedido.setFecha_pedido(LocalDate.now());
                pedido.setIdCliente(dni);

                if(pedidoDTO.agragarPedido(pedido)){
                    JOptionPane.showMessageDialog(this, "Cliente encontrado");
                }else{
                    JOptionPane.showMessageDialog(this, "No se pudo guardar el pedido", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El cliente no esta registrado", "Error", JOptionPane.WARNING_MESSAGE);
                textDNI.setText("");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

    private void salirDelNombre(java.awt.event.FocusEvent evt){
        try{
            String nombre = txtNombre.getText().toUpperCase();
            productos = productoDTO.buscarProducto(nombre);
            if(!productos.get(0).getTipo().isEmpty()){
                labelPrecio.setText(String.valueOf(productos.get(0).getPrecio()));
                labelTipo.setText(productos.get(0).getTipo());
            }
            else{
                JOptionPane.showMessageDialog(this, "El producto no existe", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    private void editarSpinner(javax.swing.event.ChangeEvent evt){
        int cant = (Integer) spnCantidad.getValue();
        if(cant>0){
            float total = cant * productos.get(0).getPrecio();
            float redondeado = Math.round(total * 100.0f) / 100.0f;
            labelTotal.setText(String.valueOf(redondeado));
        }
        else{
            JOptionPane.showMessageDialog(this, "La cantidad tiene que ser mayor que 0", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt){

        try{
            PedidoProductoDTO pedidoProductoDTO = new PedidoProductoDTO();
            PedidoProducto pedidoProducto = new PedidoProducto();
            pedidoProducto.setId(productos.get(0).getId());
            pedidoProducto.setNombre(txtNombre.getText().toUpperCase());
            pedidoProducto.setPrecio(Float.parseFloat(labelPrecio.getText()));
            pedidoProducto.setCantidad(Integer.parseInt(spnCantidad.getValue().toString()));
            pedidoProducto.setIdPedido(String.valueOf(identificador));

            int suma = 0;

            for(Producto producto : productos){
                suma += producto.getCantidad();
            }
            int resta = suma - pedidoProducto.getCantidad();

            if(resta >= 0){
                if(pedidoProductoDTO.agragarProductoDelPedido(pedidoProducto)){
                    JOptionPane.showMessageDialog(this, "Producto agregado");
                }else{
                    JOptionPane.showMessageDialog(this, "No se agrego el producto", "Error", JOptionPane.WARNING_MESSAGE);
                }
                if(productos.size() == 2){
                    if(productos.get(0).getFecha_entrada().isBefore(productos.get(1).getFecha_entrada())){
                        int x = productos.get(0).getCantidad() - pedidoProducto.getCantidad();
                       if(x > 0){
                           productos.get(0).setCantidad(x);
                           productoDTO.actualizarProducto(productos.get(0));
                       }
                       else{
                           productoDTO.eliminarProducto(productos.get(0));
                           productos.get(1).setCantidad(productos.get(1).getCantidad()+x);
                           productoDTO.actualizarProducto(productos.get(1));
                       }
                    }
                    else{
                        int x = productos.get(1).getCantidad() - pedidoProducto.getCantidad();
                        if(x > 0){
                            productos.get(1).setCantidad(x);
                            productoDTO.actualizarProducto(productos.get(1));
                        }
                        else{
                            productoDTO.eliminarProducto(productos.get(1));
                            productos.get(0).setCantidad(productos.get(0).getCantidad()+x);
                            productoDTO.actualizarProducto(productos.get(0));
                        }
                    }
                }
                else{
                    productos.get(0).setCantidad(resta);
                    productoDTO.actualizarProducto(productos.get(0));
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "La cantidad solicitada excede a la cantidad de stock del producto, la cantidad actual es :"+suma, "Error", JOptionPane.WARNING_MESSAGE);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

        this.limpiar();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        this.limpiar();
    }

    private void limpiar(){
        txtNombre.setText("");
        labelPrecio.setText("");
        spnCantidad.setValue(0);
        labelTotal.setText("");
        labelTipo.setText("");
    }

    private String obtenerId(){
        identificador = (int) Math.round(Math.random()*100000);
        return String.valueOf(identificador);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField textDNI;
    private javax.swing.JTextField txtNombre;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}