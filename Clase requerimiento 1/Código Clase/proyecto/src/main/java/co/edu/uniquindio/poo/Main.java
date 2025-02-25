package co.edu.uniquindio.poo;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///Lista estudiantes
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        ///Proceso n estudiantes///
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:"));

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String identificacion = JOptionPane.showInputDialog("Ingrese su identificación: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
            String genero = JOptionPane.showInputDialog("Ingrese el género: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el numero de contacto: ");

            Estudiante estudiantenm1 = new Estudiante(nombre, identificacion, edad, genero, alergias, nombreAcudiente, numeroAcudiente);

            listaEstudiantes.add(estudiantenm1);

            System.out.println(listaEstudiantes);
        }

        ///Arreglos
        ///int[] arregloEnterosDesconocido = new int[n];

//        int[] arregloEnteros = new int[4];
//        int[] arregloEnterosDos = {1,2,3,4};
//        Estudiante[] arregloestudiantes = new Estudiante[4];

//         Importación para arreglos: import java.lang.reflect.Array;

//
//        for(int i = 0; i<= arregloEnteros.length; i++){
//            System.out.println(arregloEnteros[i]);
//
//        ///Listas
//        ArrayList<String> listEjemplo = new ArrayList<>();
//        listEjemplo.add("HOLA");
//        listEjemplo.remove(0);
//        }
    }
}