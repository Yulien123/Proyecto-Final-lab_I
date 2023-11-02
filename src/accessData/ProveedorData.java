package accessData;

import entity.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProveedorData {
    
    private Connection con = null;
    
    public ProveedorData(){
        con = Conexion.getConexion();
    }
    
    public void guardarProveedor (Proveedor proveedor){
        
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
            
            if(rs.next()){
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor guardado");
            }
        
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");
        }
    
    }
    
    public void modificarProveedor(Proveedor proveedor){
        
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?"
                + "WHERE idProveedor = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setInt(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Proveedor modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");
        }
    }
    
}
