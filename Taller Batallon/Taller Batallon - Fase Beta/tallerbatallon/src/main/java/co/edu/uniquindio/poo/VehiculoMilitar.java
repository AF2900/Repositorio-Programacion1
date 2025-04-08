package co.edu.uniquindio.poo;

public abstract class VehiculoMilitar {
    protected String id;
    protected String modelo;
    protected String fechaFabricacion;
    protected int kilometraje;
    protected int misionesCompletadas;
    protected EstadoOperativo estadoOperativo;

    public VehiculoMilitar(String id, String modelo, String fechaFabricacion, int kilometraje, int misionesCompletadas, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = misionesCompletadas;
        this.estadoOperativo = estadoOperativo;
    }

    public abstract void desplazar();

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

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }
}