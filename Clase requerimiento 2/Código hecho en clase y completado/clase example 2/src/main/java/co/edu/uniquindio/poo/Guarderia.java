package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private String direccion;
    private String nit;
    private ArrayList<Estudiante> listaEstudiantes;

    public Guarderia(String nombre, String direccion, String nit, ArrayList<Estudiante> listaEstudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaEstudiantes = listaEstudiantes;
    }
    
    /// proceso CRUD más la lista

    public void mostrarListaEstudiantesMayores(){
        Estudiante nuevoEstudiante = null;
        listaEstudiantes.add(nuevoEstudiante);
    }

    public void crearEstudiante(Estudiante nuevoEstudiante){
        if (nuevoEstudiante != null) {
            listaEstudiantes.add(nuevoEstudiante);
            System.out.println("Estudiante añadido");
        } else {
            System.out.println("El estudiante está vacío.");
        }

    }

    public void eliminarEstudiante(String idEstudianteEliminar){
        for (int i = 0; i< listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getIdentificacion() == idEstudianteEliminar){
                listaEstudiantes.remove(i);
            }
        }

    }

    public void modificarEstudiante(String idEstudianteBuscar, Estudiante estudianteModificado){
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getIdentificacion().equals(idEstudianteBuscar)) {
                listaEstudiantes.set(i, estudianteModificado);
                System.out.println("Estudiante modificado.");
                return;
            }
        }
    }

    public void mostrarListaEstudiantes(){
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(estudiante);
            }
        }
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
