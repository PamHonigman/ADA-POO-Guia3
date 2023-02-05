import entidades.PeliculaServicios;

public class Main {
    public static void main(String[] args) {

        PeliculaServicios pelicula1 = new PeliculaServicios();

        pelicula1.crearPelicula();
        System.out.println("");
        pelicula1.imprimirLista();
        pelicula1.duracionMayorDosHs();
        pelicula1.duracionMenorDosHs();
    }
}