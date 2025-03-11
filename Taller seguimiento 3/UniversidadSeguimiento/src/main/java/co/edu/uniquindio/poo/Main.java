package main.java.co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Empleado nuevoEmpleadoUno =new Empleado("Douglas Álvarez", "122443344", "Profesor", "douglassandias233@gmail.com", "3214445758", "2023-03-05");
    System.out.println(nuevoEmpleadoUno);
    nuevoEmpleadoUno.setNombre("Kamilo");
    System.out.println(nuevoEmpleadoUno.getNombre());
    }
}
