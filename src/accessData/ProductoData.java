package accessData;

import entity.Compra;
import entity.Producto;
import entity.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
            + " VALUES(?, ?, ?, ?, 1)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, producto.getNombreProducto());
        ps.setString(2, producto.getDescripcion());
        ps.setDouble(3, producto.getPrecioActual());
        ps.setInt(4, producto.getStock());

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
            ps.setInt(5, producto.getIdProdcuto());

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
    
     public List<Producto> listarComprasEntreFechas(Date f1, Date f2) {

        String sql = "SELECT * FROM producto p JOIN detallecompra d ON (p.idProducto = d.IdProducto) "
                + "JOIN compra c ON (c.idCompra = d.idCompra) "
                + "WHERE c.fecha >= ? AND c.fecha <= ?";
        List<Producto> produc = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, f1);
            ps.setDate(2, f2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProdcuto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));                
                prod.setEstado(rs.getBoolean("estado"));

                produc.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
        return produc;
    }
    
}
