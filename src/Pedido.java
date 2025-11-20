import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private ArrayList<Producto> productos;

    public Pedido(int numPedido) {
        this.numPedido = numPedido;
        this.productos = new ArrayList<>();  // Inicializar aquí
    }


    // se utiliza método agregar producto
    // (coger el tipo de producto, el nombre, y los atributos que tenga segun el
    // tipo)
    public void agregarProducto( Producto o){
         productos.add(o);
    }

    // metodo calcularTotal() (vamos sumarle el IVA)
    public void calcularTotal(){
        for (Producto p : productos){
            double suma = 0;
            suma = p.calcularPrecio(p);
            suma = suma * 1.21; //para calcular el IVA del 21%
            System.out.println( suma );
        }

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
    public void mostrarResumen(){
        System.out.println("=== RESUMEN DEL PEDIDO ===");
        System.out.println("Número de pedido: " + numPedido);
        System.out.println("\nListado de productos:");
        System.out.println(listarProductos());
        System.out.println("Total (con IVA): " + calcularTotal() + "€");

    }

}
