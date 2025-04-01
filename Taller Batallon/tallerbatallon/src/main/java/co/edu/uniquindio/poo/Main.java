package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallón 1");

        VehiculoMilitar vehiculo1 = new TransporteTropas("T001", "Modelo A", "2020", 15000, EstadoOperativo.DISPONIBLE, 50);
        VehiculoMilitar vehiculo2 = new Blindado("B001", "Blindado X", "2018", 30000, EstadoOperativo.MISION, "Alto");
        VehiculoMilitar vehiculo3 = new Apoyo("A001", "Médico Z", "2022", 5000, EstadoOperativo.MANTENIMIENTO, TipoFuncion.MEDICO);

        // Agregar vehículos al Batallón
        batallon.agregarVehiculo(vehiculo1);
        batallon.agregarVehiculo(vehiculo2);
        batallon.agregarVehiculo(vehiculo3);

        // Registrar misiones (más de 50 misiones)
        for (int i = 0; i < 60; i++) {  // Agregar 60 misiones
            batallon.registrarMision("01-04-2025 " + (i + 1), "Zona " + (i + 1));
        }

        // Asignar vehículos a misiones
        for (int i = 0; i < 60; i++) {  // Asignamor vehículo 1 (superar 50 misiones)
            batallon.asignarVehiculoAMision(i, vehiculo1);
        }

        // Registrar misiones
        batallon.registrarMision("01-04-2025", "Zona A");
        batallon.registrarMision("02-04-2025", "Zona B");

        // Asignar personal a misiones
        batallon.asignarPersonalAMision(0, "Soldado 1");
        batallon.asignarPersonalAMision(1, "Soldado 2");

        // Asignar vehículos a misiones
        batallon.asignarVehiculoAMision(0, vehiculo1);
        batallon.asignarVehiculoAMision(1, vehiculo2);

        // Obtener vehículos con más de 50 misiones
        ArrayList<VehiculoMilitar> vehiculosConMasDe50Misiones = batallon.obtenerVehiculosConMasDe50Misiones();
        System.out.println("Vehículos con más de 50 misiones:");
        for (VehiculoMilitar v : vehiculosConMasDe50Misiones) {
            System.out.println(v.getId());
        }
    }
}