public class Arbitro extends Persona {
    private int aniosExperiencia;

    public Arbitro () {
        this.aniosExperiencia = 0;
        super();
    }

    public Arbitro (int aniosExperiencia, String nombre, int fecNacimiento) {
        this.aniosExperiencia = aniosExperiencia;
        super(nombre, fecNacimiento);
    }

    public int setAniosExperiencia () {
        return aniosExperiencia;
    }

    public void getAaniosExperiencia (int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

}
