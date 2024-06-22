/*
 * Created by JFormDesigner on Sat May 04 19:11:11 PET 2024
 */

package com.KelvinGarcia.WareMind.IU;

import com.KelvinGarcia.WareMind.DTO.EmpleadoDTO;
import com.KelvinGarcia.WareMind.ENTITY.Empleado;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author user
 */
public class ActualizarInfoAdministrador extends JInternalFrame {
    public ActualizarInfoAdministrador() {
        initComponents();
    }

    private Empleado empleado;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        boxPuesto = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Actualizar informacion para empleados");
        setPreferredSize(new java.awt.Dimension(670, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puesto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setMinimumSize(new java.awt.Dimension(68, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 40));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setMinimumSize(new java.awt.Dimension(68, 40));
        txtContraseña.setPreferredSize(new java.awt.Dimension(75, 40));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        boxPuesto.setBackground(new java.awt.Color(255, 255, 255));
        boxPuesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boxPuesto.setForeground(new java.awt.Color(0, 0, 0));
        boxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Almacenero", "Vendedor" }));
        boxPuesto.setMinimumSize(new java.awt.Dimension(76, 40));
        boxPuesto.setPreferredSize(new java.awt.Dimension(76, 40));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setMinimumSize(new java.awt.Dimension(68, 40));
        txtTelefono.setPreferredSize(new java.awt.Dimension(75, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btnActualizarActionPerfomed(evt); }
        });

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 0));
        txtDNI.setMinimumSize(new java.awt.Dimension(68, 40));
        txtDNI.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI del Empleado:");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addContainerGap(23, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(boxPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                        .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(boxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnActualizar))
                                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        this.limpiar();
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            EmpleadoDTO empleadoDTO = new EmpleadoDTO();
            String id = txtDNI.getText();
            empleado = empleadoDTO.buscarEmpleadoID(id);

            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el DNI del empleado");
                return;
            }

            if (empleado != null && empleado.getId() != null && !empleado.getId().isEmpty()) {
                txtNombre.setText(empleado.getNombre());
                txtContraseña.setText(empleado.getContraseña());
                boxPuesto.setSelectedItem(empleado.getPuesto());
                txtTelefono.setText(empleado.getTelefono());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el DNI");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void btnActualizarActionPerfomed(java.awt.event.ActionEvent evt){
        try{
            EmpleadoDTO empleadoDTO = new EmpleadoDTO();
            empleado.setNombre(txtNombre.getText());
            empleado.setContraseña(txtContraseña.getText());
            empleado.setPuesto(boxPuesto.getSelectedItem().toString());
            empleado.setTelefono(txtTelefono.getText());

            if(empleadoDTO.actualizarDatos(txtDNI.getText(), empleado)) {
                JOptionPane.showMessageDialog(this, "Datos actualizados exitosamente");
            } else{
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el ID");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void limpiar(){
        txtDNI.setText("");
        txtNombre.setText("");
        txtContraseña.setText("");
        boxPuesto.setSelectedIndex(0);
        txtTelefono.setText("");
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private javax.swing.JComboBox<String> boxPuesto;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // Generated using JFormDesigner Evaluation license - Kelvin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
