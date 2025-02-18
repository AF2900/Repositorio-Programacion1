package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private String id;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;

    public Empleado(String nombre, String id, String puesto, String correo, String telefono, String fechaContratacion) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", puesto='" + puesto + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                '}';
    }
}
