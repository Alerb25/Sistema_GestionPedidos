package sistema;

abstract class Producto {

    private int id;
    private String nombreProd;
    private double precioBase;
    

    // constructor
    public Producto(int id, String nombreProd, double precioBase) {
        this.id = id;
        this.nombreProd = nombreProd;
        if (precioBase < 0){ 
            throw new IllegalArgumentException("El precio no puede ser negativo");

        }else{
            this.precioBase = precioBase;
        }

    }

    // metodos get y set
    public void setId(int id){
        this.id = id;
    }
    public void setnombre(String nombre) {
        this.nombreProd = nombreProd;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getId(){
        return this.id;
    }
    public String getNombre() {
        return this.nombreProd;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    // metodo calcular el precioBase final
    // dependiendo si es fisico o digital se le suma la licencia o el coste de envio

    public abstract double calcularPrecioFinal();



 
}
