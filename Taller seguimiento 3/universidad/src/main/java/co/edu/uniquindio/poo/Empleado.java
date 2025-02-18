package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private String id;
    private String puesto;
    private String correo;
    private String numero;
    private String fechaContratacion;
    
    public Empleado(String nombre, String id, String puesto, String correo, String numero, String fechaContratacion) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.correo = correo;
        this.numero = numero;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }    
}