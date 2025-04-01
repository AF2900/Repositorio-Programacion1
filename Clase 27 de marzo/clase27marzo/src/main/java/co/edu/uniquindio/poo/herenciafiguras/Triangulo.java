package co.edu.uniquindio.poo.herenciafiguras;

public class Triangulo extends FiguraGeometrica {

    //Creacion super, clase hija de fig. geometrica...
    public Triangulo(int cantLados){
        super(cantLados);
    }

    @Override //Sobreescritura
    public void cantidadLados() {
        System.out.println("El triangulo tiene " +cantLados + "Lados");
    }
}
