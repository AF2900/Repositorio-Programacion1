package co.edu.uniquindio.poo;

public abstract class ProductoBase implements Producto {
    protected String nombre;
    protected String codigo;
    protected double precio;
    protected Estado estado;

    public ProductoBase(String nombre, String codigo, double precio, Estado estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo; }

    public double getPrecio() {
        return precio; }

    public Estado getEstado() {
        return estado; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
