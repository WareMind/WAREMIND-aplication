/*
 * Created by JFormDesigner on Sat May 04 20:06:31 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.ProveedorDTO;
import com.KelvinGarcia.WareMind.DTO.ProveedorProductoDTO;
import com.KelvinGarcia.WareMind.DTO.ProductoDTO;
import com.KelvinGarcia.WareMind.ENTITY.ProveedorProducto;
import com.KelvinGarcia.WareMind.ENTITY.Producto;
import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * @author user
 */
public class RegistrarProducto extends JInternalFrame {
    public RegistrarProducto() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        SpinnerNumberModel model = new SpinnerNumberModel(
                1.0,
                0.0,
                null,
                1
        );

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        textFecha = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner(model);
        txtUbicacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textDNI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar producto");
        setPreferredSize(new java.awt.Dimension(670, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del producto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Expiracion:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ubicacion:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));

        textFecha.setBackground(new java.awt.Color(255, 255, 255));
        textFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFecha.setForeground(new java.awt.Color(0, 0, 0));
        textFecha.setMinimumSize(new java.awt.Dimension(68, 40));
        textFecha.setPreferredSize(new java.awt.Dimension(75, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        spnCantidad.setPreferredSize(new java.awt.Dimension(68, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");

        spnPrecio.setPreferredSize(new java.awt.Dimension(68, 40));

        txtUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtUbicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUbicacion.setForeground(new java.awt.Color(0, 0, 0));
        txtUbicacion.setMinimumSize(new java.awt.Dimension(68, 40));
        txtUbicacion.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");

        textTipo.setBackground(new java.awt.Color(255, 255, 255));
        textTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textTipo.setForeground(new java.awt.Color(0, 0, 0));
        textTipo.setMinimumSize(new java.awt.Dimension(68, 40));
        textTipo.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI del proveedor:");

        textDNI.setBackground(new java.awt.Color(255, 255, 255));
        textDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textDNI.setForeground(new java.awt.Color(0, 0, 0));
        textDNI.setMinimumSize(new java.awt.Dimension(68, 40));
        textDNI.setPreferredSize(new java.awt.Dimension(68, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(352, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(65, 65, 65))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(spnCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(spnPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(textDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnGuardar))
                                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>

    String id;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String dni = textDNI.getText();
            ProveedorDTO proveedorDTO = new ProveedorDTO();
            if(proveedorDTO.buscarDNI(dni)){
                JOptionPane.showMessageDialog(this, "Proveedor encontrado");
            }
            else{
                JOptionPane.showMessageDialog(this, "El proveedor no esta registrado", "Error", JOptionPane.WARNING_MESSAGE);
                textDNI.setText("");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Producto producto = new Producto();
            ArrayList<Producto> productoEncontrado;
            ProductoDTO productoDTO = new ProductoDTO();

            String nombre = txtNombre.getText().toUpperCase().trim();
            Float precio = Float.parseFloat(spnPrecio.getValue().toString());
            int cantidad = Integer.parseInt(spnCantidad.getValue().toString());
            LocalDate fecha_entrada = LocalDate.now();
            LocalDate fecha_expiracion = LocalDate.parse(textFecha.getText());
            String tipo = textTipo.getText().trim();
            String ubicacion = txtUbicacion.getText().toUpperCase().trim();

            if (precio <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (fecha_expiracion.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "La fecha de expiración no puede ser menor que la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            productoEncontrado = productoDTO.buscarProducto(nombre);
            boolean idEncontrado;
            if (productoEncontrado.isEmpty()) {
                do {
                    id = obtenerId();
                    idEncontrado = productoDTO.buscarId(id);
                } while (!idEncontrado);
                producto.setId(id);
            } else {
                producto.setId(productoEncontrado.get(0).getId());
            }

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setFecha_entrada(fecha_entrada);
            producto.setFecha_expiracion(fecha_expiracion);
            producto.setTipo(tipo);
            producto.setUbicacion(ubicacion);

            if (!productoEncontrado.isEmpty()) {
                if (productoEncontrado.get(0).getFecha_entrada().equals(LocalDate.now())) {
                    producto.setCantidad((cantidad + productoEncontrado.get(0).getCantidad()));
                    productoDTO.actualizarProducto(producto);
                } else {
                    producto.setCantidad(cantidad);
                    if (productoDTO.agregarProducto(producto)) {
                        JOptionPane.showMessageDialog(this, "Producto guardado");
                    } else {
                        JOptionPane.showMessageDialog(this, "Producto no se guardo", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                producto.setCantidad(cantidad);
                if (productoDTO.agregarProducto(producto)) {
                    JOptionPane.showMessageDialog(this, "Producto guardado");
                } else {
                    JOptionPane.showMessageDialog(this, "Producto no se guardo", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }

            ProveedorProductoDTO proovedorProductoDTO = new ProveedorProductoDTO();
            ProveedorProducto proveedorProducto = new ProveedorProducto();
            proveedorProducto.setId(producto.getId());
            proveedorProducto.setNombre(nombre);
            proveedorProducto.setPrecio(precio);
            proveedorProducto.setCantidad(cantidad);
            proveedorProducto.setFechaEntrada(fecha_entrada);
            proveedorProducto.setTipo(tipo);
            proveedorProducto.setIdProveedor(textDNI.getText());

            if (proovedorProductoDTO.agregarProductoDelProveedor(proveedorProducto)) {
                JOptionPane.showMessageDialog(this, "Producto del proveedor registrado");
                this.limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "No se guardo el producto del proveedor", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt){
        this.limpiar();
    }
    private void limpiar(){
        txtNombre.setText("");
        spnPrecio.setValue(0);
        spnCantidad.setValue(0);
        textFecha.setText("");
        textTipo.setText("");
        txtUbicacion.setText("");
    }


    private String obtenerId(){
        int identificador = (int) Math.round(Math.random()*100000);
        return String.valueOf(identificador);
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField textDNI;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textTipo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}