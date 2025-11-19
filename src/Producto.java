import java.util.ArrayList;

abstract class Producto {

    private String nombreProd;
    private double precio;
    private ArrayList<Producto> productos;

    // constructor
    public Producto(String nombreProd, double precio) {
        this.nombreProd = nombreProd;
        this.precio = precio;

    }

    // metodos get y set
    public void setnombre() {
        this.nombreProd = nombreProd;
    }

    public void setPrecio() {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombreProd;
    }

    public double getPrecio() {
        return this.precio;
    }

    // metodo calcular el precio final
    // dependiendo si es fisico o digital se le suma la licencia o el coste de envio

    public double calcularPrecio(Producto p){
        if (p instanceof ProductoFisico){
           ProductoFisico pf = (ProductoFisico) p;
           double coste =  pf.getCosteEnv();
           coste += precio;

        }else if (p instanceof ProductoDigital){
            return precio;
        }
    }

    // crear metodo listarProductos()
    public String listarProductos() {
        StringBuilder sb = new StringBuilder();
        for (Producto p : productos) {
            sb.append(p.toString()).append("\n");
        }

        return sb.toString();

    }
}
