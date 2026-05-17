import java.util.ArrayList;

public class Pais {
    private String nombre;
    private String bandera;
    private ArrayList<Sede> sedes;

    public Pais () {
        this.nombre = "";
        this.bandera = ""; 
        this.sedes = new ArratList<>();
    }

    public Pais ( String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.sedes = new ArrayList<>();
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

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

    public void agregarSede(Sede s) {
        this.sedes.add(s);
    }
    
    
}
