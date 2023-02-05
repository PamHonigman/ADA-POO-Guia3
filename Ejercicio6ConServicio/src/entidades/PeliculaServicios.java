package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicios {

    private ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicios() {
        this.listaPeliculas = new ArrayList<>();
    }

    public PeliculaServicios(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    String fin = "";

    public void crearPelicula(){
        do {
            Pelicula pelicula = new Pelicula();

            System.out.println("Ingrese el título de la película");
            String titulo = in.next();
            System.out.println("Ingrese el director");
            String director = in.next();
            System.out.println("Ingrese la duración en horas");
            float duracionHoras = in.nextFloat();

            Pelicula peliculas = new Pelicula(titulo, director, duracionHoras);

            listaPeliculas.add(peliculas);

            System.out.println("Si desea agregar otra película, ingrese SI, de lo contrario presione cualquier letra");
            fin = in.next();

        } while (fin.equalsIgnoreCase("si"));
    }
    public void imprimirLista(){
        System.out.println("Lista de películas almacenadas:");

        for (Pelicula peliculas : listaPeliculas) {
            System.out.println(peliculas);
        }
    }

    public void duracionMayorDosHs(){
        System.out.println("\nLas películas con una duración mayor a 2 hs son: ");
        for (Pelicula peliculas : listaPeliculas) {
            if (peliculas.getDuracionHoras() >= 2){
                System.out.println(peliculas.getTitulo());
            }
        }
    }

    public void duracionMenorDosHs(){
        System.out.println("\nLas películas con una duración menor a 2 hs son: ");
        for (Pelicula peliculas : listaPeliculas) {
            if (peliculas.getDuracionHoras() < 2){
                System.out.println(peliculas.getTitulo());
            }
        }
    }





}
