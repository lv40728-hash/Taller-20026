public class Pais {
    private String nombre;
    private String bandera;

    public Pais () {
        this.nombre = "";
        this.bandera = "";
    }

    public Pais ( String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public String setNombre ( ){
        return nombre;
    }
    public void getNombre (String nombre) {
        this.nombre = nombre;
    }

    public String setBandera () {
        return bandera;
    }
    public void getBandera (String bandera) {
        this.bandera = bandera;
    }
}
