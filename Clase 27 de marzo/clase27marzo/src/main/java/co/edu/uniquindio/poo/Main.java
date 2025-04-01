package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.animales.Carnivoro;
import co.edu.uniquindio.poo.animales.Herbivoro;
import co.edu.uniquindio.poo.herenciafiguras.Cuadrado;
import co.edu.uniquindio.poo.herenciafiguras.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(4);

        Triangulo t1 = new Triangulo(3);

        //muestra el mensaje
        c1.cantidadLados();
        t1.cantidadLados();

        //Animal
        Carnivoro pejelagarto= new Carnivoro(999,"Feminazi", "Kakaroto");
        Herbivoro profesor= new Herbivoro(3,"profe", "Jirafales");

        pejelagarto.naturaleza();
        profesor.dormir();


    }
}