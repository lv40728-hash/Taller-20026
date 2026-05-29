import enum.TipoEvento;
import java.util.ArrayList;
import java.util.Date;

public class Partido {
    private Date fecha;
    private Time horario;
    private int duracion;
    private int tiempoAdicional;
    private ArrayList<Evento> eventos;
    private ArrayList<Participaciones> participaciones;
    private ArrayList<Arbitraje> arbitrajes;
    private Estadio estadio;
    private Fase fase;

    public Partido () {
        this.fecha =  new Date();
        this.horario = "";
        this.duracion = 0;
        this.tiempoAdicional = 0;
        this.eventos = new ArrayList<>();
        this.participaciones = new ArrayList<>();
        this.arbitrajes = new ArrayList<>();
        this.estadio = null;
        this.fase = null;
    }


    public Partido (String fecha, Time horario, int duracion, int tiempoAdicional, Estadio estadio, Fase fase, ArrayList<Evento> eventos, ArrayList<Participaciones> participaciones, ArrayList<Arbitraje> arbitrajes) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.eventos = new ArrayList<>();
        this.participaciones = new ArrayList();
        this.arbitrajes = new ArrayList():
        this.estadio = estadio;
        this.fase = fase;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoAdicional() {
        return tiempoAdicional;
    }

    public void setTiempoAdicional(int tiempoAdicional) {
        this.tiempoAdicional = tiempoAdicional;
    } 

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Participacion> getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(ArrayList<Participacion> participaciones) {
        this.participaciones = participaciones;
    }

    public void setArbitrajes(ArrayList<Arbitraje> arbitrajes) {
        this.arbitrajes = arbitrajes;
    }
    
    public ArrayList<Arbitraje> getArbitrajes() {
        return arbitrajes;
    }

    public void setEstadio(Estadio estadio){
        this.estadio = estadio;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Fase getFase() {
        return fase;
    }

    public void agregarEvento(Evento e) {
        this.eventos.add(e);
    }

    public void agregarParticipacion(Participacion p) {
        this.participaciones.add(p);
    }

    public void agregarArbitraje(Arbitraje a) {
        this.arbitraje.add(a);
    }



}
