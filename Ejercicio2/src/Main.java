import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Long> numerosContactos = new ArrayList<>();

        long numero;
        String fin = "";

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        do {

            System.out.println("Ingrese el número de teléfono a almacenar");
            numero = in.nextLong();
            numerosContactos.add(numero);

            System.out.println("Desea agregar otro número más? Ingrese SI o NO");
            fin = in.next();

        } while (fin.equalsIgnoreCase("si"));

        System.out.println("\nLos números almacenados son: ");

        for (Long numeros : numerosContactos) {
            System.out.println(numeros);
        }





    }
}
