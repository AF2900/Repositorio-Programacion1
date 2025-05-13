package co.edu.uniquindio.poo;

public class HabitacionDoble extends Habitacion {
    private boolean camaSupletoria;

    public HabitacionDoble(int numero, double precioPorNoche, boolean camaSupletoria) {
        super(numero, 2, precioPorNoche);
        this.camaSupletoria = camaSupletoria;
    }

    @Override
    public boolean reservar(Huesped huesped, Reserva reserva) {
        if (isDisponible()) {
            setDisponible(false);
            return true;
        }
        return false;
    }

    @Override
    public double calcularPrecioFinal(int noches) {
        double extra = camaSupletoria ? 20.0 : 0.0;
        return (precioPorNoche + extra) * noches;
    }
}