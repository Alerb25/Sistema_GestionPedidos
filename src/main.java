public class main {
    public static void main(String[] args) {
        //crear cliente
        Cliente cliente1 = new Cliente(
            "Juan", 
            "12345678A", 
            "García López", 
            "juan.garcia@email.com", 
            "Calle Mayor 123, Madrid", 
            612345678
        );

        //comprobar
        System.out.println("Cliente creado: " + cliente1.getNombre() + " " + cliente1.getApellidos());

        // crear producto fisico
        System.out.println("Creando productos físicos...");
        ProductoFisico libro = new ProductoFisico(
            "Libro de Java Avanzado", 
            45.50, 
            5.00  // coste envío
        );
        System.out.println("Producto físico creado: " + libro.getNombre() + " - " + libro.getPrecio() + "€");
        
        ProductoFisico teclado = new ProductoFisico(
            "Teclado Mecánico RGB", 
            89.99, 
            7.50
        );
        System.out.println(" Producto físico creado: " + teclado.getNombre() + " - " + teclado.getPrecio() + "€");
        System.out.println();
        
        // crear producto digital
        System.out.println("Creando productos digitales...");
        ProductoDigital software = new ProductoDigital(
            "Licencia Adobe Creative Cloud", 
            59, 
            2048,  // tamaño descarga en MB
            "Anual"
        );
        System.out.println("Producto digital creado: " + software.getNombre() + " - " + software.getPrecio() + "€");
        
        ProductoDigital ebook = new ProductoDigital(
            "eBook: Programación en Python", 
            19, 
            15,  // tamaño en MB
            "Perpetua"
        );
        System.out.println("Producto digital creado: " + ebook.getNombre() + " - " + ebook.getPrecio() + "€");
        System.out.println();
        
        // crear pedido
        System.out.println("Creando pedido...");
        Pedido pedido1 = new Pedido(1001, cliente1);
        System.out.println("Pedido #1001 creado para " + cliente1.getNombre());
        System.out.println();
        
        //añadir productos al pedido
        System.out.println("Agregando productos al pedido...");
        pedido1.agregarProducto(libro);
        System.out.println("Agregado: " + libro.getNombre());
        
        pedido1.agregarProducto(teclado);
        System.out.println("Agregado: " + teclado.getNombre());
        
        pedido1.agregarProducto(software);
        System.out.println("Agregado: " + software.getNombre());
        
        pedido1.agregarProducto(ebook);
        System.out.println("Agregado: " + ebook.getNombre());
        System.out.println();
        
        // mostrar resumen
        System.out.println("\n" + "=".repeat(50));
        pedido1.mostrarResumen();
        System.out.println("=".repeat(50) + "\n");
        
                       
        // Probar cálculo de precio individual
        System.out.println("\n Precios individuales (con costes adicionales):");
        System.out.println("- " + libro.getNombre() + ": " + 
            String.format("%.2f", libro.calcularPrecio(libro)) + "€ (incluye envío)");
        System.out.println("- " + software.getNombre() + ": " + 
            String.format("%.2f", software.calcularPrecio(software)) + "€");
        
        // Crear segundo pedido para probar
        System.out.println("\n Creando segundo pedido...");
        Cliente cliente2 = new Cliente(
            "María", 
            "87654321B", 
            "Rodríguez Sánchez", 
            "maria.rodriguez@email.com", 
            "Avenida Libertad 45, Barcelona", 
            698765432
        );
        
        Pedido pedido2 = new Pedido(1002, cliente2);
        pedido2.agregarProducto(ebook);
        
        System.out.println("\n" + "=".repeat(50));
        pedido2.mostrarResumen();
        System.out.println("=".repeat(50));
        
        

    }
}
