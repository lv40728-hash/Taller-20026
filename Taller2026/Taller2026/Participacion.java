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
        int contador = 0;
        return contador;
    }

    public int cantidadTarjAmarillas() {
        int contador = 0;
        return contador;
    }

    public int cantidadTarjRojas() {
        int contador = 0;
        return contador;
    }
}    
