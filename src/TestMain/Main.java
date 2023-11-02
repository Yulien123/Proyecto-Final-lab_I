package TestMain;

import accessData.ProveedorData;
import entity.Proveedor;

/**
 *
 * @author Julio,Santy,Coni y Fiore.
 */
public class Main {

    public static void main(String[] args) {

        /* ------------ INSERTAR PROVEEDOR ------------ 
        Proveedor prov = new Proveedor("Sanyo Electric", "Osaka Japon", 123456789, true);
        ProveedorData provData = new ProveedorData();
        provData.guardarProveedor(prov);
         */
        
        
        //ERROOOOOOOOOOOOOOOR 
        /* ------------ MODIFICAR PROVEEDOR ------------   */
        Proveedor prov = new Proveedor(1, "LG", "Busan Corea del Sur", 234567891, true);
        ProveedorData provData = new ProveedorData();
        provData.modificarProveedor(prov);
       
        
         /* ------------ ELIMINAR PROVEEDOR ------------ 
        Proveedor prov = new Proveedor("Sanyo Electric SA", "Osaka Japon", 123456789, true);
        ProveedorData provData = new ProveedorData();
        provData.eliminarProveedor(1);
         */
         
         /* ------------ BUSCAR PROVEEDOR POR ID ------------         
        ProveedorData provData = new ProveedorData();
        Proveedor provEncontrado = new provData.buscarProveedorPorId(1);
        */
        
//        AlumnoData alumData = new AlumnoData();
//        Alumno alumnoEncontrado = alumData.buscarAlumnoPorId(1); //verificar que este ese id en bd
//        if (alumnoEncontrado != null) {
//            System.out.println("Dni: " + alumnoEncontrado.getDni() + " Apellido: " + alumnoEncontrado.getApellido());
//        }
         
         
    }

}
