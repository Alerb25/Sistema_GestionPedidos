package sistema;

import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Pedido(int numPedido, Cliente cliente) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.productos = new ArrayList<>(); // Inicializar aquí
    }

    // se utiliza método agregar producto
    // (coger el tipo de producto, el nombre, y los atributos que tenga segun el
    // tipo)
    public void agregarProducto(Producto o) {
        productos.add(o);
    }

    // metodo calcularTotal() (vamos sumarle el IVA)
    public double calcularTotal() {
        if (productos.isEmpty())
            throw new IllegalStateException("El pedido no tiene productos");
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal(); // cada uno aplica su lógica
        }
        return total;
    }

    // metodo eliminarProducto
    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    // metodo listarProductos
    public String listarProductos() {
        StringBuilder sb = new StringBuilder();

        for (Producto p : productos) {
            sb.append(p.toString()).append("\n");
        }

        return sb.toString();
    }

    // mostrarResumen()
    public void mostrarResumen() {
        System.out.println("=== RESUMEN DEL PEDIDO ===");
        System.out.println("Número de pedido: " + numPedido);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        System.out.println("DNI: " + cliente.getDNI());
        System.out.println("\nListado de productos:");
        System.out.println(listarProductos());
        System.out.println("Total (con IVA): " + String.format("%.2f", calcularTotal()) + "€");
    }

}
