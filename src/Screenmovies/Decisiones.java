package Screenmovies;

public class Decisiones {
    public static void main(String[] args) {
        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double calificacion = (8.0 + 7.5 + 9.7 + 8.4)/4;
        String tipoPlan = "plus";

        if(fechaLanzamiento >= 2020){
            System.out.println("Peliculas Populares");
        } else {
            System.out.println("Peliculas Retro Cool");
        }

        if (incluidoEnPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        } else {
            System.out.println("Pelicula no incluida en el plan actual");
        }
    }
}
