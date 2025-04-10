package co.edu.uniquindio.poo;

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

    // Crear un vehículo
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof VehiculoApoyo) {
            listVehiculosApoyo.add((VehiculoApoyo) vehiculo);
        } else if (vehiculo instanceof VehiculoBlindado) {
            listVehiculosBlindados.add((VehiculoBlindado) vehiculo);
        } else if (vehiculo instanceof VehiculoTransporteTropa) {
            listVehiculosTransporteTropa.add((VehiculoTransporteTropa) vehiculo);
        }
    }

    // Leer todos los vehículos
    public void listarVehiculos() {
        System.out.println("=== Vehículos de Apoyo ===");
        for (VehiculoApoyo v : listVehiculosApoyo) {
            System.out.println(v);
        }
        System.out.println("=== Vehículos Blindados ===");
        for (VehiculoBlindado v : listVehiculosBlindados) {
            System.out.println(v);
        }
        System.out.println("=== Vehículos de Transporte de Tropas ===");
        for (VehiculoTransporteTropa v : listVehiculosTransporteTropa) {
            System.out.println(v);
        }
    }

    // Actualizar estado operativo por ID
    public boolean actualizarEstadoVehiculo(String id, EstadoOperativo nuevoEstado) {
        for (Vehiculo v : getTodosVehiculos()) {
            if (v.getId().equals(id)) {
                v.setEstadoOperativo(nuevoEstado);
                return true;
            }
        }
        return false;
    }

    // Eliminar vehículo por ID
    public boolean eliminarVehiculo(String id) {
        for (VehiculoApoyo v : listVehiculosApoyo) {
            if (v.getId().equals(id)) {
                listVehiculosApoyo.remove(v);
                return true;
            }
        }
        for (VehiculoBlindado v : listVehiculosBlindados) {
            if (v.getId().equals(id)) {
                listVehiculosBlindados.remove(v);
                return true;
            }
        }
        for (VehiculoTransporteTropa v : listVehiculosTransporteTropa) {
            if (v.getId().equals(id)) {
                listVehiculosTransporteTropa.remove(v);
                return true;
            }
        }
        return false;
    }

    public LinkedList<Vehiculo> buscarVehiculosPorAnio(int anio) {
        LinkedList<Vehiculo> resultado = new LinkedList<>();
        LinkedList<Vehiculo> todos = getTodosVehiculos();

        for (Vehiculo v : todos) {
            if (v.getAnioFabricacion() == anio) {
                resultado.add(v);
            }
        }

        resultado.sort((v1, v2) -> {
            int tipoCmp = v1.getClass().getSimpleName().compareTo(v2.getClass().getSimpleName());
            return (tipoCmp != 0) ? tipoCmp : v1.getModelo().compareTo(v2.getModelo());
        });

        return resultado;
    }

    private LinkedList<Vehiculo> getTodosVehiculos() {
        return null;
    }

    // Ordenar vehículos por misiones completadas (descendente)
    public LinkedList<Vehiculo> ordenarVehiculosPorMisiones() {
        LinkedList<Vehiculo> todos = getTodosVehiculos();
        todos.sort((v1, v2) -> Integer.compare(v2.getMisionesCompletadas(), v1.getMisionesCompletadas()));
        return todos;
    }

    // Actualizar estado operativo de todos los vehículos
    public String actualizarEstadoVehiculos(double umbralKm) {
        int disponibles = 0, enMision = 0, enMantenimiento = 0;
        LocalDate hoy = LocalDate.now();

        for (Vehiculo vehiculo : getTodosVehiculos()) {
            boolean enMisionActiva = false;

            for (Mision m : vehiculo.getListMisiones()) {
                if (!m.getFecha().isBefore(hoy)) {
                    enMisionActiva = true;
                    break;
                }
            }

            if (vehiculo.getKilometraje() > umbralKm) {
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MANTENIMIENTO);
                enMantenimiento++;
            } else if (enMisionActiva) {
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
                enMision++;
            } else {
                vehiculo.setEstadoOperativo(EstadoOperativo.DISPONIBLE);
                disponibles++;
            }
        }

        return "Resumen de estado operativo:\n" +
                "DISPONIBLE: " + disponibles + "\n" +
                "EN_MISION: " + enMision + "\n" +
                "EN_MANTENIMIENTO: " + enMantenimiento;
    }
}