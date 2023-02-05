import entidades.Alumno;
import entidades.AlumnoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio listaALumno = new AlumnoServicio();
        String nombre;
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String termina = "";

        listaALumno.crearAlumno("Sultán", 10, 9, 8);
        listaALumno.crearAlumno("Shandi", 10, 10, 10);
        listaALumno.crearAlumno("Min", 8, 10, 9);

        System.out.println("Carga de alumnos:");

        do {
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la primer nota");
            nota1 = leer.nextInt();
            System.out.println("Ingrese la segunda nota");
            nota2 = leer.nextInt();
            System.out.println("Ingrese la tercera nota");
            nota3 = leer.nextInt();

            System.out.println("Si desea ingresar otro alumno, ingrese SI, o presione cualquier letra para finalizar");
            termina = leer.next();
            listaALumno.crearAlumno(nombre,nota1,nota2,nota3);

        } while (termina.equalsIgnoreCase("si"));

        System.out.println("\nLista de alumnos:");
        listaALumno.verListado();
    }
}