package java;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SistemaTest {

    
    // TEST CLIENTE
    

    @Test
    void testDatosCliente() {

        // Arrange
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 123", "600123456");

        // Act
        String resultado = cliente.Datos();

        // Assert
        assertTrue(resultado.contains("Juan"));
        assertTrue(resultado.contains("Perez"));
        assertTrue(resultado.contains("Calle 123"));
        assertTrue(resultado.contains("600123456"));
    }

    
    // TEST PRODUCTO
    

    @Test
    void testPrecioProductoDigital() {

        // Arrange
        Producto producto = new Producto("Curso Online", 50.0, false);

        // Act
        double precio = producto.calcularPrecio();

        // Assert
        assertEquals(50.0, precio);
    }

    @Test
    void testPrecioProductoFisico() {

        // Arrange
        Producto producto = new Producto("Libro", 30.0, true);

        // Act
        double precio = producto.calcularPrecio();

        // Assert
        assertTrue(precio >= 30.0);
    }

    
    // TEST PEDIDO
    

    @Test
    void testCalcularTotalUnProducto() {

        // Arrange
        Pedido pedido = new Pedido();
        Producto producto = new Producto("Teclado", 20.0, true);

        pedido.agregarProducto(producto);

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(20.0, total);
    }

    @Test
    void testCalcularTotalVariosProductos() {

        // Arrange
        Pedido pedido = new Pedido();

        Producto p1 = new Producto("Raton", 10.0, true);
        Producto p2 = new Producto("Monitor", 100.0, true);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(110.0, total);
    }

    @Test
    void testPedidoVacio() {

        // Arrange
        Pedido pedido = new Pedido();

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(0.0, total);
    }

}