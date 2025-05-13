package co.edu.uniquindio.poo;

public class Electronico extends ProductoBase{
    private String marca;
    private String modelo;
    private int garantiaMeses;

    public Electronico(String nombre, String codigo, double precio, Estado estado, String marca, String modelo, int garantiaMeses) {
        super(nombre, codigo, precio, estado);
        this.marca = marca;
        this.modelo = modelo;
        this.garantiaMeses = garantiaMeses;
    }

    public String mostrarDescripcionDetallada() {
        return "Electrónico: " + marca + " " + modelo + " (" + garantiaMeses + " meses de garantía)";
    }

    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100.0);
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
