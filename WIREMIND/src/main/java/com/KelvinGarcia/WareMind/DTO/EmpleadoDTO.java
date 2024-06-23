package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Empleado;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDTO {

    private Conexion con = new Conexion();

    public boolean iniciarSesion(Empleado empleado) throws SQLException {
        boolean iniciar = false;
        Connection conexion = con.getConexion();
        try {
            String consulta = "SELECT nombre, contraseña FROM Empleado WHERE nombre = ?"; // Consulta SQL parametrizada
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, empleado.getNombre());
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                String contraseñaBD = resultado.getString("contraseña");
                if(contraseñaBD.equals(empleado.getContraseña())){
                    iniciar = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        } finally {
            conexion.close();
        }
        return iniciar;
    }

    public String buscarPuesto(Empleado empleado) throws SQLException {
        String puesto="";
        Connection conexion = con.getConexion();
        try{
            String consulta = "SELECT puesto FROM Empleado WHERE nombre = '"+ empleado.getNombre()+"'";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                puesto = resultado.getString("puesto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        } finally {
            conexion.close();
        }
        return puesto;
    }

    public boolean agregarEmpleado(Empleado empleado) throws SQLException {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "insert into empleado values(?,?,?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, empleado.getId());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getContraseña());
            stmt.setString(4, empleado.getPuesto());
            stmt.setString(5, empleado.getTelefono());
            stmt.setString(6, "1");

            //ejecutamos la sentencia
            int cantidad = stmt.executeUpdate();

            fueAgregado = (cantidad>0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public boolean actualizarDatos(String idEmpleado, Empleado empleado) throws SQLException {
        boolean fueActualizado = false;
        Connection conexion = con.getConexion();

        try {
            StringBuilder sqlBuilder = new StringBuilder("UPDATE empleado SET ");
            List<String> camposActualizados = new ArrayList<>();

            if (empleado.getNombre() != null && !empleado.getNombre().isEmpty()) {
                camposActualizados.add("nombre = ?");
            }
            if (empleado.getContraseña() != null && !empleado.getContraseña().isEmpty()) {
                camposActualizados.add("contraseña = ?");
            }
            if (empleado.getTelefono() != null && !empleado.getTelefono().isEmpty()) {
                camposActualizados.add("telefono = ?");
            }
            if (empleado.getPuesto() != null && !empleado.getPuesto().isEmpty()) {
                camposActualizados.add("puesto = ?");
            }

            if (camposActualizados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            sqlBuilder.append(String.join(", ", camposActualizados));
            sqlBuilder.append(" WHERE id_empleado = ?");
            String sql = sqlBuilder.toString();

            PreparedStatement stmt = conexion.prepareStatement(sql);

            int index = 1;
            if (empleado.getNombre() != null && !empleado.getNombre().isEmpty()) {
                stmt.setString(index++, empleado.getNombre());
            }
            if (empleado.getContraseña() != null && !empleado.getContraseña().isEmpty()) {
                stmt.setString(index++, empleado.getContraseña());
            }
            if (empleado.getTelefono() != null && !empleado.getTelefono().isEmpty()) {
                stmt.setString(index++, empleado.getTelefono());
            }
            if (empleado.getPuesto() != null && !empleado.getPuesto().isEmpty()) {
                stmt.setString(index++, empleado.getPuesto());
            }

            stmt.setString(index, idEmpleado);

            int cantidad = stmt.executeUpdate();

            fueActualizado = (cantidad > 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return fueActualizado;
    }

    public String buscarIdEmpleado(Empleado empleado) throws SQLException {
        String idEmpleado = null;
        Connection conexion = con.getConexion();
        try {
            String sql = "SELECT id_empleado FROM empleado WHERE nombre = ? AND contraseña = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getContraseña());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idEmpleado = rs.getString("id_empleado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return idEmpleado;
    }

    public Empleado buscarEmpleadoID(String idEmpleado) throws SQLException {
        Empleado empleado = new Empleado();
        Connection conexion = con.getConexion();

        try{
            String sql = "select * from empleado where id_empleado = '"+idEmpleado+"'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if(resultado.next()){
                empleado.setId(resultado.getString("id_empleado"));
                empleado.setNombre(resultado.getString("nombre"));
                empleado.setContraseña(resultado.getString("contraseña"));
                empleado.setPuesto(resultado.getString("puesto"));
                empleado.setTelefono(resultado.getString("telefono"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return empleado;
    }

}
