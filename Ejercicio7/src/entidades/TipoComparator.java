package entidades;

import java.util.Comparator;

public class TipoComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Producto producto1 = (Producto) obj1;
        Producto producto2 = (Producto) obj2;

        return producto1.getTipo().compareTo(producto2.getTipo());
    }
}
