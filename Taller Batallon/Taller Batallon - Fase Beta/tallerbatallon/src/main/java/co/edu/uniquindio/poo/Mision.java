package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Mision {
    private String fecha;
    private String ubicacion;
    private ArrayList<String> personalAsignado;
    private ArrayList<VehiculoMilitar> vehiculosUtilizados;

    public Mision(String fecha, String ubicacion) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = new ArrayList<>();
        this.vehiculosUtilizados = new ArrayList<>();
    }

    public void asignarPersonal(String persona) {
        personalAsignado.add(persona);
    }

    public void asignarVehiculo(VehiculoMilitar vehiculo) {
        vehiculosUtilizados.add(vehiculo);
    }

    public boolean incluyeVehiculo(VehiculoMilitar vehiculo) {
        return vehiculosUtilizados.contains(vehiculo);
    }
}
