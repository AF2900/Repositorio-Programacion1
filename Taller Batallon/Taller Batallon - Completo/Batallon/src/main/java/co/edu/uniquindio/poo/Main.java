package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallon Central", 1);

        // Crear lista de personal para la misión
        LinkedList<String> personal = new LinkedList<>();
        personal.add("Soldado Juan Pérez");
        personal.add("Soldado María Gómez");

        // Datos de la misión
        LocalDate fechaMision = LocalDate.of(2025, 4, 8);
        String ubicacion = "Zona Beta";
        String idVehiculo = "V123";

        //Llamado calcular kilometraje por tipo
        batallon.calcularKilometrajePromedioPorTipo();

        // Registrar misión
        boolean exito = batallon.registrarMision(fechaMision, ubicacion, personal, idVehiculo);

        if (exito) {
            System.out.println("Misión registrada exitosamente.");
        } else {
            System.out.println("No se pudo registrar la misión. Verifique el ID del vehículo.");
        }

        // Mostrar vehículos con más de 50 misiones completadas
        System.out.println("Vehículos con más de 50 misiones completadas:");
        LinkedList<Vehiculo> vehiculosConMasDe50Misiones = batallon.obtenerVehiculosCantMisiones();
        for (Vehiculo v : vehiculosConMasDe50Misiones) {
            System.out.println("ID: " + v.getId() + ", Modelo: " + v.getModelo() +
                    ", Misiones completadas: " + v.getMisionesCompletadas());
        }
    }

    public LinkedList<Mision> filtrarMisionesPorUbicacionYFecha(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        LinkedList<Mision> misionesFiltradas = new LinkedList<>();

        Mision[] listMisiones = new Mision[0];
        for (Mision mision : listMisiones) {
            if (mision.getUbicacion().equalsIgnoreCase(ubicacion) &&
                    (mision.getFecha().isEqual(fechaInicio) || mision.getFecha().isAfter(fechaInicio)) &&
                    (mision.getFecha().isEqual(fechaFin) || mision.getFecha().isBefore(fechaFin))) {
                misionesFiltradas.add(mision);
            }
        }

        return misionesFiltradas;
    }
}