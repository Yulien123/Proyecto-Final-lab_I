package accessData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "empresa";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection conexion;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (conexion == null) {

            try {
                //Cargo Driver de conexión
                Class.forName("org.mariadb.jdbc.Driver");

                conexion = DriverManager.getConnection(URL + DB, usuario, password);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver" + ex.getMessage());

            } catch (SQLException ex) {
//                int error = ex.getErrorCode();
//                if (error == 1146) {
//                    JOptionPane.showMessageDialog(null, "Tabla inexistente");
//
//                } else if (error == 1049) {
//
//                    JOptionPane.showMessageDialog(null, "BD inexistente");
//                } else {
                JOptionPane.showMessageDialog(null, "Error al conectar con BD" + ex.getMessage());

            }
        }
        return conexion;
    }
}
