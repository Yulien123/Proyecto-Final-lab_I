package accessData;

import entity.Compra;
import entity.DetalleCompra;
import entity.Producto;
import java.sql.Connection;
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
    
    public List<DetalleCompra> buscarDetallePorCompra(Compra compra){
    String sql = "SELECT idDetalleCompra, 'idCompra', 'cantidad', 'precioCosto', "
            + "productos.* FROM 'detalleCompra' JOIN productos \n"
            + "ON (productos.idProducto = detallecompra.idProducto) WHERE idCompra = ?";
    List <DetalleCompra> detalle = new ArrayList<DetalleCompra>();
    try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, compra.getIdCompra());
        ResultSet rs = ps.executeQuery();
        DetalleCompra detCompra;
        Producto prod;
        while (rs.next()) {
            //int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, boolean estado
            prod = new Producto(
                    rs.getInt("idProducto"),
                    rs.getString("nombreProducto"),
                    rs.getString("descripcion"),
                    rs.getDouble("precioActual"),
                    rs.getInt("stock"),
                    rs.getBoolean("estado"));
            
            detCompra = new DetalleCompra(rs.getInt("idDetalleCompra"),
                    rs.getInt("cantidad"), rs.getDouble("precioCosto"),compra,prod,true);
            detalle.add(detCompra);
        }
        ps.close();
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error de SQL: "+ex.getMessage());
    }
    return detalle;
    }
    /*Detalle como un recibo de compra de un producto
    los metodos que yo sugiero: 
    --guardarDetalleDeCompra(DetalleDeCompra)
    --buscarDetalleDeCompraPorID(DetalleDeCompra idDetalle)
    --modificarDetalle(detalle)
    --EliminarDetalle(detalle)
    --listarDetalles*/
    
    
}