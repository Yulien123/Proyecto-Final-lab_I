package entity;

import java.time.LocalDate;

public class Compra {

    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;
    private boolean estado;
    
    
    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha, boolean estado) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado = estado;
    }


    public Compra(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + '}';
    }

}
