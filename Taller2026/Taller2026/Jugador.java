public class Jugador {
    private String dorsal;
    private String posicion;
    private float peso;
    private float altura;

    public Jugador () {
        this.dorsal = "";
        this.posicion = "";
        this.peso = 0;
        this.altura = 0;
    }

    

    public Jugador(String dorsal, String posicion, float peso, float altura) {
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.peso = peso;
        this.altura = altura;
    }



    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
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

    
}
