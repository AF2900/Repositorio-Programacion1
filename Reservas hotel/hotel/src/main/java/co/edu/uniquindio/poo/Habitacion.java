package co.edu.uniquindio.poo;

public abstract class Habitacion implements Reservable {
    protected int numero;
    protected int capacidad;
    protected double precioPorNoche;
    protected boolean disponible;

    public Habitacion(int numero, int capacidad, double precioPorNoche) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract double calcularPrecioFinal(int noches);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

