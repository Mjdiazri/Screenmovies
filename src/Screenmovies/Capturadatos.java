package Screenmovies;

import java.util.Scanner;

public class Capturadatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Escribe la nota que le das a la pelicula (1-10)");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

        teclado.close();
    }
}

