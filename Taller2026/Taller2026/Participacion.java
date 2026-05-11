public class Participacion {
    private boolean esLocal;
    private Seleccion seleccion;
    private Partido partido;

    public Participacion () {
        this.esLocal = false;
        this.seleccion = null;
        this.partido = null;
    }

    public Participacion(boolean esLocal, Partido partido, Seleccion seleccion){
        this.esLocal = esLocal;
        this.partido = partido;
        this.seleccion = seleccion;
    }

    public Participacion (boolean esLocal) {
        this.esLocal = esLocal;
    }

    public boolean setEsLocal (){
        return esLocal;
    }
    public void getEsLocal (boolean esLocal) {
        this.esLocal = esLocal;
    }

    public TipoEvento cantidadGoles () {
        return TipoEvento.GOL;
    }
    public TipoEvento cantidadTarjAmarillas () {
        return TipoEvento.TARJETAAMARILLA;
    }
    public TipoEvento cantidadTarjRojas () {
        return TipoEvento.TARJETAROJA ;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    // Metodos
    public int cantidadGoles() {
        return 0;
    }

    public int cantidadTarjAmarillas() {
        return 0;
    }

    public int cantidadTarjRojas() {
        return 0;
    }
}    
