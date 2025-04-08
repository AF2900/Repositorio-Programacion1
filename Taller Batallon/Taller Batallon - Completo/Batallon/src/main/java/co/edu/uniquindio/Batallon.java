package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private int id;
    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindados;
    private LinkedList<VehiculoTransporteTropa> listVehiculosTransporteTropa;
    private LinkedList<Mision> listMisiones;

    public Batallon(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;

        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindados = new LinkedList<>();
        this.listVehiculosTransporteTropa = new LinkedList<>();
        this.listMisiones = new LinkedList<>();
    }

    public boolean registrarMision(LocalDate fechaMision, String ubicacionMision, LinkedList listPersonal, String idVehiculomision){
        boolean flag = false;

        int idMisionNueva = listMisiones.size()+1;

        Mision newMision = new Mision(idMisionNueva, fechaMision, ubicacionMision);
        newMision.setListPersonal(listPersonal);

        for(VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getId().equals(idVehiculomision)) {
                newMision.setTheVehiculo(vehiculo);
                LinkedList<Mision> ListamisionesAux = vehiculo.getListMisiones();

                ListamisionesAux.add(newMision);
                vehiculo.setListMisiones(ListamisionesAux);
                flag = true;
            }
        }

        for(VehiculoBlindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getId().equals(idVehiculomision)) {
                newMision.setTheVehiculo(vehiculo);
                LinkedList<Mision> ListamisionesAux = vehiculo.getListMisiones();

                ListamisionesAux.add(newMision);
                vehiculo.setListMisiones(ListamisionesAux);
                flag = true;
            }
        }

        for(VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa) {
            if (vehiculo.getId().equals(idVehiculomision)) {
                newMision.setTheVehiculo(vehiculo);
                LinkedList<Mision> ListamisionesAux = vehiculo.getListMisiones();

                ListamisionesAux.add(newMision);
                vehiculo.setListMisiones(ListamisionesAux);
                flag = true;
            }
        }

        listMisiones.add(newMision);

        return flag;
    }

    public LinkedList<Vehiculo> obtenerVehiculosCantMisiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();


        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoBlindado vehiculo : listVehiculosBlindados){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        return vehiculosMisionesCompletadas;
    }

    public void calcularKilometrajePromedioPorTipo() {
        double totalKmTropa = 0, totalKmBlindado = 0, totalKmApoyo = 0;
        int countTropa = listVehiculosTransporteTropa.size();
        int countBlindado = listVehiculosBlindados.size();
        int countApoyo = listVehiculosApoyo.size();

        for (VehiculoTransporteTropa v : listVehiculosTransporteTropa) {
            totalKmTropa += v.getKilometraje();
        }

        for (VehiculoBlindado v : listVehiculosBlindados) {
            totalKmBlindado += v.getKilometraje();
        }

        for (VehiculoApoyo v : listVehiculosApoyo) {
            totalKmApoyo += v.getKilometraje();
        }

        System.out.println("Kilometraje promedio por tipo de vehículo:");
        System.out.println("Transportes de Tropas: " + (countTropa > 0 ? totalKmTropa / countTropa : 0) + " km");
        System.out.println("Vehículos Blindados: " + (countBlindado > 0 ? totalKmBlindado / countBlindado : 0) + " km");
        System.out.println("Vehículos de Apoyo: " + (countApoyo > 0 ? totalKmApoyo / countApoyo : 0) + " km");
    }

    public LinkedList<Mision> filtrarMisionesPorUbicacionYFecha(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        LinkedList<Mision> misionesFiltradas = new LinkedList<>();

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