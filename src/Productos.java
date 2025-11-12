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

}

public class ProductoFisico extends Producto{
    private int costeEnvio;
    
    //constructor
    public ProductoFisico (int Id_Prod, String nombreProd, int precio, int costeEnvio){
        super(Id_Prod, nombreProd, precio);
        this.costeEnvio = costeEnvio;
    }

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
}
