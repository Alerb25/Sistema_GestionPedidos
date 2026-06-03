package sistema;

// Quitamos 'abstract' porque los tests instancian "new Producto(...)" directamente Azahara te prometo que por este error me he pegado dos dias mirando el codigo
public class Producto {

    private int id;
    private String nombreProd;
    private double precioBase;

    // constructor
    public Producto(int id, String nombreProd, double precioBase) {
        this.id = id;
        this.nombreProd = nombreProd;
        if (precioBase < 0){ 
            throw new IllegalArgumentException("El precio no puede ser negativo");
        } else {
            this.precioBase = precioBase;
        }
    }

    // metodos get y set
    public void setId(int id){
        this.id = id;
    }
    
    public void setnombre(String nombre) {
        this.nombreProd = nombre; 
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

    // Al no ser abstracta, le damos una implementación base
    public double calcularPrecioFinal() {
        return this.precioBase;
    }
}