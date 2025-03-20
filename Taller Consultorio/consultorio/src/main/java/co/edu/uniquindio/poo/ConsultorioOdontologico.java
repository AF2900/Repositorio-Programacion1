package co.edu.uniquindio.poo;

import java.util.*;

public class ConsultorioOdontologico {
    private final List<Odontologo> odontologos = new ArrayList<>();
    private final List<Paciente> pacientes = new ArrayList<>();


    public void registrarOdontologo(String id, String nombre, String numeroLicencia, Especialidad especialidad) {
        odontologos.add(new Odontologo(id, nombre, numeroLicencia, especialidad));
    }

    public void registrarPaciente(String historiaClinica, String nombre, int edad, String telefono, String direccion,
                                  String fechaUltimaConsulta, int cantidadTratamientos) {
        Paciente nuevoPaciente = new Paciente(historiaClinica, nombre, edad, telefono, direccion, fechaUltimaConsulta, cantidadTratamientos);
        pacientes.add(nuevoPaciente);
    }

    public List<Paciente> obtenerPacientesConMasDe5Tratamientos() {
        List<Paciente> resultado = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (p.cantidadTratamientos() > 5) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}