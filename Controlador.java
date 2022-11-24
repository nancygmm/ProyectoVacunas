import java.util.*;
public class Controlador {
    /**
     * Se crean las listas para cada clases
     */
    ArrayList<Persona> pacientes = new ArrayList<Persona>();
    ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
    ArrayList<Vacunas> vacunas = new ArrayList<Vacunas>();
    Scanner in = new Scanner(System.in);
    public Controlador() { 
        /**
         * Vacunas
         * personas
         * asignar vacunas 
         */
    }
    /**
     * Este método utiliza métodos de tipo persona, vacunas y hospital
     */
    public void General(){
        System.out.println("Bienvenido al programa de vacunación :)");
        System.out.println("A continuación podrá escoger el hospital donde desea vacunarse");
        Persona p = new Persona(null, null, 0, 0);
        Persona pacientes = paciente();
        ArrayList<Persona> lpaciente = new ArrayList<Persona>();
        System.out.println("A continuación podrá ingresar uno o varios pacientes");
        lpaciente.add(pacientes);
        p.setNombre(null);
        p.setApellido(null);
        p.setEdad(0);
        p.setTelefono(0);
        pacientes.add(p);
        System.out.println("Por favor ingrese el nombre del Hospital");
        String nombre = in.nextLine();
        System.out.println("Se ha agregado el hospital con éxito");
        System.out.println("A continuación podrá agregar las vacunas que necesite");
        Vacunas v = new Vacunas(nombre);
        Vacunas vacunnn = vac();
        ArrayList<Vacunas> lvacunnn = new ArrayList<Vacunas>();
        lvacunnn.add(vacunnn);
        v.setNombreV(nombre);
        vacunas.add(v);
        System.out.println("Vacuna/s agregada/s con éxito");
        System.out.println("A continuación podrá agregar los horarios que desee para cada vacuna correspondiente");
        Hospital h = new Hospital(nombre); 
        Horario horarios = crearHorario();
        ArrayList <Horario> lhorarios = new ArrayList<Horario>();
        lhorarios.add(horarios);
        h.setHorario(lhorarios);
        hospitales.add(h);
        System.out.println("Se ha/n agregado el/los horario/s con éxito");
        System.out.println(pacientes);
        System.out.println(vacunas);
        System.out.println(hospitales);
        System.out.println("Gracias por utilizar este servicio, que tenga buen día :D");
    }
    /**
     * Este método permite que el usuario ingrese hora inicial y final de la cita
     * @return
     */
    public Horario crearHorario(){
        System.out.println("¿Cuántos horarios desean agregar?");
        int contador = in.nextInt();
        System.out.println("Ingrese día");
        String dia = in.next();
        Horario h = new Horario(dia, null);
        while (contador>=0){
            System.out.println("Hora inicial");
            int Hinicio = in.nextInt();
            System.out.println("Hora final");
            int Hfinal = in.nextInt();
            Intervalo inter = new Intervalo(contador, contador, "disponible");
            contador = contador-2;
        }
        return h;
    }
    /**
     * Método que opera todos los atributos pertenecientes a paciente
     * @return
     */
    public Persona paciente(){
        ArrayList<Persona> pacientes = new ArrayList<Persona>();
        System.out.println("¿Cuántos pacientes desea agregar?");
        int pac = in.nextInt();
        Persona p = new Persona(null, null, 0, 0);
        while (pac>=0){
            System.out.println("Ingrese el nombre del paciente: ");
            String nombre = in.next();
            System.out.println("Ingrese el apellido del paciente: ");
            String apellido = in.next();
            System.out.println("Ingrese la edad del paciente: ");
            int edad = in.nextInt();
            System.out.println("Ingrese un número de teléfono: ");
            int telefono = in.nextInt();
            Persona paciente = new Persona(nombre, apellido, edad, telefono);
            pac = pac-2;
            pacientes.add(p);
        }
        return p;
    }
    /**
     * Este método sirve para agregar vacunas según su nombre
     * @return
     */
    public Vacunas vac(){
        ArrayList<Vacunas> vacunas = new ArrayList<Vacunas>();
        System.out.println("¿Cuántas vacunas desea ingresar?");
        int vac = in.nextInt();
        Vacunas vc = new Vacunas(null);
        while (vac >= 0){
            System.out.println("Ingrese el nombre de la vacuna");
            String nombreV = in.next();
            Vacunas v = new Vacunas(nombreV);
            vac = vac-2;
            vacunas.add(vc);
        }
        return vc;
    }
    
}
