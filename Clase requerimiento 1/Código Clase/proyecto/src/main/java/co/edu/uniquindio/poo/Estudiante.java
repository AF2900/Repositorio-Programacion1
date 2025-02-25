package co.edu.uniquindio.poo;

public class Estudiante {
    private String nombre;
    private String identificacion;
    private int edad;
    private String genero;
    private String alergias;
    private String nombreAcudiente;
    private String numeroAcudiente;

    public Estudiante(String nombre, String identificacion, int edad, String genero, String alergias, String nombreAcudiente, String numeroAcudiente) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getNumeroAcudiente() {
        return numeroAcudiente;
    }

    public void setNumeroAcudiente(String numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroAcudiente='" + numeroAcudiente + '\'' +
                '}';
    }
}