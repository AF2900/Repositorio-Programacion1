package co.edu.uniquindio.poo;

import java.lang.reflect.Array;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleado;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleado=new Empleado[50];
        cargarDatos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int validarCupo(){
        for(int i= listEmpleado.length-1;i>=0; i--){
            if(listEmpleado[i]==null){
                return i;
            }
        }
        return -1;
    }

    public int buscarEmpleado(String idEmpleadoBuscar){
        for(int i= listEmpleado.length-1;i>=0; i--){
            if(listEmpleado[i] != null && listEmpleado[i].getCedula().equals(idEmpleadoBuscar)){
                return i;
            }
        }
        return -1;
    }

    public boolean crearEmpleado(Empleado newEmpleado){
        int espacioLibre=validarCupo();
        if(espacioLibre!=-1 && buscarEmpleado(newEmpleado.getCedula())==-1){
            newEmpleado.setSalario(asignarSalarioPorCargo(newEmpleado.getCargo()));
            listEmpleado[espacioLibre]=newEmpleado;
            return true;
        }
        return false;
    }

    public boolean actualizarEmpleado(String idEmpleadoActualizar,Empleado empleadoTuneado){
        int posicionEmpleadoBuscar=buscarEmpleado(idEmpleadoActualizar);
        if(posicionEmpleadoBuscar!=-1){
            empleadoTuneado.setSalario(asignarSalarioPorCargo(empleadoTuneado.getCargo()));
            listEmpleado[posicionEmpleadoBuscar]=empleadoTuneado;
            return true;
        }
        return false;
    }

    public Empleado[] buscarEmpleadoCargo(String cargo){
        int cantEmpleadoCargo=0;
        for(int i= listEmpleado.length-1;i>=0; i--){
            if(listEmpleado[i] != null && listEmpleado[i].getCargo().equals(cargo)){
                cantEmpleadoCargo++;
            }
        }
        Empleado[] listEmpleadoCargo= new Empleado[cantEmpleadoCargo];
        int indice=0;
        for(int i= listEmpleado.length-1;i>=0; i--){
            if(listEmpleado[i] != null && listEmpleado[i].getCargo().equals(cargo)){
                listEmpleadoCargo[indice]=listEmpleado[i];
                indice++;
            }
        }
        return listEmpleadoCargo;
    }

    public boolean EliminarEmpleado(String idEmpleadoEliminar){
        int posicionEmpleado=buscarEmpleado(idEmpleadoEliminar);
        if(posicionEmpleado!=-1){
            listEmpleado[posicionEmpleado]=null;
            return true;
        }
        return false;
    }

    public void calcularSalarioEmpleados() {
        for(int i= listEmpleado.length-1;i>=0; i--){
            if(listEmpleado[i] != null){
                double aumento = 0;
                if (listEmpleado[i].getTiempoEmpresa() > 10) {
                    aumento = 0.15;
                } else if (listEmpleado[i].getTiempoEmpresa() > 5) {
                    aumento = 0.10;
                } else if (listEmpleado[i].getTiempoEmpresa() > 3) {
                    aumento = 0.05;
                }
                double salarioFinal = listEmpleado[i].getSalario() + (listEmpleado[i].getSalario() * aumento);
                System.out.println(listEmpleado[i].getNombre() + " - Salario final: " + salarioFinal);
            }
        }
    }

    private double asignarSalarioPorCargo(String cargo) {
        switch (cargo.toLowerCase()) {
            case "ingeniero": return 5000;
            case "diseñador": return 4500;
            case "gerente": return 7000;
            case "analista": return 4000;
            default: return 3500; // Salario base por defecto
        }
    }

    private void cargarDatos() {
        crearEmpleado(new Empleado("Juan Pérez", "12345", "Ingeniero", 6, asignarSalarioPorCargo("Ingeniero")));
        crearEmpleado(new Empleado("Ana López", "67890", "Diseñadora", 4, asignarSalarioPorCargo("Diseñadora")));
        crearEmpleado(new Empleado("Carlos Díaz", "54321", "Gerente", 12, asignarSalarioPorCargo("Gerente")));
    }
}