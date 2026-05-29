import java.util.ArrayList;

public class Seleccion {
    private String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private int rankingFIFA;
    private Pais pais;
    private Grupo grupo;
    private ArrayList<Jugador> jugadores;
    private ArrayList<DirectorTecnico> directoresTecnicos;
    private ArrayList<CuerpoTecnico> cuerpoTecnico;
    private ArrayList<Participacion> participaciones;
    
    public Seleccion () {
        this.nombreFederacion = "";
        this.camisetaPrincipal = "";
        this.camisetaSecundaria = "";
        this.cabezaGrupo = false;
        this.rankingFIFA = 0;
        this.pais = null;
        this.grupo = null;
        this.jugadores = new ArrayList<>();
        this.directoresTecnicos = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
        this.participaciones = new ArrayList<>();
    }
    
    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo,
            int rankingFIFA, Pais pais, ArrayList<Jugador> jugadores, ArrayList<DirectorTecnico> directoresTecnicos, ArrayList<CuerpoTecnico> cuerpoTecnico, ArrayList<Participacion> participaciones, Grupo grupo) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.pais = pais;
        this.grupo = grupo;
        this.jugadores = jugadores;
        this.directoresTecnicos = directoresTecnicos;
        this.cuerpoTecnico = cuerpoTecnico;
        this.participaciones = participaciones;
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

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<DirectorTecnico> getDirectoresTecnicos() {
        return directoresTecnicos;
    }

    public void setDirectoresTecnicos(ArrayList<DirectorTecnico> directoresTecnicos) {
        this.directoresTecnicos = directoresTecnicos;
    }

    public ArrayList<CuerpoTecnico> getCuerpoTecnico() {
        return cuerpoTecnico;
    }

    public void setCuerpoTecnico(ArrayList<CuerpoTecnico> cuerpoTecnico) {
        this.cuerpoTecnico = cuerpoTecnico;
    }

    public ArrayList<Participacion> getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(ArrayList<Participacion> participaciones) {
        this.participaciones = participaciones;
    }

    public void agregarJugador(Jugador j) {
        this.jugadores.add(j);
    }
    
    public void agregarDirectorTecnico(DirectorTecnico dt) {
        this.directoresTecnicos.add(dt);
    }

    public void agregarCuerpoTecnico(CuerpoTecnico ct) {
        this.cuerpoTecnico.add(ct);
    }

    public void agregarParticipacion(Participacion p) {
        this.participaciones.add(p);
    }
}