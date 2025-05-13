package co.edu.uniquindio.poo;

public class Suite extends Habitacion {
    private boolean jacuzzi;
    private boolean minibar;
    private boolean salaDeEstar;

    public Suite(int numero, double precioPorNoche) {
        super(numero, 3, precioPorNoche);
        this.jacuzzi = true;
        this.minibar = true;
        this.salaDeEstar = true;
    }

    @Override
    public boolean reservar(Huesped huesped, Reserva reserva) {
        if (disponible) {
            setDisponible(false);
            return true;
        }
        return false;
    }

    @Override
    public double calcularPrecioFinal(int noches) {
        return (precioPorNoche + 50.0) * noches; // recargo por servicios adicionales
    }
}