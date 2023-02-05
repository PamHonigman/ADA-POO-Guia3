//Realizar en la clase Main, una lista de nombres dados por el usuario, tanto la cantidad de nombres a ingresar y los
//nombres por ingresar.
//Luego eliminaremos el nombre en la ubicación (guiarnos por el índice), numero tres y uno.
//Vamos a ordenar la lista alfabéticamente. Llamar a la clase Collections.sort(nombreLista);
//Después lo mostramos por pantalla el tamaño de la lista (recordemos el método size), y la lista completa de los
//nombres; aplicar la lógica correspondiente para dicho caso.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        List<String> listaNombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que tendrá la lista");
        int n = in.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Ingrese un nombre: ");
            String nombre = in.next();
            listaNombres.add(nombre);
        }

        System.out.println("");

        for (String nombres : listaNombres) {
            System.out.println(nombres);
        }

        System.out.println("");

        listaNombres.remove(3);
        listaNombres.remove(1);

        System.out.println("Se eliminaron las posiciones 1 y 3. La lista contiene ahora " + listaNombres.size() + " " +
                "elementos");

        for (String nombres : listaNombres) {
            System.out.println("\u2726" + nombres);
        }

        System.out.println("");

        Collections.sort(listaNombres);
        System.out.println("Ordenada alfabéticamente: ");

        for (String nombres : listaNombres) {
            System.out.println("\u2726" + " " + nombres);
        }


    }
}