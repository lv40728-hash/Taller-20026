import enums.Posicion;
import java.util.ArrayList;

public class Jugador extends Persona {
    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;
    private ArrayList<Evento> eventos;

    public Jugador () {
        super();
        this.dorsal = 0;
        this.posicion = Posicion.DEFAULT;
        this.peso = 0;
        this.altura = 0;
        this.eventos = new ArrayList<>();
    }

    public Jugador(int dorsal, Posicion posicion, float peso, float altura, String nombre, int fecNacimiento, ArrayList<Evento> eventos) {
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.peso = peso;
        this.altura = altura;
        this.eventos = eventos;
        super(nombre, fecNacimiento);
    }


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    
}
