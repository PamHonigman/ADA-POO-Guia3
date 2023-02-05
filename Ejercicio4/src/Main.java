import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        String raza, eliminar;
        String fin = "";
        ArrayList<String> listaRazas = new ArrayList<>();
        boolean encontro = false;

        do {
            System.out.println("Ingrese una raza de perro");
            raza = in.next();
            listaRazas.add(raza);

            System.out.println("Desea agregar otra raza? Ingrese SI o NO");
            fin = in.next();

        } while (fin.equalsIgnoreCase("SI"));

        Collections.sort(listaRazas);

        System.out.println("\nLas razas ingresadas son: ");

        for (String razas : listaRazas) {
            System.out.println("\u2726 " + razas);
        }



//después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista
//con un Iterator, se buscará el perro en la lista.
// Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
//encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.

        System.out.println("\nIngrese la raza de perro que desea eliminar del listado");
        eliminar = in.next();

        Iterator<String> iterator = listaRazas.iterator();

        while(iterator.hasNext()) {
            String i = iterator.next();
            if (i.equalsIgnoreCase(eliminar)) {
                iterator.remove();
                encontro = true;

                System.out.println("\nSe ha eliminado la raza seleccionada" +
                        "\nLista actualizada: ");
            }
        }

        if (!encontro) {
            System.out.println("\nLa raza no se encuentra en el listado." +
                    "\nLista de razas:");
        }

        for (String razas : listaRazas) {
            System.out.println("\u2726 " + razas);
        }
    }
}

