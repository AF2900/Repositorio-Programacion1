package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private String cargo;
    private String cedula;
    private int tiempoEmpresa;
    private double salario;

    public Empleado(String nombre, String cargo, String cedula, int tiempoEmpresa, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.cedula = cedula;
        this.tiempoEmpresa = tiempoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTiempoEmpresa() {
        return tiempoEmpresa;
    }

    public void setTiempoEmpresa(int tiempoEmpresa) {
        this.tiempoEmpresa = tiempoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cedula='" + cedula + '\'' +
                ", tiempoEmpresa=" + tiempoEmpresa +
                ", salario=" + salario +
                '}';
    }
}
