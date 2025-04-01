package co.edu.uniquindio.poo.animales;

public class Herbivoro extends Animal {
    public Herbivoro(int cantidadPatas,String genero,String especie) {
        super(cantidadPatas,genero,especie);
    }
    @Override
    public void naturaleza() {
        System.out.println("El"+ especie+"esta siendo natural");

    }
}
