import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrarProveedor extends JFrame {

    private String nombreProveedor;
    private String direccionProveedor;
    private JTextField txtNombreProveedor;
    private JTextField txtDireccionProveedor;
    private JButton btnRegistrarProveedor;

    public RegistrarProveedor() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Registrar Proveedor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblNombreProveedor = new JLabel("Nombre del Proveedor:");
        txtNombreProveedor = new JTextField(20);
        JLabel lblDireccionProveedor = new JLabel("Dirección del Proveedor:");
        txtDireccionProveedor = new JTextField(20);
        btnRegistrarProveedor = new JButton("Registrar Proveedor");

        btnRegistrarProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProveedor();
            }
        });

        panel.add(lblNombreProveedor);
        panel.add(txtNombreProveedor);
        panel.add(lblDireccionProveedor);
        panel.add(txtDireccionProveedor);
        panel.add(btnRegistrarProveedor);

        add(panel);
    }

    private void registrarProveedor() {
        nombreProveedor = txtNombreProveedor.getText();
        direccionProveedor = txtDireccionProveedor.getText();

        try {
            Connection conexion = Conexion.getConexion();
            String consulta = "INSERT INTO Proveedor (nombre, direccion) VALUES (?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombreProveedor);
            statement.setString(2, direccionProveedor);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Proveedor registrado exitosamente.");
            limpiarCampos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar el proveedor: " + ex.getMessage());
        }
    }

    private void limpiarCampos() {
        txtNombreProveedor.setText("");
        txtDireccionProveedor.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrarProveedor ventana = new RegistrarProveedor();
            ventana.setVisible(true);
        });
    }
}
