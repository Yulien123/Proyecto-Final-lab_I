
package TestMain;

import accessData.ProveedorData;

/**
 *
 * @author Julio,Santy,Coni y Fiore.
 */
public class Main {
    public static void main(String[] args) {
        
        Proveedor Sanyo = new Proveedor("Sanyo Electric", "Osaka Japon", 123456789);
        ProveedorData prov = new ProveedorData();
        prov.guardarProveedor(Sanyo);
        
    }
    
}
