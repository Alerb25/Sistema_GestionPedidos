package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 class TiendaTest {

    private static class ProductoMock extends Producto {
        private double precioFijo;
         ProductoMock(double precioFijo) {
            super(1, "Mock", 10.0);
            this.precioFijo = precioFijo;
        }
        @Override
         public double calcularPrecioFinal() {
            return precioFijo;
        }
    }

    @Test
     void testRealizarVentaConDescuentoVipYAntiguedad() {
        Tienda tienda = new Tienda("MiTienda", "Calle Mayor 1", 911234567);
        // Cliente VIP con >= 5 años antigüedad -> 15% Descuento (0.15)
        Cliente clienteVip = new Cliente("Ana", "98765432B", "Gómez", "ana@mail.com", "Barcelona", 600987654, 6, true, "España", 2);
        
        Pedido pedido = new Pedido(501, clienteVip);
        pedido.agregarProducto(new ProductoMock(100.0)); // Total Pedido = 100€

        Factura factura = tienda.realizarVenta(clienteVip, pedido);

        assertNotNull(factura);
        // Descuento fidelidad aplicado al Neto: 100 * (1 - 0.15) = 85.0
        assertEquals(85.0, factura.getTotalNeto(), 0.001);
    }

    @Test
     void testRealizarVentaClienteSinDescuento() {
        Tienda tienda = new Tienda("MiTienda", "Calle Mayor 1", 911234567);
        // Cliente nuevo, no VIP -> 0% Descuento
        Cliente clienteNuevo = new Cliente("Luis", "44445555C", "Martínez", "luis@mail.com", "Sevilla", 650112233, 1, false, "España", 3);
        
        Pedido pedido = new Pedido(502, clienteNuevo);
        pedido.agregarProducto(new ProductoMock(50.0));

        Factura factura = tienda.realizarVenta(clienteNuevo, pedido);

        // Sin descuento: 50.0 * (1 - 0.0) = 50.0
        assertEquals(50.0, factura.getTotalNeto(), 0.001);
    }
}