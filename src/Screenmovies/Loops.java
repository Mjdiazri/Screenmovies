package Screenmovies;
import  java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion = 0;
        double sumaPromedio = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Que nota le pondrias a la pelicula Mars Attacks?");
            calificacion = entrada.nextDouble();
            sumaPromedio += calificacion;
        }

        System.out.println("La pelicula Mars Attacks tuvo un promedio de " + sumaPromedio/3);
    }
}
