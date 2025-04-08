package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallón 1");

        // Obtener vehículos con más de 50 misiones
        ArrayList<VehiculoMilitar> vehiculosConMasDe50Misiones = batallon.obtenerVehiculosConMasDe50Misiones();
        System.out.println("Vehículos con más de 50 misiones:");
        for (VehiculoMilitar v : vehiculosConMasDe50Misiones) {
            System.out.println(v.getId());
        }
    }
}