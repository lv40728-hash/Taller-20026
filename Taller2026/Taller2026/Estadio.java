public class Estadio {
    private String nombre; 
    private int capacidad;

    public Estadio () {
        this.nombre = "";
        this.capacidad = 0; 
    }

    public Estadio (String nombre,int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
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
}
