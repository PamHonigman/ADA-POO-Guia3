package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductoServicio {

    private ArrayList<Producto> listaProductos;
    String fin = "";

    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void crearProducto(String tipo, int cantidad, double precioUnitario){

        Producto producto = new Producto();

        producto.setTipo(tipo);
        producto.setCantidad(cantidad);
        producto.setPrecioUnitario(precioUnitario);

        añadirProducto(producto);

    }

    public void añadirProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public void crearProductoDinamico(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        do {
            Producto producto = new Producto();

            System.out.println("Ingrese el nombre del producto");
            String tipo = in.next();
            System.out.println("Ingrese la cantidad");
            int cantidad = in.nextInt();
            System.out.println("Ingrese el precio unitario");
            double precioUnitario = in.nextDouble();

            System.out.println("Si desea agregar otro producto a la lista ingrese SI, de lo contrario presione " +
                    "cualquier letra");

            fin = in.next();

            this.crearProducto(tipo, cantidad, precioUnitario);
            //añadirProducto(producto);



        } while (fin.equalsIgnoreCase("si"));
    }

    public void imprimirLista(){
        Collections.sort(listaProductos, new TipoComparator());

        System.out.println("\nLos elementos cargados hasta el momento son: \n");
        for (Producto productosAux : listaProductos) {
            System.out.println(productosAux.toString());
        }
    }

    public void productosMayores20(){
        System.out.println("\nPRODUCTOS CON PRECIO UNITARIO MAYOR A $20: ");
        for (Producto productosAux : listaProductos) {
            if (productosAux.getPrecioUnitario() > 20){
                System.out.println("\t" + productosAux);
            }
        }
    }

    public void productosMenores100(){
        System.out.println("\nPRODUCTOS CON PRECIO UNITARIO MENOR A $100: ");
        for (Producto productosAux : listaProductos) {
            if (productosAux.getPrecioUnitario() < 100){
                System.out.println("\t" + productosAux);
            }
        }
    }

}
