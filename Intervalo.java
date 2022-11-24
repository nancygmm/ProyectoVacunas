public class Intervalo{
    /**
     * Atributos para intervalo
     */
    private int Hinicio;
    private int Hfinal;
    private String estatus;
    /**
     * Constructor
     * @param hinicio
     * @param hfinal
     * @param estatus
     */
    public Intervalo(int hinicio, int hfinal, String estatus) {
        Hinicio = hinicio;
        Hfinal = hfinal;
        this.estatus = estatus;
    }
    /**
     * Gets y sets para la clase de intervalos
     * @return
     */
    public int getHinicio() {
        return Hinicio;
    }
    public void setHinicio(int hinicio) {
        Hinicio = hinicio;
    }
    public int getHfinal() {
        return Hfinal;
    }
    public void setHfinal(int hfinal) {
        Hfinal = hfinal;
    }
    public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}