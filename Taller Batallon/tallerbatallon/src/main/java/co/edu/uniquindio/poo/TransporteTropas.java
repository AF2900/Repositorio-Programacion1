package co.edu.uniquindio.poo;

public class TransporteTropas extends VehiculoMilitar{
    private int cantidadSoldados;

    public TransporteTropas(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int cantidadSoldados){
        super(id, modelo, fechaFabricacion, kilometraje);
        this.cantidadSoldados = cantidadSoldados;
    }

    public int getCantidadSoldados(){
        return cantidadSoldados;
    }

    public void setCantidadSoldados(int cantidadSoldados){
        this.cantidadSoldados = cantidadSoldados;
    }
}
