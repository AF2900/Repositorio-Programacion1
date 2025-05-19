package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int peajesPagados, int cilindraje) {
        super(placa, peajesPagados);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() { return cilindraje; }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String descripcion() {
        return "Moto - Placa: " + placa + ", Cilindraje: " + cilindraje;
    }

    @Override
    public double calcularPeaje() {
        return cilindraje > 200 ? 7000 : 5000;
    }
}