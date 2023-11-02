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
        Proveedor prov = new Proveedor("Sanyo Electric", "Osaka Japon", 123456789, 1);
        ProveedorData provData = new ProveedorData();
        provData.guardarProveedor(prov);
       */
        
        /* ------------ MODIFICAR PROVEEDOR ------------ */
        Proveedor prov = new Proveedor(1, "Sanyo Electric SA", "Osaka Japon", 123456789);
        ProveedorData provData = new ProveedorData();
        provData.modificarProveedor(prov);

    }

}
