import java.util.ArrayList;

public class Horario{
    /**
     * Lista de intervalos
     */
    private String dia;
    ArrayList<Intervalo> intervalos;
    /** 
     * Constructor
     */
    public Horario(String dia, ArrayList<Intervalo> intervalos) {
        this.dia = dia;
        this.intervalos = intervalos;
    }
    /**
     * Gets y sets para la clase horario
     * @return
     */
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public ArrayList<Intervalo> getIntervalos() {
        return intervalos;
    }
    public void setIntervalos(ArrayList<Intervalo> intervalos) {
        this.intervalos = intervalos;
    }
}