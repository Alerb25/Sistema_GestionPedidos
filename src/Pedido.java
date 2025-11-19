import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private ArrayList<Producto> productos;

    // se utiliza método agregar producto
    // (coger el tipo de producto, el nombre, y los atributos que tenga segun el
    // tipo)
    public void agregarProducto(){
         
    }

    // metodo calcularTotal() (vamos sumarle el IVA)
    public void calcularTotal(Pedido pd){
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
    public void mostrarResumen(Pedido p) {
        System.out.println("El resumen del pedido es:  ");
        System.out.println("el numero de pedido");
        String s = String.valueOf(numPedido);
        System.out.println(s);
        System.out.println("El listado de productos: ");

        // llamar a listarProductos
        System.out.println(p.listarProductos());
        

    }

}
