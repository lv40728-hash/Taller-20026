import java.util.ArrayList;

public class Arbitro extends Persona {
    private int aniosExperiencia;
    private Pais pais;
    private ArrayList<Arbitraje> arbitrajes;

    public Arbitro () {
        super();
        this.aniosExperiencia = 0;
        this.pais = null;
        this.arbitrajes = new ArrayList<>();
    }

    public Arbitro (int aniosExperiencia, String nombre, int fecNacimiento, Pais pais, ArrayList<Arbitraje> arbitrajes) {
        super();
        this.aniosExperiencia = aniosExperiencia;
        this.pais = pais;
        this.arbitrajes = arbitrajes;
    }

    public int setAniosExperiencia () {
        return aniosExperiencia;
    }

    public void getAaniosExperiencia (int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Pais setPais () {
        return pais;
    }

    public void getPais (Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Arbitraje> setArbitrajes () {
        return arbitrajes;
    }

    public void getArbitrajes (ArrayList<Arbitraje> arbitrajes) {
        this.arbitrajes = arbitrajes;
    }

    public void agregarArbitraje(Arbitraje arbitraje) {
        this.arbitrajes.add(arbitraje);
    }

}
