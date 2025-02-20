package co.edu.uniquindio.poo;

public class Matriculado {
    private String nombre;
    private int id;
    private int edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private String nombreAcudiente;
    private String contactoAcudiente;

    public Matriculado(String nombre, int id, int edad, String genero, String documentoIdentidad, String alergias, String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getContactoAcudiente() {
        return contactoAcudiente;
    }

    public void setContactoAcudiente(String contactoAcudiente) {
        this.contactoAcudiente = contactoAcudiente;
    }

    @Override
    public String toString() {
        return "Matriculado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", contactoAcudiente='" + contactoAcudiente + '\'' +
                '}';
    }
}