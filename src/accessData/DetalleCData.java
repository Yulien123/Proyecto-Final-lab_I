package accessData;

import entity.Compra;
import entity.DetalleCompra;
import entity.Producto;
import entity.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*Hace referencia a una Compra,precio de costos, cantidad y Producto*/
public class DetalleCData {

    private Connection con = null;
    ProductoData prodData;

    public DetalleCData() {
        con = Conexion.getConexion();
        prodData = new ProductoData();
    }

    public void guardarDetalleCompra(DetalleCompra com) {

        String sql = "INSERT INTO detallecompra(idDetalle, cantidad, precioCosto, idCompra, IdProducto) VALUES (?,?,?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, com.getIdDetalle());
            ps.setInt(2, com.getCantidad());
            ps.setDouble(3, com.getPrecioCosto());
            ps.setInt(4, com.getCompra().getIdCompra());
            ps.setInt(5, com.getProducto().getIdProdcuto());

            ps.executeUpdate();

            
            ProductoData pd = new ProductoData();
            
            Producto prod = pd.buscarProductoPorId(com.getProducto().getIdProdcuto());
            //descontar la cantidad pedida
            prod.setStock(prod.getStock()-com.getCantidad());
            //se modifica con el descuento
            pd.modificarProducto(prod);

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle Compra Registrado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle compra.");
        }
    }

    public void modificarDetalleCompra(DetalleCompra compra) {
        String sql = "UPDATE detallecompra SET idDetalle = ?, cantidad = ?, precioCosto = ?, idCompra = ?, IdProducto = ?"
                + " WHERE idDetalle = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdDetalle());
            ps.setInt(2, compra.getCantidad());
            ps.setDouble(3, compra.getPrecioCosto());
            ps.setInt(4, compra.getCompra().getIdCompra());
            ps.setInt(5, compra.getProducto().getIdProdcuto());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Detalle compra modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la compra.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle Compra.");
        }
    }

    public List<DetalleCompra> buscarDetallePorCompra(Compra compra) {
        String sql = "SELECT * FROM detallecompra WHERE idCompra = ?";
        DetalleCompra detCompra = new DetalleCompra();
        CompraData com = new CompraData();
        ProductoData prod = new ProductoData();
        List<DetalleCompra> detalle = new ArrayList<DetalleCompra>();
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdCompra());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                detCompra.setIdDetalle(rs.getInt("idDetalle"));
                detCompra.setCantidad(rs.getInt("cantidad"));
                detCompra.setPrecioCosto(rs.getInt("precioCosto"));
                detCompra.setCompra(com.buscarCompraPorId(rs.getInt("idCompra")));
                detCompra.setProducto(prod.buscarProductoPorId(rs.getInt("idProducto")));
                detCompra.setEstado(rs.getBoolean("estado"));
                detalle.add(detCompra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL: " + ex.getMessage());
        }
        return detalle;
    }

    public void eliminarDetalleCompra(int idDetalle) {
        String sql = "DELETE FROM detallecompra WHERE idDetalle = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idDetalle);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "La compra ha borrada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle Compra.");
        }

    }

    public List<DetalleCompra> listarDetalleCompras() {
        String sql = "SELECT idDetalle, cantidad, precioCosto, idCompra, IdProducto FROM detallecompra WHERE estado = 1";
        List<DetalleCompra> detalleCompras = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idDetalle = rs.getInt("idDetalle");
                int cantidad = rs.getInt("cantidad");
                double precioCosto = rs.getDouble("precioCosto");
                int idCompra = rs.getInt("idCompra");
                int idProducto = rs.getInt("IdProducto");

                Compra compra = new Compra();
                Producto producto = prodData.buscarProductoPorId(idProducto);

                DetalleCompra detalleCompra = new DetalleCompra(idDetalle, cantidad, precioCosto, compra, producto, true);
                detalleCompras.add(detalleCompra);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detallecompra: " + ex.getMessage());
        }
        return detalleCompras;
    }

    /*Detalle como un recibo de compra de un producto
    los metodos que yo sugiero: 
    --guardarDetalleDeCompra(DetalleDeCompra)
    --buscarDetalleDeCompraPorID(DetalleDeCompra idDetalle)
    --modificarDetalle(detalle)
    --EliminarDetalle(detalle)
    --listarDetalles*/
}
