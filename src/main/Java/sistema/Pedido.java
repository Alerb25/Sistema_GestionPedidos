package sistema;

import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Pedido(int numPedido, Cliente cliente) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    
    public void agregarProducto(Producto o) {
        if (o != null) {
            productos.add(o);
        }
    }

    public double calcularTotal() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("El pedido no tiene productos");
        }
        
        double total = 0;
        for (Producto p : productos) {
            // Evaluamos dinámicamente si es un producto físico para aplicarle el país del cliente
            if (p instanceof ProductoFisico) {
                ProductoFisico pf = (ProductoFisico) p;
                double costeEnvio = pf.calcularCosteEnvio(this.cliente.getPais());
                total += pf.getPrecioBase() + costeEnvio;
            } else {
                total += p.calcularPrecioFinal(); 
            }
        }
        return total;
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public String listarProductos() {
        StringBuilder sb = new StringBuilder();
        for (Producto p : productos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public int getNumPedido() {
        return this.numPedido;
    }

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