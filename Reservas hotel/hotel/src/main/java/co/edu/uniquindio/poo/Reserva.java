package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    Habitacion habitacion;
    private String metodoPago;
    private Huesped huesped;

    public Reserva(LocalDate entrada, LocalDate salida, Habitacion habitacion, String metodoPago, Huesped huesped) {
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.habitacion = habitacion;
        this.metodoPago = metodoPago;
        this.huesped = huesped;
    }

    public long getNoches() {
        return ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
    }

    public double calcularTotal() {
        return habitacion.calcularPrecioFinal((int) getNoches());
    }

    public String generarFactura() {
        return "Factura:\nHuésped: " + huesped +
                "\nHabitación: " + habitacion.getClass().getSimpleName() +
                "\nMétodo de pago: " + metodoPago +
                "\nTotal: $" + calcularTotal();
    }
}