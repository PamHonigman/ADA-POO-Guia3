import entidades.ProductoServicio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProductoServicio producto = new ProductoServicio();

        producto.crearProductoDinamico();
        //producto.crearProducto("Coca Cola", 35, 428);
        //producto.crearProducto("Jabón líquido Dove", 17, 85);
        //producto.crearProducto("Whiskas sabor pollo", 8, 550.67);

        producto.imprimirLista();
        producto.productosMayores20();
        producto.productosMenores100();


    }
}