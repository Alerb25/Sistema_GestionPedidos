package sistema;

public class main {
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente(
            "Juan",          // nombre
            "12345678A",     // DNI
            "Pérez",         // apellidos
            "juan@mail.com", // correo
            "Calle Falsa 123",// direccion
            600123456,       // telf
            5,               // añosAntiguedad
            true,            // esVip
            "España",        // pais
            1                // id
        );

       
        ProductoFisico libro = new ProductoFisico(101, "Libro Java", 20.0, 0.0);
        ProductoDigital software = new ProductoDigital(102, "IntelliJ License", 100.0, 500, "Comercial");

       
        System.out.println("Precio base del libro: " + libro.getPrecioBase() + "€");
        System.out.println("Precio base del software: " + software.getPrecioBase() + "€");

        // Crear pedido y añadir productos
        Pedido pedido = new Pedido(1, cliente);
        pedido.agregarProducto(libro);
        pedido.agregarProducto(software);

        // Orquestar venta a través de la Tienda
        Tienda tienda = new Tienda("Fnac", "Gran Vía", 915555555);
        Factura factura = tienda.realizarVenta(cliente, pedido);

        // Imprimir el documento de salida
        factura.imprimirFactura();
    }
}