package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Conductor extends Persona {
    private List<Vehiculo> vehiculos = new LinkedList<>();

    public Conductor(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        super(nombre, apellidos, documento, fechaNacimiento);
    }

    public void asignarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public List<Vehiculo> getVehiculos(String carro) {
        return vehiculos;
    }

    public List<Vehiculo> filtrarPorTipo(String tipo) {
        return vehiculos.stream().filter(v -> v.getClass().getSimpleName().equalsIgnoreCase(tipo)).toList();
    }

    public double totalPagado() {
        return vehiculos.stream().mapToDouble(Vehiculo::calcularPeaje).sum();
    }

    public boolean tieneCamionCargaPesada() {
        return vehiculos.stream().anyMatch(v -> v instanceof Camion c && c.getCapacidadCarga() > 10);
    }
}