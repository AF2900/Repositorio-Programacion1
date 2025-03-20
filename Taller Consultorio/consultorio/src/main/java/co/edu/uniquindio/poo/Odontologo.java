package co.edu.uniquindio.poo;

public class Odontologo {
    private final String id;
    private final String nombre;
    private final String numeroLicencia;
    private final Especialidad especialidad;

    public Odontologo(String id, String nombre, String numeroLicencia, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}