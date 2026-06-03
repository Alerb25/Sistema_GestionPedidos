package sistema;

import java.time.LocalDate;

public class Factura {
    private String codigoFactura;
    private LocalDate fechaEmision;
    private double totalNeto;
    private double totalIva;
    private double totalEnvio;
    private double totalFinal;

    // constructor teniendo en cuenta que el codigo factura es generado autimaticamente
    public Factura(Cliente cliente, Pedido pedido, double totalConDescuento) {
        this.codigoFactura = String.format("%s-%s-%s", cliente.getNombre(), cliente.getDNI(), pedido.getNumPedido());
        this.fechaEmision = LocalDate.now();
        this.totalNeto = totalConDescuento;
        this.totalIva = pedido.calcularTotal() * 0.21;
        this.totalEnvio = pedido.calcularTotal() * 0.05;
        this.totalFinal = totalConDescuento + this.totalIva + this.totalEnvio;
    }

    public Factura(String string, LocalDate of, double d, double e, double f, double g, double h) {
        this.codigoFactura = string;
        this.fechaEmision = of;
        this.totalNeto = d;
        this.totalIva = e;
        this.totalEnvio = f;
        this.totalFinal = g;
    }
    
     public Factura() {
        // Constructor vacío
    }

    // metodos get y set
    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public void setTotalEnvio(double totalEnvio) {
        this.totalEnvio = totalEnvio;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public String getCodigoFactura() {
        return this.codigoFactura;
    }

    public LocalDate getFechaEmision() {
        return this.fechaEmision;
    }

    public double getTotalNeto() {
        return this.totalNeto;
    }

    public double getTotalIva() {
        return this.totalIva;
    }

    public double getTotalEnvio() {
        return this.totalEnvio;
    }

    public double getTotalFinal() {
        return this.totalFinal;
    }

    // metodos para imprimir la factura
    public void imprimirFactura() {
        System.out.println("=== FACTURA ===");
        System.out.println("Código: " + codigoFactura);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Total neto: " + String.format("%.2f", totalNeto) + "€");
        System.out.println("Total IVA: " + String.format("%.2f", totalIva) + "€");
        System.out.println("Total envío: " + String.format("%.2f", totalEnvio) + "€");
        System.out.println("Total final: " + String.format("%.2f", totalFinal) + "€");
        System.out.println();
    }

    public void setDescuento(double d) {
        this.totalFinal = aplicarDescuento(d);
    }

    public double aplicarDescuento(double d) {
        double precio = gettotalFinal();
        double descuento = precio * (d / 100);
        return precio - descuento;
    }

    public Double getDescuento() {
        return this.descuento();
    }
}
