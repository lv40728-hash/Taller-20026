import enum TipoEvento;

public class Evento{
    private TipoEvento TipoEvento;
    private int minuto; 
    private Jugador jugador;

    public Evento () {
        this.TipoEvento = TipoEvento.DEFAULT;
        this.minuto = 0;
        this.jugador = null;
    }

    public Evento (TipoEvento TipoEvento, int minuto, Jugador jugador){
        this.TipoEvento = TipoEvento;
        this.minuto = minuto;
        this.jugador = jugador;
    }

    public TipoEvento setTipoEvento () {
        return TipoEvento;
    }

    public void getTipoEvento (TipoEvento TipoEvento) {
        this.TipoEvento = TipoEvento;
    }

    public int setMinuto () {
        return minuto;
    }

    public void getMinuto (int minuto) {
        this.minuto = minuto;
    }   

    public Jugador setJugador () {
        return jugador;
    }

    public void getJugador (Jugador jugador) {
        this.jugador = jugador;
    }


}