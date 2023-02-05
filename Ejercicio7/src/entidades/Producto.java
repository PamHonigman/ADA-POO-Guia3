package entidades;

public class Producto {

    private String tipo;
    private int cantidad;
    private double precioUnitario;

    public Producto() {
    }

    public Producto(String tipo, int cantidad, double precioUnitario) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Descripción: " + tipo +
                ", cantidad: " + cantidad +
                ", precio unitario: $" + precioUnitario;
    }
}
