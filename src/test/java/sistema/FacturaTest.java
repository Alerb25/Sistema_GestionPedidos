package sistema;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

 class FacturaTest {

    private static class ProductoFinalMock extends Producto {
         ProductoFinalMock(double precio) {
            super(99, "Producto Final", precio);
        }
        @Override
        public double calcularPrecioFinal() {
            return this.getPrecioBase();
        }
    }

    @Test
     void testGeneracionYDesgloseFacturaE2E() {
        Cliente cliente = new Cliente("Carlos", "11112222D", "Ruiz", "carlos@mail.com", "Valencia", 611223344, 4, false, "España", 4);
        Pedido pedido = new Pedido(999, cliente);
        pedido.agregarProducto(new ProductoFinalMock(200.0)); // Total bruto pedido = 200.0

        // El cliente tiene 4 años de antigüedad y no es VIP -> 5% descuento (0.05)
        // totalConDescuento (Neto) = 200 * (1 - 0.05) = 190.0
        double totalConDescuento = 190.0;

        Factura factura = new Factura(cliente, pedido, totalConDescuento);

        // Validaciones de la estructura de Datos de salida de la Factura
        assertEquals("Carlos-11112222D-999", factura.getCodigoFactura());
        assertEquals(LocalDate.now(), factura.getFechaEmision());
        assertEquals(190.0, factura.getTotalNeto(), 0.001);
        
        // Según la implementación dada en tu código de Factura:
        // totalIva = pedido.calcularTotal() * 0.21 -> 200 * 0.21 = 42.0
        assertEquals(42.0, factura.getTotalIva(), 0.001);
        
        // totalEnvio = pedido.calcularTotal() * 0.05 -> 200 * 0.05 = 10.0
        assertEquals(10.0, factura.getTotalEnvio(), 0.001);
        
        // totalFinal = totalConDescuento + totalIva + totalEnvio -> 190.0 + 42.0 + 10.0 = 242.0
        assertEquals(242.0, factura.getTotalFinal(), 0.001);
    }
}