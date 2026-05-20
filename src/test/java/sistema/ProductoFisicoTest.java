package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 class ProductoFisicoTest {

    @Test
     void testCosteEnvioEspana() {
        ProductoFisico prod = new ProductoFisico(0, "Libro", 20.0, 0.0);
        assertEquals(0.0, prod.calcularCosteEnvio("España"), 0.001);
        assertEquals(0.0, prod.calcularCosteEnvio("españa"), 0.001); // Case Insensitive
    }

    @Test
     void testCosteEnvioZonasIntermedias() {
        ProductoFisico prod = new ProductoFisico(0, "Silla", 80.0, 0.0);
        assertEquals(5.0, prod.calcularCosteEnvio("Francia"), 0.001);
        assertEquals(5.0, prod.calcularCosteEnvio("Italia"), 0.001);
        assertEquals(5.0, prod.calcularCosteEnvio("Portugal"), 0.001);
    }

    @Test
     void testCosteEnvioRestoDelMundo() {
        ProductoFisico prod = new ProductoFisico(0, "Consola", 300.0, 0.0);
        assertEquals(10.0, prod.calcularCosteEnvio("Alemania"), 0.001);
        assertEquals(10.0, prod.calcularCosteEnvio("EEUU"), 0.001);
    }
}