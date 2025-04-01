package co.edu.uniquindio.poo.herenciafiguras;

//Clase Padre
public class FiguraGeometrica {
    public int cantLados;

    public FiguraGeometrica(int cantLados) {
        this.cantLados = cantLados;
    }

    public void cantidadLados() {
        System.out.println("La figura tiene:" + cantLados + "Lados");
    }
}
