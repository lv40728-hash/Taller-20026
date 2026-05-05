public class Grupo {
    private String identicacion;
    private String descripcion;

    public Grupo () {
        this.identicacion = "";
        this.descripcion = "";
    }

    public Grupo (String identificacion, String descripcion) {
        this.identicacion = identificacion;
        this.descripcion = descripcion;
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

    
    public int obtenerPuntos ()  {
        return 0;
    }
}
