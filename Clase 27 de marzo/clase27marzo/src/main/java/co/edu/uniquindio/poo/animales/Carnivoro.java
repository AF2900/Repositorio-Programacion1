package co.edu.uniquindio.poo.animales;

public class Carnivoro extends Animal {

    public Carnivoro(int cantidadPatas,String genero,String especie) {
        super(cantidadPatas,genero,especie);
    }
    @Override
    public void naturaleza() {
        System.out.println("El"+ especie+"esta siendo natural");

    }

}
