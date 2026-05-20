package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

 class PedidoTest {

    // Clase Mock/Stub interna para evitar que el Scanner de consola rompa el test automatizado
    private static class ProductoTestStub extends Producto {
        private double precioSimulado;

         ProductoTestStub(int id, String nombre, double precioBase, double precioSimulado) {
            super(id, nombre, precioBase);
            this.precioSimulado = precioSimulado;
        }

        @Override
         public double calcularPrecioFinal() {
            return this.precioSimulado;
        }
    }

    @Test
     void testPedidoVacioLanzaExcepcion() {
        Cliente cliente = new Cliente("Juan", "12345678A", "Pérez", "juan@mail.com", "Madrid", 600123456, 2, false, "España", 1);
        Pedido pedido = new Pedido(101, cliente);

        assertThrows(IllegalStateException.class, pedido::calcularTotal);
    }

    @Test
     void testGestionDinamicaProductos() {
        Cliente cliente = new Cliente("Juan", "12345678A", "Pérez", "juan@mail.com", "Madrid", 600123456, 2, false, "España", 1);
        Pedido pedido = new Pedido(102, cliente);
        
        Producto prod = new ProductoTestStub(1, "Prod1", 10.0, 15.0);
        
        pedido.agregarProducto(prod);
        assertEquals(15.0, pedido.calcularTotal(), 0.001);
        
        pedido.eliminarProducto(prod);
        assertThrows(IllegalStateException.class, pedido::calcularTotal);
    }

    @ParameterizedTest
    @CsvSource({
        "10.0, 12.0, 22.0",
        "50.0, 50.0, 100.0",
        "0.0, 5.5, 5.5"
    })
     void testCalcularTotalParametrizado(double precioP1, double precioP2, double totalEsperado) {
        Cliente cliente = new Cliente("Juan", "12345678A", "Pérez", "juan@mail.com", "Madrid", 600123456, 2, false, "España", 1);
        Pedido pedido = new Pedido(103, cliente);

        pedido.agregarProducto(new ProductoTestStub(1, "P1", 0, precioP1));
        pedido.agregarProducto(new ProductoTestStub(2, "P2", 0, precioP2));

        assertEquals(totalEsperado, pedido.calcularTotal(), 0.001);
    }
}