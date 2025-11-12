public class Cliente {
    
    private String nombre;
    private String DNI;
    private String apellidos;
    private String correo;
    private String direccion;
    private int telf;

    //constructor
    public Cliente ( String nombre, String DNI, String apellidos, String correo, String direccion, int telf){   
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.telf = telf;
    }

    //metodos set y get
    public void setnombre(){ this.nombre = nombre;}
    public void setDNI(){ this.DNI = DNI;}
    public void setApellidos(){ this.apellidos = apellidos;}
    public void setCorreo(){ this.correo = correo;}
    public void setDireccion(){ this.direccion = direccion;}
    public void setTelf(){ this.telf = telf;}

    public String getNombre() {return this.nombre;}
    public String getDNI() {return this.DNI;}
    public String getApellidos() {return this.apellidos;}
    public String getCorreo() {return this.correo;}
    public String getDireccion() {return this.direccion;}
    public int getTelf() {return this.telf;} 
}
