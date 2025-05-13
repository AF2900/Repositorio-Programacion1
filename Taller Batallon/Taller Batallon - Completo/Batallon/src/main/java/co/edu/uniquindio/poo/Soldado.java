package co.edu.uniquindio.poo;

public class Soldado {
    private String nombre;
    private String id;
    private int edad;
    private boolean disponibilidad;
    Especializacion especializacion;
    RangoMilitar rangoMilitar;

    public Soldado(String nombre, String id, int edad, boolean disponibilidad, Especializacion especializacion, RangoMilitar rangoMilitar){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.disponibilidad = disponibilidad;
        this.especializacion = especializacion;
        this.rangoMilitar = rangoMilitar;
    }

    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getDisponibilidad(){
        return disponibilidad;
    }

    public Especializacion getEspecializacion(){
        return especializacion;
    }

    public RangoMilitar getRangoMilitar(){
        return rangoMilitar;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }

    public void setEspecializacion(Especializacion especializacion){
        this.especializacion = especializacion;
    }

    public void setRangoMilitar(RangoMilitar rangoMilitar){
        this.rangoMilitar = rangoMilitar;
    }
}