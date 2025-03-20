package co.edu.uniquindio.poo;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultorioOdontologico consultorio = new ConsultorioOdontologico();

        // Registrar odontólogos
        consultorio.registrarOdontologo("001", "Dr. Pérez", "12345", Especialidad.ORTODONCIA);
        consultorio.registrarOdontologo("002", "Dra. López", "67890", Especialidad.ENDODONCIA);

        // Registrar pacientes
        consultorio.registrarPaciente("HC001", "Juan Pérez", 30, "555-1234", "Calle A 123", "2024-03-10", 6);
        consultorio.registrarPaciente("HC002", "Ana Gómez", 25, "555-5678", "Calle B 456", "2024-02-15", 3);
        consultorio.registrarPaciente("HC003", "Carlos Díaz", 40, "555-9012", "Calle C 789", "2024-01-20", 7);

        // Obtener pacientes con más de 5 tratamientos
        List<Paciente> pacientesEspeciales = consultorio.obtenerPacientesConMasDe5Tratamientos();
        System.out.println("Pacientes con más de 5 tratamientos:");
        for (Paciente p : pacientesEspeciales) {
            System.out.println(p.nombre() + " - Historia Clínica: " + p.historiaClinica());
        }
    }
}