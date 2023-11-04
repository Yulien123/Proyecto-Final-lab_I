package accessData;

import entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }

   public void guardarProducto(Producto producto) {
    String sql = "INSERT INTO producto(nombreProducto, descripcion, precioActual, stock, estado)"
            + " VALUES(?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, producto.getNombreProducto());
        ps.setString(2, producto.getDescripcion());
        ps.setDouble(3, producto.getPrecioActual());
        ps.setInt(4, producto.getStock());
        ps.setBoolean(5, producto.isEstado());

        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            producto.setIdProdcuto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto agregado");
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
    }
}

    public Producto buscarProductoPorId(int id) {
        String sql = "SELECT * FROM producto WHERE idProducto = ? AND estado = 1 ";
        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setIdProdcuto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getInt("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe producto con ese id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
        return producto;
    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, stock = ?"
                + " WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el producto.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }

    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }

    public List<Producto> listarProductos() {
        String sql = "SELECT idProducto, nombreProducto, descripcion, precioActual, stock, estado"
                + " FROM producto WHERE 1";
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProdcuto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));

                productos.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
        return productos;
    }
}
