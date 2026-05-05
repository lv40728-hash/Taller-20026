public class Mundial {
    private int anio;
    private String mascota;
    private String fechaDesde;
    private String fechaHasta;

    public Mundial () {
        this.anio = 0;
        this.mascota = "";
        this.fechaDesde = "";
        this.fechaHasta = "";
    }

    public Mundial (int anio, String mascota, String fechaDesde, String fechaHasta) {
        this.anio = anio;
        this.mascota= mascota;
        this.fechaDesde= fechaDesde;
        this.fechaHasta=fechaHasta;
    }
    
    public int setAnio () {
        return anio;
    }
    public void getAnio (int anio) {
        this.anio = anio;
    }

    public String mascota () {
        return mascota;
    }
    public void getMascota (String mascota)  {
        this.mascota = mascota;
    }

    public String setFechaDesde() {
        return fechaDesde;
    }
    public void getFechaDesde (String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String setFechaHasta () {
        return fechaHasta;
    } 
    public void getFechaHasta (String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


}
