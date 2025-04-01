package co.edu.uniquindio.poo;

public class VehiculoMilitar {
    public String id;
    public String modelo;
    public String fechaFabricacion;
    public int kilometraje;
    public EstadoOperativo estadoOperativo;

    public VehiculoMilitar(String id, String modelo, String fechaFabricacion, int kilometraje){
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
    }

    public String getId(){
        return id;
    }

    public String getmodelo(){
        return modelo;
    }

    public String getfechaFabricacion(){
        return fechaFabricacion;
    }

    public int getkilometraje(){
        return kilometraje;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setFechaFabricacion(String fechaFabricacion){
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
}