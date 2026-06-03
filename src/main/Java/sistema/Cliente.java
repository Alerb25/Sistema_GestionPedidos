package sistema;

public class Cliente {

    private String nombre;
    private String DNI;
    private String apellidos;
    private String correo;
    private String direccion;
    private int telf;
    private int id;
    private int añosAntiguedad;
    private boolean esVip;
    private String pais;

    // constructor
    public Cliente(String nombre, boolean esVip, String pais) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.telf = telf;
        this.añosAntiguedad = añosAntiguedad;
        this.esVip = esVip;
        this.pais = pais;
        this.id = id;
    }

    // constructor2
    public Cliente(int i, String id, int j, boolean vip, String pais) {
        this.id = id;
        this.esVip = vip;
        this.pais = pais;
    }

    public Cliente() {
        // Constructor vacío
    }


    // metodos set y get
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI( String DNI) {
        this.DNI = DNI;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo( String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getCorreo() {
        return this.correo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelf() {
        return this.telf;
    }
    public int getId() {
        return this.id;
    }
    public int getAñosAntiguedad() {
        return this.añosAntiguedad;
    }
    public boolean getEsVip() {
        return this.esVip;
    }
    public String getPais() {
        return this.pais;
    }

    public double getDescuentoFidelidad() {
        if (esVip && añosAntiguedad >= 5)
            return 0.15; // 15%
        else if (esVip)
            return 0.10;
        else if (añosAntiguedad >= 3)
            return 0.05;
        else
            return 0.0;
    }

    // metodo resumen de datos del cliente
    public String Datos() {
        return "Nombre: " + getNombre() + "\n"
                + "Apellidos: " + getApellidos() + "\n"
                + "DNI: " + getDNI() + "\n"
                + "Correo:" + getCorreo() + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "Telefono: " + getTelf();
    }
}
