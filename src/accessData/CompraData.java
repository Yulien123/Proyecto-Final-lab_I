package accessData;

import entity.Compra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CompraData {
     private Connection con = null;
     
      public CompraData() {
        con = Conexion.getConexion();
    }
      
    public void guardarCompra(Compra com) {

        String sql = "INSERT INTO compra(idProveedor, fecha) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, com.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(com.getFecha()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra Registrada.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
    }
    
    public void modificarCompra(Compra compra) {
        String sql = "UPDATE alumno SET idProveedor = ?"
                + " WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la compra.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
    }
    public void eliminarCompra(int idCompra, int idProveedor) {
        String sql = "DELETE FROM compra WHERE idCompra = ? and idProveedor = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProveedor);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "La compra ha borrada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }

    }
    
     public Compra buscarCompraPorId(int idCompra) {
        String sql = "SELECT idCompra, idProveedor, fecha FROM compra WHERE idCompra = ? AND estado = 1";
        Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor().(rs.getInt(""));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la compra con esa id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
        return compra;
    }
    
    
    
}
