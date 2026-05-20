package sistema;

import java.util.Scanner;

public class ProductoDigital extends Producto {
    private int tamanoDesc;
    private String licencia;

    // constructor
    public ProductoDigital(String nombreProd, double precio, int tamanoDesc, String licencia) {
        super(nombreProd, precio);
        this.tamanoDesc = tamanoDesc;
        this.licencia = licencia;
    }

    // metodo set y get
    public void setTamano(int tamanoDesc) {
        this.tamanoDesc = tamanoDesc;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getTamanoDesc() {
        return this.tamanoDesc;
    }

    public String getLicencia() {
        return this.licencia;
    }

    public double aplicarIVA(String tipoIva) {
        switch (tipoIva) {
            case "GENERAL":
                double result = getPrecioBase() * 1.21;
            case "REDUCIDO":
                 result = getPrecioBase() * 1.10;
            case "SUPER":
                result = getPrecioBase() * 1.04;

        }
        return result;
    }

    public double calcularPrecioFinal(Producto p) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de IVA (todo en minusculas) : ");
        String respuesta = sc.nextLine();
        switch (respuesta) {
            case "general":
                aplicarIVA("GENERAL");
            case "reducido":
                aplicarIVA("REDUCIDO");
            case "super":
                aplicarIVA("SUPER");
            default:
                throw new IllegalArgumentException("Tipo de IVA no válido: " + tipoIva);
        }
    }

}
