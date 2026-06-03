package sistema;

import java.util.Scanner;

public class ProductoDigital extends Producto {
    private int tamanoDesc;
    private String licencia;

    
    public ProductoDigital(int id, String nombreProd, double precio, int tamanoDesc, String licencia) {
        super(id, nombreProd, precio);
        this.tamanoDesc = tamanoDesc;
        this.licencia = licencia;
    }

    public ProductoDigital(int i, String string, int j) {
        super(i, string, j);
    }

     public ProductoDigital() {
        // Constructor vacío
    }
  

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
       
        double result = 0;
        switch (tipoIva) {
            case "GENERAL":
                result = getPrecioBase() * 1.21;
                break;
            case "REDUCIDO":
                 result = getPrecioBase() * 1.10;
                 break;
            case "SUPER":
                result = getPrecioBase() * 1.04;
                break;
            default:
                result = getPrecioBase();
                break;
        }
        return result;
    }

    @Override
    public double calcularPrecioFinal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de IVA (todo en minusculas): ");
        String respuesta = sc.nextLine();
        double precioFinal = 0;
        
        switch (respuesta) {
            case "general":
                precioFinal = aplicarIVA("GENERAL");
                break;
            case "reducido":
                precioFinal = aplicarIVA("REDUCIDO");
                break;
            case "super":
                precioFinal = aplicarIVA("SUPER");
                break;
            default:
                throw new IllegalArgumentException("Tipo de IVA no válido: " + respuesta);
        }
        return precioFinal;
    }
}