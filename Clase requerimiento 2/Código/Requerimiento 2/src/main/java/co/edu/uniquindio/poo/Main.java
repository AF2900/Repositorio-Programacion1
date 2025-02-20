package co.edu.uniquindio.poo;

import java.util.Scanner;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guarderia guarderia = new Guarderia();

        System.out.print("Ingrese la cantidad de niños a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n");
            System.out.println("Registro del niño " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Género: ");
            String genero = scanner.nextLine();
            System.out.print("Documento de identidad: ");
            String documento = scanner.nextLine();
            System.out.print("Alergias: ");
            String alergias = scanner.nextLine();
            System.out.print("Nombre del acudiente: ");
            String acudiente = scanner.nextLine();
            System.out.print("Número de contacto del acudiente: ");
            String contacto = scanner.nextLine();

            Matriculado nino = new Matriculado(nombre, id, edad, genero, documento, alergias, acudiente, contacto);
            guarderia.agregarNino(nino);
        }

        System.out.println("\nLista de niños matriculados:");
        guarderia.mostrarNinos();

        System.out.println("\nNiños mayores a 5 años:");
        List<Matriculado> mayoresA5 = guarderia.obtenerNinosMayoresA5();
        for (Matriculado nino : mayoresA5) {
            System.out.println(nino);
        }

        ///Recomendado para buenas prácticas, ya que permite que no hayan fugas en la memoria y ayuda a la eficiencia del código///
        scanner.close();
    }
}