/*
 * Created by JFormDesigner on Thu May 02 09:12:21 GMT-05:00 2024
 */

package com.KelvinGarcia.WareMind.IU;

import javax.swing.*;

/**
 * @author Samuel
 */
public class RegistrarEmpleado extends JFrame {
    public RegistrarEmpleado() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Samuel Jimenez Paredes
        this2 = new JFrame();
        lblId = new JLabel();
        lblNombre = new JLabel();
        lblCargo = new JLabel();
        lblTelefono = new JLabel();
        txtId = new JTextField();
        txtNombre = new JTextField();
        btnGuardar = new JButton();
        btnLimpiar = new JButton();
        txtTelefono = new JTextField();
        cmbCargo = new JComboBox<>();

        //======== this2 ========
        {
            this2.setTitle("REGISTRAR EMPLEADO");
            var this2ContentPane = this2.getContentPane();

            //---- lblId ----
            lblId.setText("ID");

            //---- lblNombre ----
            lblNombre.setText("Nombre");

            //---- lblCargo ----
            lblCargo.setText("Cargo");

            //---- lblTelefono ----
            lblTelefono.setText("Telefono");

            //---- btnGuardar ----
            btnGuardar.setText("Guardar");

            //---- btnLimpiar ----
            btnLimpiar.setText("Limpiar");

            //---- cmbCargo ----
            cmbCargo.setModel(new DefaultComboBoxModel<>(new String[] {
                "Almacenero",
                "Administrador",
                "Vendedor"
            }));

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addComponent(lblTelefono)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefono, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.LEADING, this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtId, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.LEADING, this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(lblCargo)
                                            .addComponent(lblNombre))
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(cmbCargo))
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                                .addGap(38, 38, 38))
                            .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)))
                        .addComponent(btnGuardar)
                        .addGap(31, 31, 31))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCargo)
                            .addComponent(cmbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar))
                        .addContainerGap(45, Short.MAX_VALUE))
            );
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Samuel Jimenez Paredes
    private JFrame this2;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblCargo;
    private JLabel lblTelefono;
    private JTextField txtId;
    private JTextField txtNombre;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextField txtTelefono;
    private JComboBox<String> cmbCargo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
