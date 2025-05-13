package co.edu.uniquindio.poo;

public class HabitacionIndividual extends Habitacion {
    private boolean tieneEscritorio;

    public HabitacionIndividual(int numero, double precioPorNoche) {
        super(numero, 1, precioPorNoche);
        this.tieneEscritorio = true;
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
        return precioPorNoche * noches;
    }
}
