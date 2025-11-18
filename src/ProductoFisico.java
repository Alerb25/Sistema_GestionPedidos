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

}