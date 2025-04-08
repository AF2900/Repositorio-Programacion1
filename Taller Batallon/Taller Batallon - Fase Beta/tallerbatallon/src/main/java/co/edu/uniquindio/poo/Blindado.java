package co.edu.uniquindio.poo;

public class Blindado extends VehiculoMilitar{
    private String nivelBlindaje;

    public Blindado(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, String nivelBlindaje){
        super(id, modelo, fechaFabricacion, kilometraje);
        this.nivelBlindaje = nivelBlindaje;
    }

    public String getNivelBlindaje(){
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje){
        this.nivelBlindaje = nivelBlindaje;
    }
}
