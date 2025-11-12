public class Producto{
    private int Id_Prod;
    private String nombreProd;
    private int precio;
    
    //constructor
    public Producto(int Id_Prod, String nombreProd, int precio){
        this.Id_Prod = Id_Prod;
        this.nombreProd = nombreProd;
        this.precio = precio;

    }

    //metodos get y set
    public void setId(){this.Id_Prod = Id_Prod;}
    public void setnombre(){this.nombreProd = nombreProd;}
    public void setPrecio(){ this.precio = precio; }

    public int getId(){ return this.Id_Prod; }
    public int getNombre(){ return this.nombreProd; }
    public int getPrecio(){ return this.precio; }


}

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

public  class ProductoDigital extends Producto{
    private String tamanoDesc;
    private String licencia;

    //constructor
    public ProductoDigital (int Id_Prod, String nombreProd, int precio, int tamanoDesc, String licencia){
        super(Id_Prod, nombreProd, precio);
        this.tamanoDesc = tamanoDesc;
        this.licencia = licencia;
    }

    //metodo set y get
    public void setTamano(){ this.tamanoDesc = tamanoDesc;}
    public void setLicencia(){ this.licencia = licencia; }

    public int getTamanoDesc(){ return this.tamanoDesc; }
    public int getLicencia(){ return this.licencia; }
}
