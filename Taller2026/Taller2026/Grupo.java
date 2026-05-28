import java.util.ArrayList;

public class Grupo {
    private String identicacion;
    private String descripcion;
    private Fase fase;
    private ArrayList<Seleccion> selecciones;

    public Grupo () {
        this.identicacion = "";
        this.descripcion = "";
        this.selecciones = new ArrayList<>();
        this.fase = fase;
    }

    public Grupo (String identificacion, String descripcion) {
        this.identicacion = identificacion;
        this.descripcion = descripcion;
        this.fase = fase;
        this.selecciones = new ArrayList<>();
    }

    public String getIdenticacion() {
        return identicacion;
    }

    public void setIdenticacion(String identicacion) {
        this.identicacion = identicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<Seleccion> selecciones) {
        this.selecciones = selecciones;
    }

    public void agregarSeleccion(Seleccion s) {
        this.selecciones.add(s);
    }
    
    public int obtenerPuntos(Seleccion s) {
    return s.getPuntos();
    }
    
}
