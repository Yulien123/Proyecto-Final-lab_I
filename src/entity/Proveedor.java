package entity;

public class Proveedor {

    private int idProveedor;
    private String razonSocial;
    private String domicilio;
    private long telefono;
    private boolean estado;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, String domicilio, long telefono, boolean estado) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Proveedor(String razonSocial, String domicilio, long telefono, boolean estado) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }
    
    public Proveedor(int idProveedor) {
    this.idProveedor = idProveedor; 
}


    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
       

    @Override
    public String toString() {
        return razonSocial;
    }

}
