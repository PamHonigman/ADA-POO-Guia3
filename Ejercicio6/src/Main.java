import entidades.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Pelicula pelicula = new Pelicula();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        String fin = "";
        String titulo;
        String director;
        float duracionHoras;

        do {
            System.out.println("Ingrese el título de la película");
            titulo = in.next();
            //pelicula.setTitulo(titulo);
            System.out.println("Ingrese el director");
            director = in.next();
            //pelicula.setDirector(director);
            System.out.println("Ingrese la duración en horas");
            duracionHoras = in.nextFloat();
            //pelicula.setDuracionHoras(duracionHoras);

            Pelicula peliculas = new Pelicula(titulo, director, duracionHoras);

            listaPeliculas.add(peliculas);

            System.out.println("Si desea agregar otra película, ingrese SI, de lo contrario presione cualquier letra");
            fin = in.next();

        } while (fin.equalsIgnoreCase("si"));

        System.out.println("Lista de películas almacenadas:");

        for (Pelicula peliculas : listaPeliculas) {
            System.out.println(peliculas);
        }

        System.out.println("\nLas películas con una duración mayor a 2 hs son: ");
        for (Pelicula peliculas : listaPeliculas) {
            if (peliculas.getDuracionHoras() >= 2){
                System.out.println(peliculas.getTitulo());
            }
        }
        System.out.println("\nLas películas con una duración menor a 2 hs son: ");
        for (Pelicula peliculas : listaPeliculas) {
            if (peliculas.getDuracionHoras() < 2){
                System.out.println(peliculas.getTitulo());
            }
        }
    }
}