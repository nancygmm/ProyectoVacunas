public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private int dpi;

    public Persona(String nombre, String apellido, int edad, int telefono, int dpi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getDpi() {
        return dpi;
    }
    public void setDpi(int dpi) {
        this.dpi = dpi;
    }
}
