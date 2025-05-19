package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Estacion {
    private String nombre;
    private String departamento;
    private double totalRecaudado = 0;
    private List<Vehiculo> vehiculosRegistrados = new LinkedList<>();
    private List<Recaudador> recaudadores = new LinkedList<>();

    public Estacion(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void registrarPasoVehiculo(Vehiculo v) {
        double peaje = v.calcularPeaje();
        totalRecaudado += peaje;
        vehiculosRegistrados.add(v);
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    public void agregarRecaudador(Recaudador r) {
        recaudadores.add(r);
    }

    public Recaudador buscarRecaudador(String nombreCompleto) {
        String nombreBuscado = nombreCompleto.trim().replaceAll("\\s+", " ").toLowerCase();
        return recaudadores.stream()
                .filter(r -> r.getNombreCompleto().equals(nombreBuscado))
                .findFirst().orElse(null);
    }

    public List<Conductor> conductoresConCamionCargaPesada(List<Conductor> conductores) {
        return conductores.stream()
                .filter(Conductor::tieneCamionCargaPesada)
                .toList();
    }
}
