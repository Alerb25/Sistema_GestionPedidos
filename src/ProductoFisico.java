public class ProductoFisico extends Producto{
    private int costeEnvio;
    
    //constructor
    public ProductoFisico (int Id_Prod, String nombreProd, int precio, int costeEnvio){
        super(Id_Prod, nombreProd, precio);
        this.costeEnvio = costeEnvio;
    }

    //metodos set y get
    public void setCosteEnv(){ this.costeEnvio = costeEnvio;}

    public int getCosteEnv(){ return this.costeEnvio; }

}