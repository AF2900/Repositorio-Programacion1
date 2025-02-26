package co.edu.uniquindio.poo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //MI GUIA//
        Estudiante estudiante1 = new Estudiante("Juan Perez", "12345", 5, "Masculino", "Ninguna", "Maria Perez", "321654987");
        Estudiante estudiante2 = new Estudiante("Ana Gomez", "67890", 4, "Femenino", "Polen", "Carlos Gomez", "312345678");

        // Crear lista estudiantes
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        // Crear guardería
        Guarderia guarderia = new Guarderia("Guardería", "Calle 12", "98765654377", listaEstudiantes);

        // Mostrar lista estudiantes
        guarderia.mostrarListaEstudiantes();

        // Crear nuevo estudiante y añadir a guardería
        Estudiante estudiante3 = new Estudiante("Carlos Lopez", "54321", 3, "Masculino", "Ninguna", "Luisa Lopez", "300123456");
        guarderia.crearEstudiante(estudiante3);

        // Mostrar lista de estudiantes después de añadir uno nuevo
        guarderia.mostrarListaEstudiantes();
    }
}