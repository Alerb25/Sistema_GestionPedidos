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
    public String getNombre(){ return this.nombreProd; }
    public int getPrecio(){ return this.precio; }


}


