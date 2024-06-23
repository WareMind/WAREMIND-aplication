package com.KelvinGarcia.WareMind.DTO;

import com.KelvinGarcia.WareMind.BD.Conexion;
import com.KelvinGarcia.WareMind.ENTITY.Pedido;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoDTO {

    private Conexion con = new Conexion();

    public boolean agragarPedido(Pedido pedido) throws SQLException {
        boolean fueAgregado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "insert into pedido values(?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            stmt.setString(1, pedido.getId());
            stmt.setDate(2, Date.valueOf(pedido.getFecha_pedido()));
            stmt.setString(3, pedido.getIdCliente());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return fueAgregado;
    }

    public boolean buscarId(String id) throws SQLException {
        Boolean buscado = false;
        Connection conexion = con.getConexion();

        try {
            String sql = "select id_pedido from pedido where id_pedido = '" + id + "'";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (!resultado.next()) {
                buscado = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return buscado;
    }

    public ArrayList<Pedido> ListarPedidos(String id) throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Connection conexion = con.getConexion();
        try {
            String sql = "SELECT pe.id_pedido, pe.fecha_pedido, SUM(pp.precio * pp.cantidad) as total " +
                         "FROM Pedido pe " +
                         "INNER JOIN Pedido_Producto pp " +
                         "ON pe.id_pedido = pp.id_pedido " +
                         "WHERE pe.id_cliente = '"+id+"'"+
                         "GROUP BY pe.id_pedido, pe.fecha_pedido";

            PreparedStatement stmt = conexion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido p = new Pedido();
                p.setId(rs.getString("id_pedido"));
                p.setFecha_pedido(rs.getDate("fecha_pedido").toLocalDate());
                p.setIdCliente(String.valueOf(rs.getFloat("total")));
                pedidos.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } finally {
            conexion.close();
        }
        return pedidos;
    }

    public ArrayList<Pedido> ListarPedidosDeHoy() throws SQLException {
        Connection conexion = con.getConexion();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        try{
            LocalDate fecha = LocalDate.now();
            String sql = "SELECT pe.id_pedido, pe.fecha_pedido, SUM(pp.precio * pp.cantidad) as total " +
                    "FROM Pedido pe " +
                    "INNER JOIN Pedido_Producto pp ON pe.id_pedido = pp.id_pedido " +
                    "WHERE pe.fecha_pedido = ? "+
                    "GROUP BY pe.id_pedido, pe.fecha_pedido";

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setDate(1, Date.valueOf(fecha));
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                Pedido p = new Pedido();
                p.setId(resultado.getString("id_pedido"));
                p.setFecha_pedido((resultado.getDate("fecha_pedido")).toLocalDate());
                p.setIdCliente(String.valueOf(resultado.getFloat("total")));
                pedidos.add(p);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return pedidos;
    }

    public String buscarClienteDelPedido(String id) throws SQLException {
        Connection conexion = con.getConexion();
        String nombre = null;
        try{
            String sql = "SELECT c.nombre FROM Pedido pe "+
                    "INNER JOIN Cliente c ON pe.id_cliente = c.id_cliente "+
                    "WHERE pe.id_pedido = '" + id + "'"+
                    "GROUP BY c.nombre";

            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                nombre = resultado.getString("nombre");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }finally {
            conexion.close();
        }
        return nombre;
    }
}
