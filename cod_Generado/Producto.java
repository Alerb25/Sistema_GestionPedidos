public abstract class Producto {
    private String nombreProd;
    private double precio;
    public void Producto(String nombreProd, double precio);
    public void setnombre();
    public void setPrecio();
    public String getNombre();
    public double getPrecio();
    public double calcularPrecio(Producto p);
}
