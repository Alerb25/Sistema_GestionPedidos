
public  class ProductoDigital extends Producto{
    private int tamanoDesc;
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
    public String getLicencia(){ return this.licencia; }
}
