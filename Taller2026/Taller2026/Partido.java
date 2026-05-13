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

    public Partido () {
        this.fecha =  new Date();
        this.horario = "";
        this.duracion = 0;
        this.tiempoAdicional = 0;
        this.eventos = new ArrayList<>();
        this.participaciones = new ArrayList<>();
    }

    public Partido (String fecha, Time horario, int duracion, int tiempoAdicional) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.eventos = new ArrayList<>();
        this.participaciones = new ArrayList();
    }

    public void registarEvento(TipoEvento tipo, int minuto) {
        Evento nuevoEvento = new Evento(tipo, minuto);
        this.eventos.add(nuevoEvento);
    }

    public void registrarParticipacion(boolean esLocal, Seleccion seleccion){
        Participacion p = new Participacion(esLocal,seleccion, this);
        this.participaciones.add(p);
    
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



}
