public class ProductoFisico extends Producto{
    private int costeEnvio;
    
    //constructor
    public ProductoFisico ( String nombreProd, int precio, int costeEnvio){
        super( nombreProd, precio);
        this.costeEnvio = costeEnvio;
    }

    //metodos set y get
    public void setCosteEnv(){ this.costeEnvio = costeEnvio;}

    public int getCosteEnv(){ return this.costeEnvio; }

}