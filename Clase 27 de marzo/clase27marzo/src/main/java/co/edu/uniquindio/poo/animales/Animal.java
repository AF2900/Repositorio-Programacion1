package co.edu.uniquindio.poo.animales;

public class Animal {
    public int cantidadPatas;
    public String genero;
    public String especie;

    public Animal(int cantidadPatas, String genero, String especie) {
        this.cantidadPatas = cantidadPatas;
        this.genero=genero;
        this.especie=especie;
    }

    public void comer(){
        System.out.println("El "+especie+"esta comiendo");
    }

    public void dormir(){
        System.out.println("Zzzz, me gustan las galletas, ZzZzZz");
    }

    public void naturaleza(){
        System.out.println("El"+ especie+"esta cagando");
    }

}
