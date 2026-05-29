import java.util.ArrayList;

public class Estadio {
    private String nombre; 
    private int capacidad;
    private Sede sede;
    private ArrayList<Partido> partidos;

    public Estadio () {
        this.nombre = "";
        this.capacidad = 0; 
        this.sede = null;
        this.partidos = new ArrayList<>();
    }

    public Estadio (String nombre,int capacidad,Sede sede, ArrayList<Partido> partidos){ {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sede = sede;
        this.partidos = partidos;
    }

    public String setNombre () {
        return nombre;
    }
    public void getNombre (String nombre ) {
        this.nombre = nombre;
    } 

    public int setCapacidad () {
        return capacidad;
    }
    public void getCapacidad (int capacidad) {
        this.capacidad = capacidad;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
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
    
}
