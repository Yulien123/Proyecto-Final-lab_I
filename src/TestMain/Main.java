package TestMain;

import accessData.CompraData;
import accessData.DetalleCData;
import accessData.ProveedorData;
import entity.Compra;
import entity.DetalleCompra;
import entity.Proveedor;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Julio,Santy,Coni y Fiore.
 */
public class Main {

    public static void main(String[] args) {

        /*Proveedor*/

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
 /*------------ BUSCAR TODOS LOS PROVEEDORES ------------      
        ProveedorData provData = new ProveedorData();
        
        for(Proveedor proveedor:provData.listarProveedor()){
            System.out.println("");
            System.out.println("Razon Social: "+ proveedor.getRazonSocial());
            System.out.println("Domicilio: "+ proveedor.getDomicilio());
            System.out.println("Telefono: "+ proveedor.getTelefono()); 
        }
         */
 
 
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              /*PRODUCTO PRUEBAS*/
         /*----Guardar producto----*/ //FUNCIONA
//        Producto produ = new Producto("Perfume","Perfumeria",19900,10,true);
//        ProductoData produData = new ProductoData();
//        produData.guardarProducto(produ);

 /* ------------ BUSCAR PRODUCTO POR ID ------------   */   //FUNCIONA
//        ProductoData produData = new ProductoData();
//        Producto produEncontrado = produData.buscarProductoPorId(1);
//        System.out.println("Nombre: " + produEncontrado.getNombreProducto() + ", Descripcion: " 
//                    + produEncontrado.getDescripcion() + ", Precio: " + produEncontrado.getPrecioActual()
//                    + ", Stock: " + produEncontrado.getStock());
//        }           
         
 
/* ------------ MODIFICAR PRODUCTO------------   */ //ERROR AL ACCEDER A LA TABLA
//        Producto produ = new Producto(2,"Lavandina","limpieza",1000,20,true);
//        ProductoData produData = new ProductoData();
//        produData.modificarProducto(produ);
        
 /* ------------ ELIMINAR PRODUCTO ------------ *///FUNCIONA

//        Producto produ = new Producto(1,"Televisor", "50pulgadas", 12.346,789, true);
//        ProductoData produData = new ProductoData();
//        produData.eliminarProducto(1);
         


 /*------------ Listar TODOS LOS PRODUCTOS ------------     */  //FUNCIONA
//        ProductoData produData = new ProductoData();
//        
//        for(Producto producto:produData.listarProductos()){
//            System.out.println("");
//            System.out.println("Nombre "+ producto.getNombreProducto());
//            System.out.println("Descripcion: "+ producto.getDescripcion());
//            System.out.println("Precio: "+ producto.getPrecioActual()); 
//            System.out.println("Stock: "+ producto.getStock());
//        }
//        
                  
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
                                              /*COMPRAS*/
        
        //------------ INSERTAR COMPRAS ------------   FUNCIONA -pero-> (agregar en compradata el tercer ? y agregar "estado" en el constructor de compra)
        /* ProveedorData ad = new ProveedorData();

        Proveedor prov = ad.buscarProveedorPorId(1);
        Compra com = new Compra(prov, LocalDate.of(2022, 06, 22));
        CompraData comData = new CompraData();
        comData.guardarCompra(com);*/
        
        
        
        // ------------ MODIFICAR COMPRAS ------------   FUNCIONA  
        /*  ProveedorData ad = new ProveedorData();                     
        Proveedor prov = ad.buscarProveedorPorId(2);
        Compra com = new Compra(2, prov, LocalDate.of(2022, 06, 22),true);
        CompraData comData = new CompraData();
        comData.modificarCompra(com);
        
        
        
        
        // ------------ ELIMINAR COMPRAS ------------     FUNCIONA  --pero--> No es mejor un borrado logico con el booleano a false??
        /* CompraData comData = new CompraData();
        comData.eliminarCompra(6,1);*/
        
        
        
 /* ------------ BUSCAR COMPRAS POR ID -----------     */ //FUNCIONA -pero-> Proveedor da Null
        /*   CompraData comData = new CompraData();
        Compra comEncontrada = comData.buscarCompraPorId(1);
        if (comEncontrada != null) {
            System.out.println("Razon Social del Prov: " + comEncontrada.getProveedor().getRazonSocial()
                    + ", Fecha: " + comEncontrada.getFecha() + ", Telefono del Prov: " + comEncontrada.getProveedor().getTelefono());
        }*/
        
 
 /*-----------------  Obtener Compras Por Proveedor  ---------------*/ //    FUNCIONA
        /* ProveedorData ad = new ProveedorData();                     
    CompraData comData = new CompraData();
        Proveedor prov = ad.buscarProveedorPorId(2);
        
        List<Compra> compras = comData.ObtenerComprasPorProveedor(prov);

        for (Compra compra : compras) {
            System.out.println("ID de Compra: " + compra.getIdCompra());vvvvv 
            System.out.println("Nombre Proveedor: " + compra.getProveedor().getRazonSocial());
            System.out.println("Fecha de Compra: " + compra.getFecha());
            System.out.println();
        };*/
        
        
        //-----------------  Listar  Compras  ---------------               FUNCIONA           
      /*  ProveedorData ad = new ProveedorData();
        CompraData comData = new CompraData();
        List<Compra> compras = comData.listarCompras();
        for (Compra compra : compras) {
            System.out.println("ID de Compra: " + compra.getIdCompra());
            ///Agregar en CompraData un JOIN para RZ de proveedor
            System.out.println("Nombre Proveedor: " + ad.buscarProveedorPorId(compra.getProveedor().getIdProveedor()).getRazonSocial());
            System.out.println("Fecha de Compra: " + compra.getFecha());
            System.out.println();
        };*/
        
        
        /*-----------------  Listar CompraPORFechas  ---------------*/ //           FUNCIONA incluye bool 0
       /* CompraData comData = new CompraData();
        ProveedorData ad = new ProveedorData();

        // Definir la fecha
    
        Date fecha = java.sql.Date.valueOf(LocalDate.of(2023, 12, 23));

        // Llamar al método listarComprasPorFechas
        List<Compra> compras = comData.listarComprasPorFecha(fecha);
        for (Compra compra : compras) {
            System.out.println("ID de Compra: " + compra.getIdCompra());
            System.out.println("Nombre Proveedor: " + ad.buscarProveedorPorId(compra.getProveedor().getIdProveedor()).getRazonSocial());
            System.out.println("Fecha de Compra: " + compra.getFecha());
            System.out.println();
        };*/
                
                
                
        /*----------------- Listar CompraEntreFechas  ---------------*/ //          FUNCIONA incluye bool 0
       /* CompraData comData = new CompraData();
        ProveedorData ad = new ProveedorData();

        // Definir las fechas de inicio y fin para la búsqueda
        Date fechaInicio = java.sql.Date.valueOf(LocalDate.of(2023, 12, 2));
        Date fechaFin = java.sql.Date.valueOf(LocalDate.of(2023, 12, 23));

        // Llamar al método listarComprasEntreFechas
        List<Compra> compras = comData.listarComprasEntreFechas(fechaInicio, fechaFin);

        // Iterar sobre la lista de compras y mostrar información
        for (Compra compra : compras) {
            System.out.println("ID de Compra: " + compra.getIdCompra());
            System.out.println("Nombre Proveedor: " + ad.buscarProveedorPorId(compra.getProveedor().getIdProveedor()).getRazonSocial());
            System.out.println("Fecha de Compra: " + compra.getFecha());
            System.out.println();
        };*/

        /*------------ PRUEBA DE METODO DETALECOMPRADATA ------------   */
 /* CompraData comData = new CompraData();
        Compra com = comData.buscarCompraPorId(1);
        DetalleCData detCompData = new DetalleCData();
        detCompData.buscarDetallePorCompra(com).forEach(item->{
            System.out.println(item.getIdDetalle());
            System.out.println(item.getCantidad());
            System.out.println(item.getPrecioCosto());
            System.out.println(item.getProducto().getNombreProducto());
        }); //funcion LAMBDA*/
    }
}
