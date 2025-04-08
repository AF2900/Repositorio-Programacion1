package co.edu.uniquindio.poo;

public class TransporteTropas extends VehiculoMilitar{
    private int cantidadSoldados;

    public TransporteTropas(String id, String modelo, String fechaFabricacion, int kilometraje, int misionesCompletadas, int cantidadSoldados, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion, kilometraje, misionesCompletadas, estadoOperativo);
        this.cantidadSoldados = cantidadSoldados;
    }

    @Override
    public void desplazar(){
        System.out.println("El vehiculo se desplazado es: " + getId());
    }

    public int getCantidadSoldados(){
        return cantidadSoldados;
    }

    public void setCantidadSoldados(int cantidadSoldados){
        this.cantidadSoldados = cantidadSoldados;
    }
}
