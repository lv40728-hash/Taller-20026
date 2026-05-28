import java.util.ArrayList;

public class Seleccion {
    private String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private int rankingFIFA;
    private int puntos;
    private Pais pais;
    private Grupo grupo;
    private ArrayList<Partido> partidos;
    private ArrayList<Jugador> jugadores;
    private ArrayList<DirectorTecnico> directores;
    private ArrayList<CuerpoTecnico> integrantesCuerpo;
    
    public Seleccion () {
        this.nombreFederacion = "";
        this.camisetaPrincipal = "";
        this.camisetaSecundaria = "";
        this.cabezaGrupo = false;
        this.rankingFIFA = 0;
        this.pais = pais;
        this.grupo = grupo;
        this.partidos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.integrantesCuerpo = new ArrayList<>();
        this.puntos = puntos;
    }
    
    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo,
            int rankingFIFA, int puntos) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.pais = pais;
        this.grupo = grupo;
        this.partidos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.integrantesCuerpo<>();
        this. puntos = puntos;
    }


    public String getNombreFederacion() {
        return nombreFederacion;
    }


    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }


    public String getCamisetaPrincipal() {
        return camisetaPrincipal;
    }


    public void setCamisetaPrincipal(String camisetaPrincipal) {
        this.camisetaPrincipal = camisetaPrincipal;
    }


    public String getCamisetaSecundaria() {
        return camisetaSecundaria;
    }


    public void setCamisetaSecundaria(String camisetaSecundaria) {
        this.camisetaSecundaria = camisetaSecundaria;
    }


    public boolean isCabezaGrupo() {
        return cabezaGrupo;
    }


    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }


    public int getRankingFIFA() {
        return rankingFIFA;
    }


    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }

    public int getPuntos() {
    return puntos;
    }    

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void agregarPartido(Partido p) {
        this.partidos.add(p);
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void agregarDirectorTecnico(DirectorTecnico DirectorTecnico){
        this.directores.add(DirectorTecnico)
            }

    public void agregarCuerpoTecnico(CuerpoTecnico CuerpoTecnico){
        this.integrantesCuerpo.add(CuerpoTecnico);
    }
}
