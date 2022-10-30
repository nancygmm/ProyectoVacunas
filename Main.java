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
        System.out.println("1. Hacer cita de vacunación para bebés");
        System.out.println("2. Hacer cita de vacunación para niños y jóvenes");
        System.out.println("3. Hacer cita de vacunación para adultos");
        System.out.println("4. Salir");
        int op = in.nextInt();
        
        if (op == 1){
            persona.paciente();
        }
        if (op == 2){
            persona.paciente();
        }
        if (op == 3){
            persona.paciente();
        }
    }
}
