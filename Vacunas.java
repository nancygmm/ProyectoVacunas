import java.util.ArrayList;
import java.util.Scanner;

public class Vacunas {
    public static String[] vbb = new String[]{"1. Varicela ", "2. Difteria ", "3. Hib ", "4. Hepatitis A ", "5. Hepatitis B ", "6. Influenza ", "7. Sarampión ", "8. Paperas ", "9. Tosferina ", "10. Poliomielitis ", "11. Neumocóco ", "12. Rotavirus ", "13. Rubéola ", "14. Tétanos "};
    public static String[] vnj = new String[]{"1. Influenza", "2. Tdap (tétanos, difteria, tosferina) ", "3. VPH (virus del papiloma humano) ", "4. Antimeningocócica ", "5. Hepatitis B ", "6. Hepatitis A ", "7. Poliomielitis ", "8. MMR (sarampión, paperas, rubéola) ", "9 Varicela ", "10. COVID 19 "};
    public static String[] vad = new String[]{"1. Influenza ", "2. Neumococo ", "3. Tdap (tétanos, disferia, tosferina) ", "4. Herpes ", "5. VPH (virus del papiloma humano ", "6. COVID 19 "};

    public static ArrayList<String> crearListaBB(){
        try (Scanner in = new Scanner(System.in)) {
            Integer bb = 16;
               ArrayList<String> vfbb = new ArrayList<String>();
               while(bb != 0){
                System.out.println("Ingrese el número de la vacuna faltante (Ingrese cero si ya no va a ingresar más vacunas): ");
                bb = in.nextInt();
                if (bb != 0){
                    vfbb.add(vbb[bb-1]);
                }

            }
            return vfbb;
        }
    }

}
