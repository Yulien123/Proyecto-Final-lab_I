package accessData;

import entity.Proveedor;
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

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor proveedor) {

        String sql = "INSERT INTO proveedor(razonSocial, domicilio, telefono, estado)"
                + "VALUES(? , ? , ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setInt(3, proveedor.getTelefono());
            ps.setBoolean(4, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor guardado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");
        }

    }

    public void modificarProveedor(Proveedor proveedor) {

        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?"
                + " WHERE idProveedor = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setInt(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el proveedor");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");
        }
    }

    public void eliminarProveedor(int id) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor.");
        }
    }

    public Proveedor buscarProveedorPorId(int id) {
        String sql = "SELECT razonSocial, domicilio, telefono FROM proveedor WHERE idProveedor = ? AND estado = 1";
        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getInt("telefono"));
                proveedor.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el proveedor con esa id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor.");
        }
        return proveedor;
    }

    public List<Proveedor> listarProveedor() {
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE estado = 1";
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial("razonSocial");
                proveedor.setDomicilio("domicilio");
                proveedor.setTelefono(rs.getInt("telefono"));
                proveedor.setEstado(true);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor.");
        }
        return proveedores;
    }
    
   public List<Proveedor> listarProveedorxProducto(int idProducto) {
        String sql = "SELECT razonSocial, telefono, domicilio, idProveedor"
                + " FROM proveedor JOIN compra ON (proveedor.idProveedor = compra.IdProveedor)"
                + " JOIN detallecompra ON (compra.idCompra = detallecompra.idCompra) WHERE IdProducto = ?";
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial("razonSocial");
                proveedor.setDomicilio("domicilio");
                proveedor.setTelefono(rs.getInt("telefono"));
                proveedor.setEstado(true);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor.");
        }
        return proveedores;
    }
}
