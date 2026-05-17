public class Estadio {
    private String nombre; 
    private int capacidad;
    private Sede sede;

    public Estadio () {
        this.nombre = "";
        this.capacidad = 0; 
        this.sede = sede;
    }

    public Estadio (String nombre,int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sede = sede;
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
    
}
