package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Batallon {
    private String nombre;
    private ArrayList<Apoyo> listVehiculosApoyo;
    private ArrayList<Mision> misiones;
    private ArrayList<Blindado> listVehiculosBlindados;
    private ArrayList<TransporteTropas> listTransporteTropas;

    public Batallon(String nombre) {
        this.nombre = nombre;
        listVehiculosApoyo = new ArrayList<>();
        listTransporteTropas = new ArrayList<>();
        listVehiculosBlindados = new ArrayList<>();
        misiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Apoyo> getListVehiculosApoyo() {
        return listVehiculosApoyo;
    }

    public void setListVehiculosApoyo(ArrayList<Apoyo> listVehiculosApoyo) {
        this.listVehiculosApoyo = listVehiculosApoyo;
    }

    public ArrayList<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }

    public ArrayList<Blindado> getListVehiculosBlindados() {
        return listVehiculosBlindados;
    }

    public void setListVehiculosBlindados(ArrayList<Blindado> listVehiculosBlindados) {
        this.listVehiculosBlindados = listVehiculosBlindados;
    }

    public ArrayList<TransporteTropas> getListTransporteTropas() {
        return listTransporteTropas;
    }

    public void setListTransporteTropas(ArrayList<TransporteTropas> listTransporteTropas) {
        this.listTransporteTropas = listTransporteTropas;
    }
}