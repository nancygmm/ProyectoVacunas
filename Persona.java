import java.util.*;

public class Persona {

    Scanner in = new Scanner(System.in);
    ArrayList<Persona> pacientes = new ArrayList<Persona>();
    
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;

    public Persona(String nombre, String apellido, int edad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona() {
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
     public void paciente(){
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = in.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = in.nextInt();
        System.out.println("Ingrese un número de teléfono: ");
        int telefono = in.nextInt();
        Persona persona = new Persona(nombre, apellido, edad, telefono);
        pacientes.add(persona);
        System.out.println(pacientes);
    }
}
