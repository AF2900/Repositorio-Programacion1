package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private List<Matriculado> listaNiños;

    public Guarderia() {
        this.listaNiños = new ArrayList<>();
    }

    public void agregarNino(Matriculado nino) {
        listaNiños.add(nino);
    }

    public List<Matriculado> obtenerNinosMayoresA5() {
        List<Matriculado> mayores = new ArrayList<>();
        for (Matriculado nino : listaNiños) {
            if (nino.getEdad() > 5) {
                mayores.add(nino);
            }
        }
        return mayores;
    }

    public void mostrarNinos() {
        for (Matriculado nino : listaNiños) {
            System.out.println(nino);
        }
    }
}