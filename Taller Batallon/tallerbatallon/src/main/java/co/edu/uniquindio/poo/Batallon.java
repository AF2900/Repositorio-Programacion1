package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Batallon {
    private String nombre;
    private ArrayList<VehiculoMilitar> vehiculos;
    private ArrayList<Mision> misiones;

    public Batallon(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
        misiones = new ArrayList<>();
    }

    public void agregarVehiculo(VehiculoMilitar vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarMision(String fecha, String ubicacion) {
        misiones.add(new Mision(fecha, ubicacion));
    }

    public void asignarPersonalAMision(int indice, String persona) {
        if (indice >= 0 && indice < misiones.size()) {
            misiones.get(indice).asignarPersonal(persona);
        }
    }

    public void asignarVehiculoAMision(int indice, VehiculoMilitar vehiculo) {
        if (indice >= 0 && indice < misiones.size()) {
            misiones.get(indice).asignarVehiculo(vehiculo);
        }
    }

    public ArrayList<VehiculoMilitar> obtenerVehiculosConMasDe50Misiones() {
        ArrayList<VehiculoMilitar> resultado = new ArrayList<>();
        for (VehiculoMilitar v : vehiculos) {
            int contador = 0;
            for (Mision m : misiones) {
                if (m.incluyeVehiculo(v)) {
                    contador++;
                }
            }
            if (contador > 50) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<VehiculoMilitar> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<VehiculoMilitar> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }
}