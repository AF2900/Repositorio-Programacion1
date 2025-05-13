package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {

    private int id;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<Soldado> listSoldados = new LinkedList<>();

    private Vehiculo theVehiculo;

    public Mision(int id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        listSoldados = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vehiculo getTheVehiculo() {
        return theVehiculo;
    }

    public void setTheVehiculo(Vehiculo theVehiculo) {
        this.theVehiculo = theVehiculo;
    }

    public void setListPersonal(LinkedList listSoldados) {
        this.listSoldados = this.listSoldados;
    }

    public LinkedList<Soldado> getListPersonal() {
        return listSoldados;
    }



    public void agregarPersonal(Soldado soldado) {
        if (!listSoldados.contains(soldado)) {
            listSoldados.add(soldado);
        }
    }
}