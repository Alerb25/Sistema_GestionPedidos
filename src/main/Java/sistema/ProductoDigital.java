package sistema;
public  class ProductoDigital extends Producto{
    private int tamanoDesc;
    private String licencia;

    //constructor
    public ProductoDigital ( String nombreProd, int precio, int tamanoDesc, String licencia){
        super( nombreProd, precio);
        this.tamanoDesc = tamanoDesc;
        this.licencia = licencia;
    }

    public ProductoDigital(String string, double d, boolean b) {
        //TODO Auto-generated constructor stub
    }

    public ProductoDigital(String string, double d, boolean b) {
        //TODO Auto-generated constructor stub
    }

    //metodo set y get
    public void setTamano(){ this.tamanoDesc = tamanoDesc;}
    public void setLicencia(){ this.licencia = licencia; }

    public int getTamanoDesc(){ return this.tamanoDesc; }
    public String getLicencia(){ return this.licencia; }
}
