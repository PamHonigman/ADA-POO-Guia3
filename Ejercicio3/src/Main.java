//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se le preguntará al
//usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el
//ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        String raza;
        String fin = "";
        ArrayList<String> listaRazas = new ArrayList<>();

        do {
            System.out.println("Ingrese una raza de perro");
            raza = in.next();
            listaRazas.add(raza);

            System.out.println("Desea agregar otra raza? Ingrese SI o NO");
            fin = in.next();

        } while (fin.equalsIgnoreCase("SI"));

        System.out.println("\nLas razas ingresadas son: ");

        for (String razas : listaRazas) {
            System.out.println("\u2726 " + razas);
        }
    }
}