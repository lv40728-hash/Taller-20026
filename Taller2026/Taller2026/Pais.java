import java.util.ArrayList;

public class Pais {
    private String nombre;
    private String bandera;
    private Seleccion seleccion;
    private ArrayList<Sede> sedes;
    private ArrayList<Arbitro> arbitros;

    public Pais () {
        this.nombre = "";
        this.bandera = ""; 
        this.seleccion = null;
        this.sedes = new ArratList<>();
        this.arbitros = new ArrayList<>();
    }

    public Pais ( String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.seleccion = null;
        this.sedes = new ArrayList<>();
        this.arbitros = new ArrayList<>();
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

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public ArrayList<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(ArrayList<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public void agregarSede(Sede s) {
        this.sedes.add(s);
    }

    public void agregarArbitro(Arbitro a) {
        this.arbitros.add(a);
    }
    
    
}
