public class Producto{
   
    private String nombreProd;
    private int precio;
    
    //constructor
    public Producto(String nombreProd, int precio){
        this.nombreProd = nombreProd;
        this.precio = precio;

    }

    //metodos get y set
    public void setnombre(){this.nombreProd = nombreProd;}
    public void setPrecio(){ this.precio = precio; }

    
    public String getNombre(){ return this.nombreProd; }
    public int getPrecio(){ return this.precio; }

    //metodo calcular el precio final
    //dependiendo si es fisico o digital se le suma la licencia o el coste de envio


    //crear metodo listarProductos()
}


