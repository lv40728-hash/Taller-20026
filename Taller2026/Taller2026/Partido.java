public class Partido {
    private String  fecha;
    private String horario;
    private int duracion;
    private int tiempoDuracion;

    public Partido () {
        this.fecha =  "";
        this.horario = "";
        this.duracion = 0;
        this.tiempoDuracion = 0;
    }

    public Partido (String fecha, String horario, int duracion, int tiempoDuracion) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    } 

    

}
