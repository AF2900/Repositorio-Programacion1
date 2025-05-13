package co.edu.uniquindio.poo;

public class Ropa extends ProductoBase{
    private String talla;
    private String color;
    private String tipoPrenda;

    public Ropa(String nombre, String codigo, double precio, Estado estado, String talla, String color, String tipoPrenda) {
        super(nombre, codigo, precio, estado);
        this.talla = talla;
        this.color = color;
        this.tipoPrenda = tipoPrenda;
    }

    public String mostrarDescripcionDetallada() {
        return "Ropa: " + tipoPrenda + " Talla " + talla + ", Color " + color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }
}