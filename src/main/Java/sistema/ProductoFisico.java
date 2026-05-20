package sistema;

import java.util.Scanner;

public class ProductoFisico extends Producto{
    private double costeEnvio;
    
    //constructor
    public ProductoFisico ( String nombreProd, double precio, double costeEnvio){
        super( nombreProd, precio);
        this.costeEnvio = costeEnvio;
    }

    //metodos set y get
    public void setCosteEnv(){ this.costeEnvio = costeEnvio;}

    public double getCosteEnv(){ return this.costeEnvio; }

    public double calcularCosteEnvio(String pais) {
    if (pais.equalsIgnoreCase("España")) return 0;
    else if (pais.equalsIgnoreCase("Francia") || 
             pais.equalsIgnoreCase("Italia") || 
             pais.equalsIgnoreCase("Portugal")) return 5;
    else return 10;
}

    public double calcularPrecioFinal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el paisal que se va a enviar: ");
        String respuesta = sc.nextLine();
        double result = calcularCosteEnvio(respuesta);
        result += precio;
        return result;
    }

}