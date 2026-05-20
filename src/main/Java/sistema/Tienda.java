package sistema;

public class Tienda {
    private String nombre;
    private String direccion;
    private int telf;
    private Cliente cliente;
    
    // constructor
    public Tienda(String nombre, String direccion, int telf) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telf = telf;
    }
    
    // metodos set y get
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelf(int telf) {
        this.telf = telf;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public int getTelf() {
        return this.telf;
    }
    
    //metodo principal
    public Factura realizarVenta(Cliente cliente, Pedido pedido) {
    //  Calcular total del pedido
    double totalBruto = pedido.calcularTotal();
    
    // Aplicar descuento de fidelidad del cliente
    double descuento = cliente.getDescuentoFidelidad();
    double totalConDescuento = totalBruto * (1 - descuento);
    
    // Crear y devolver la factura
    return new Factura(cliente, pedido, totalConDescuento);
}
}
