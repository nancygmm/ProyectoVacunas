import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] vbb = new String[]{"1. Varicela ", "2. Difteria ", "3. Hib ", "4. Hepatitis A ", "5. Hepatitis B ", "6. Influenza ", "7. Sarampión ", "8. Paperas ", "9. Tosferina ", "10. Poliomielitis ", "11. Neumocóco ", "12. Rotavirus ", "13. Rubéola ", "14. Tétanos "};
        String[] vnj = new String[]{"1. Influenza", "2. Tdap (tétanos, difteria, tosferina) ", "3. VPH (virus del papiloma humano) ", "4. Antimeningocócica ", "5. Hepatitis B ", "6. Hepatitis A ", "7. Poliomielitis ", "8. MMR (sarampión, paperas, rubéola) ", "9 Varicela ", "10. COVID 19 "};
        String[] vad = new String[]{"1. Influenza ", "2. Neumococo ", "3. Tdap (tétanos, disferia, tosferina) ", "4. Herpes ", "5. VPH (virus del papiloma humano ", "6. COVID 19 "};

        Persona persona = new Persona();

        String[] vacunasFaltantes = new String[]{};
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenid@");
        System.out.println("A continuación podrá crear una cita dependiendo la edad del paciente");
        System.out.println("1. Hacer cita de vacunación para bebés (0 a 3 años)");
        System.out.println("2. Hacer cita de vacunación para niños y jóvenes (4 a 18 años)");
        System.out.println("3. Hacer cita de vacunación para adultos (18 años en adelante)");
        System.out.println("4. Salir");
        int op = in.nextInt();
        
        if (op == 1){
            persona.paciente();
            System.out.println("A continuación se presentarán las vacunas correspondientes para su edad ");
           for (String string : vbb) {
            System.out.println(string);
           }
           System.out.println("A continuación ingrese el numero de cada vacuna faltante: ");
           ArrayList<String> mm1 = Vacunas.crearListaBB();
           System.out.println(mm1);
        }
        if (op == 2){
            persona.paciente();
            System.out.println("A continuación se presentarán las vacunas correspondientes para su edad ");
        }
        if (op == 3){
            persona.paciente();
            System.out.println("A continuación se presentarán las vacunas correspondientes para su edad ");
        }
    }
}
