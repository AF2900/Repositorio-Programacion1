package co.edu.uniquindio.poo;

public class Apoyo extends VehiculoMilitar{
    private TipoApoyo tipoApoyo;

    public Apoyo(String id, String modelo, String fechaFabricacion, int kilometraje, int cantidadMisiones, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechaFabricacion, kilometraje, cantidadMisiones, estadoOperativo);
        this.tipoApoyo = tipoApoyo;
    }

    public TipoApoyo getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(TipoApoyo tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }

    @Override
    public void desplazar(){
        System.out.println("El vehiculo desplazado es:" + getId());
    }
}
