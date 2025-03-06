package co.edu.uniquindio.poo;

///Empresa empresa;
///empresa.crearEmpleado("Sans", "Empleada", 59883, 20);
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
        String nit = JOptionPane.showInputDialog("Ingrese el NIT de la empresa:");
        Empresa empresa = new Empresa(nombre, nit);

        int opcion;
        do {
            String menu = "--- Menú ---\n" +
                    "1. Agregar empleado\n" +
                    "2. Mostrar empleados\n" +
                    "3. Buscar empleado por cédula\n" +
                    "4. Buscar empleados por cargo\n" +
                    "5. Actualizar empleado\n" +
                    "6. Eliminar empleado\n" +
                    "7. Calcular salarios\n" +
                    "8. Salir\n" +
                    "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombreEmp = JOptionPane.showInputDialog("Ingrese nombre:");
                    String cedula = JOptionPane.showInputDialog("Ingrese cédula:");
                    String cargo = JOptionPane.showInputDialog("Ingrese cargo:");
                    int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años en la empresa:"));

                    if (empresa.crearEmpleado(new Empleado(nombreEmp, cedula, cargo, tiempo, 0))) {
                        JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el empleado.");
                    }
                    break;
                case 2:
                    StringBuilder listaEmpleados = new StringBuilder();
                    for (Empleado emp : empresa.buscarEmpleadoCargo("")) {
                        if (emp != null) {
                            listaEmpleados.append(emp.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaEmpleados.length() > 0 ? listaEmpleados.toString() : "No hay empleados registrados.");
                    break;
                case 3:
                    String cedulaBuscar = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                    Empleado encontrado = empresa.buscarEmpleado(cedulaBuscar) != -1 ? empresa.buscarEmpleadoCargo(cedulaBuscar)[0] : null;
                    JOptionPane.showMessageDialog(null, encontrado != null ? encontrado : "Empleado no encontrado.");
                    break;
                case 4:
                    String cargoBuscar = JOptionPane.showInputDialog("Ingrese el cargo:");
                    Empleado[] empleadosCargo = empresa.buscarEmpleadoCargo(cargoBuscar);
                    StringBuilder listaCargo = new StringBuilder();
                    for (Empleado emp : empleadosCargo) {
                        if (emp != null) {
                            listaCargo.append(emp.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaCargo.length() > 0 ? listaCargo.toString() : "No hay empleados con ese cargo.");
                    break;
                case 5:
                    String cedulaActualizar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a actualizar:");
                    String nuevoCargo = JOptionPane.showInputDialog("Ingrese el nuevo cargo:");
                    int nuevoTiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los nuevos años en la empresa:"));
                    Empleado empleadoActualizado = new Empleado("", cedulaActualizar, nuevoCargo, nuevoTiempo, 0);
                    if (empresa.actualizarEmpleado(cedulaActualizar, empleadoActualizado)) {
                        JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo actualizar el empleado.");
                    }
                    break;
                case 6:
                    String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a eliminar:");
                    if (empresa.EliminarEmpleado(cedulaEliminar)) {
                        JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el empleado.");
                    }
                    break;
                case 7:
                    empresa.calcularSalarioEmpleados();
                    JOptionPane.showMessageDialog(null, "Cálculo de salarios realizado. Ver consola.");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 8);
    }
}


