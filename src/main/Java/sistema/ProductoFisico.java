package sistema;

import java.util.Scanner;

public class ProductoFisico extends Producto {
    private double costeEnvio;
    private double peso;

    // constructor
    public ProductoFisico(int id, String nombreProd, double precio, double costeEnvio) {
        super(id, nombreProd, precio);
        this.costeEnvio = costeEnvio;
    }

    // metodos set y get
    public void setCosteEnv() {
        this.costeEnvio = costeEnvio;
    }

    public double getCosteEnv() {
        return this.costeEnvio;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularCosteEnvio(String pais) {
        if (pais.equalsIgnoreCase("España"))
            return 0;
        else if (pais.equalsIgnoreCase("Francia") ||
                pais.equalsIgnoreCase("Italia") ||
                pais.equalsIgnoreCase("Portugal"))
            return 5;
        else
            return 10;
    }

    public double calcularPrecioFinal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el pais al que se va a enviar: ");
        String respuesta = sc.nextLine();
        double result = calcularCosteEnvio(respuesta);
        result += getPeso(); //va a salir absurdamente caro pero me acabo de dar cuenta de que es necesario añadir el peso
        result += getPrecioBase();
        return result;
    }

}