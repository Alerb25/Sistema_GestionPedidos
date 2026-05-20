package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 class ProductoDigitalTest {

    @Test
     void testAplicarIvaGeneral() {
        ProductoDigital prod = new ProductoDigital("Software A", 100.0, 500, "MIT");
        // 100.0 * 1.21 = 121.0
        assertEquals(121.0, prod.aplicarIVA("GENERAL"), 0.001);
    }

    @Test
     void testAplicarIvaReducido() {
        ProductoDigital prod = new ProductoDigital("Ebook B", 10.0, 15, "Creative Commons");
        // 10.0 * 1.10 = 11.0
        assertEquals(11.0, prod.aplicarIVA("REDUCIDO"), 0.001);
    }

    @Test
     void testAplicarIvaSuper() {
        ProductoDigital prod = new ProductoDigital("Curso C", 50.0, 120, "Comercial");
        // 50.0 * 1.04 = 52.0
        assertEquals(52.0, prod.aplicarIVA("SUPER"), 0.001);
    }

    @Test
     void testPrecioNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProductoDigital("Invalido", -10.5, 0, "Ninguna");
        });
    }
}
