import java.util.ArrayList;

public class Seleccion {
    private String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private int rankingFIFA;

    private ArrayList<Jugador> jugadores;
    
    public Seleccion () {
        this.nombreFederacion = "";
        this.camisetaPrincipal = "";
        this.camisetaSecundaria = "";
        this.cabezaGrupo = false;
        this.rankingFIFA = 0;
    }
    
    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo,
            int rankingFIFA) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;

        this.jugadores = new ArrayList<>();
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

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
}
