package sistema;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductoDigitalTest {

    @Test
    public void testAplicarIvaGeneral() {
        
        ProductoDigital prod = new ProductoDigital(1, "Software A", 100.0, 500, "MIT");
        // 100.0 * 1.21 = 121.0
        assertEquals(121.0, prod.aplicarIVA("GENERAL"), 0.001);
    }

    @Test
    public void testAplicarIvaReducido() {
        
        ProductoDigital prod = new ProductoDigital(2, "Ebook B", 10.0, 15, "Creative Commons");
        // 10.0 * 1.10 = 11.0
        assertEquals(11.0, prod.aplicarIVA("REDUCIDO"), 0.001);
    }

    @Test
    public void testAplicarIvaSuper() {
        
        ProductoDigital prod = new ProductoDigital(3, "Curso C", 50.0, 120, "Comercial");
        // 50.0 * 1.04 = 52.0
        assertEquals(52.0, prod.aplicarIVA("SUPER"), 0.001);
    }

    @Test
    public void testPrecioNegativoLanzaExcepcion() {
        
        assertThrows(IllegalArgumentException.class, () -> {
            new ProductoDigital(4, "Invalido", -10.5, 0, "Ninguna");
        });
    }
}