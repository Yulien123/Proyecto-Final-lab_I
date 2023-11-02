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
        
         
        /* ------------ MODIFICAR PROVEEDOR ------------  
        Proveedor prov = new Proveedor(1, "LG", "Busan Corea del Sur", 234567891, true);
        ProveedorData provData = new ProveedorData();
        provData.modificarProveedor(prov);
        */
        
         /* ------------ ELIMINAR PROVEEDOR ------------ 
        Proveedor prov = new Proveedor("Sanyo Electric SA", "Osaka Japon", 123456789, true);
        ProveedorData provData = new ProveedorData();
        provData.eliminarProveedor(1);
         */
         
         /* ------------ BUSCAR PROVEEDOR POR ID ------------      
        ProveedorData provData = new ProveedorData();
        Proveedor provEncontrado = provData.buscarProveedorPorId(2);
        if(provEncontrado != null){
            System.out.println("Razon Social: " + provEncontrado.getRazonSocial() + ", Domicilio: " 
                    + provEncontrado.getDomicilio() + ", Telefono: " + provEncontrado.getTelefono());
        }           
         */ 
         
         /*------------ BUSCAR TODOS LOS PROVEEDORES ------------      */
        ProveedorData provData = new ProveedorData();
        
        for(Proveedor proveedor:provData.listarProveedor()){
            System.out.println("");
            System.out.println("Razon Social: "+ proveedor.getRazonSocial());
            System.out.println("Domicilio: "+ proveedor.getDomicilio());
            System.out.println("Telefono: "+ proveedor.getTelefono()); 
        }
        
        
        
    }

}
