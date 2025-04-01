package co.edu.uniquindio.poo;

public class Apoyo extends VehiculoMilitar{
    private TipoFuncion tipoFuncion;

    public Apoyo(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion){
        super(id, modelo, fechaFabricacion, kilometraje);
        this.tipoFuncion = tipoFuncion;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}
