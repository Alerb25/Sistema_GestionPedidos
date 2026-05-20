package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GestionPedidosIntegrationTest {

    @Test
    public void deberiaCalcularTotalConProductosMixtos() {
        // Cliente en Francia (coste envío para producto físico = 5€)
        Cliente cliente = new Cliente("Test", "123", "User", "a@b.com", "Dir", 123, 1, false, "Francia", 1);
        Pedido pedido = new Pedido(1, cliente);

        // Producto Físico: Base 50€ + 5€ Envío (Francia) = 55€
        ProductoFisico pf = new ProductoFisico(1, "Fisico", 50.0, 0.0);
        
        // Producto Digital: Base 30.578€ * 1.21 (IVA General) = 37.0€
        ProductoDigital pd = new ProductoDigital(2, "Digital", 30.5785, 100, "Licencia");

        pedido.agregarProducto(pf);
        pedido.agregarProducto(pd);

        // 55.0 + 37.0 = 92.0
        assertEquals(92.0, pedido.calcularTotal(), 0.001, "El pedido no integró correctamente los precios finales de los productos");
    }

    @Test
    public void deberiaDarCeroSiNoHayProductos() {
        Cliente cliente = new Cliente("Test", "123", "User", "a@b.com", "Dir", 123, 1, false, "España", 1);
        Pedido pedido = new Pedido(2, cliente);

        // Según la regla de negocio del enunciado, un pedido vacío DEBE lanzar excepción.
        // Cambiamos el test para alinearlo con la regla de negocio real exigida.
        assertThrows(IllegalStateException.class, () -> {
            pedido.calcularTotal();
        }, "El pedido debe lanzar excepción si no tiene productos");
    }

    @Test
    public void noDeberiaFallarSiSeAgregaProductoNulo() {
        Cliente cliente = new Cliente("Test", "123", "User", "a@b.com", "Dir", 123, 1, false, "España", 1);
        Pedido pedido = new Pedido(3, cliente);

        // Añadimos un producto real y uno nulo
        ProductoDigital pd = new ProductoDigital(3, "Digital OK", 10.0, 10, "L");
        pedido.agregarProducto(pd);
        
        // Ejecución de robustez: no debe reventar con NullPointerException
        assertDoesNotThrow(() -> {
            pedido.agregarProducto(null);
            pedido.calcularTotal();
        }, "El sistema debería filtrar productos nulos en la integración");
    }
}