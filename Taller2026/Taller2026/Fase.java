public class Fase {
    private String NombreFase;
    private ArrayList<Partido> partidos;
    private ArrayList<grupo> grupos;

    public Fase () {
        this.NombreFase = "";
        this.partidos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public Fase (String nombreFase, ArrayList<Partido> partidos, ArrayList<grupo> grupos) {
        this.NombreFase = nombreFase;
        this.partidos = partidos;
        this.grupos = grupos;
    }

    public String setNombreFase () {
        return NombreFase;
    }
    public void getNombreFase (String nombreFase) {
        this.NombreFase = nombreFase;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<grupo> grupos) {
        this.grupos = grupos;
    }
}