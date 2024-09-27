package Screenmovies;

public class Screenmovies {
    public static void main(String[]args){
        System.out.println("Bienvenid@s a Screen Movies");
        System.out.println("Película Matrix");

        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double calificacion = (8.0 + 7.5 + 9.7 + 8.4)/4;
        int estrellas = (int) (calificacion / 2);


        String sinapsis = """
                Pelicula de ciencia ficción, icono del movimiento Ciberpunk
                Ambientada en un futuro distopico, donde la humanidad está atrapada en una realidad simulada llamada Matrix
                Caracterizada por el avance tecnologico y la incertidumbre de la vida
                Estrenada en:
                """ + fechaLanzamiento + "\n" + """
                Calificacion:
                """ + calificacion + "\n" + """
                Incluido en plan:
                """ +  incluidoEnPlan + "\n" + """
                Estrellas:
                """ + estrellas + "\n";
        System.out.println(sinapsis);



    }
}
