import java.util.ArrayList;

public class Fase {
    private String nombreFase;
    private ArrayList<Grupo> grupos;
    private ArrayList<Partido> partidos;

    public Fase () {
        this.nombreFase = "";
        this.grupos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public Fase (String nombreFase) {
        this.nombreFase = nombreFase;
        this.grupos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void agregarGrupo(Grupo g) {
        this.grupos.add(g);
    }

    public void agregarPartido(Partido p) {
        this.partidos.add(p);
    }
    
}
