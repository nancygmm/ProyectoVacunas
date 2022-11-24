public class Persona {
    /**
     * Atributos para persona
     */
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    /**
     * Contructor
     * @param nombre
     * @param apellido
     * @param edad
     * @param telefono
     */
    public Persona(String nombre, String apellido, int edad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    /**
     * Constructor vacío
     */
    public Persona(){}

    /**
     * Gets y sets de la clase Persona
     * @return
     */
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
    public void add(Persona p) {
    }
    

}
