package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void registrarReserva(Reserva r) {
        reservas.add(r);
        r.habitacion.setDisponible(false);
    }

    public List<Habitacion> obtenerDisponibles(LocalDate entrada, LocalDate salida) {
        return habitaciones.stream()
                .filter(Habitacion::isDisponible)
                .collect(Collectors.toList());
    }

    public double calcularOcupacionPromedio(int mes, int anio) {
        int diasDelMes = YearMonth.of(anio, mes).lengthOfMonth();
        long totalDiasOcupados = 0;
        for (Reserva r : reservas) {
            if (r.fechaEntrada.getMonthValue() == mes && r.fechaEntrada.getYear() == anio) {
                totalDiasOcupados += r.getNoches();
            }
        }
        int totalHabitaciones = habitaciones.size();
        return (double) totalDiasOcupados / (totalHabitaciones * diasDelMes) * 100.0;
    }
}