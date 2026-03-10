package sistema;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sistema.Cliente;
import sistema.Producto;
import sistema.ProductoDigital;
import sistema.ProductoFisico;
import sistema.Pedido;


public class SistemaTest {
    Cliente cli = new Cliente("Maria", "11111111A", "Perez", "maria@gmail.com", "Calle 123", 111111111);
    
    // TEST CLIENTE
    

    @Test
    void testDatosCliente() {

        // Arrange
        Cliente cliente = new Cliente("Juan", "44444444A", "Perez", "juan@gmail.com", "Calle 123", 600123456);

        // Act
        String resultado = cliente.Datos();
        // Assert
        assertTrue(resultado.contains("Juan"));
        assertTrue(resultado.contains("44444444A"));
        assertTrue(resultado.contains("Perez"));
        assertTrue(resultado.contains("juan@gmail.com"));
        assertTrue(resultado.contains("Calle 123"));
        assertTrue(resultado.contains("600123456"));
    }

    
    // TEST PRODUCTO
    

    @Test
    void testPrecioProductoDigital() {

        // Arrange
        ProductoDigital producto = new ProductoDigital("Curso Online", 50.0, 5,"licencia");

        // Act
        double precio = producto.calcularPrecio(producto);

        // Assert
        assertEquals(50.0, precio);
    }

    @Test
    void testPrecioProductoFisico() {

        // Arrange
        ProductoFisico producto = new ProductoFisico("Libro", 30.0, 3.0);

        // Act
        double precio = producto.calcularPrecio(producto);

        // Assert
        assertTrue(precio >= 30.0);
    }

    
    // TEST PEDIDO
    

    @Test
    void testCalcularTotalUnProducto() {

        // Arrange
        Pedido pedido = new Pedido(0, cli);
        ProductoFisico producto = new ProductoFisico("Teclado", 20.0, 5.0);

        pedido.agregarProducto(producto);

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(30.25, total);
    }

    @Test
    void testCalcularTotalVariosProductos() {

        // Arrange
        Pedido pedido = new Pedido(0, cli);

        ProductoFisico p1 = new ProductoFisico("Raton", 10.0, 2.0);
        ProductoFisico p2 = new ProductoFisico("Monitor", 100.0, 5.0);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertNotEquals(110.0, total);
    }

    @Test
    void testPedidoVacio() {

        // Arrange
        Pedido pedido = new Pedido(0, cli);

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertNotEquals(1.0, total);
    }

}