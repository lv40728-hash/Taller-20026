import java.util.ArrayList;

public class Sede {
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;
    private Pais pais;
    private ArrayList<Estadio> estadios;

    public Sede () {
        this.ciudad = "";
        this.alturaNivelMar = 0;
        this.clima = "";
        this.zonaHoraria = "";
        this.pais = null;
        this.estadios = new ArrayList<>();
    }

    public Sede (String ciudad,float alturaNivelMar,String clima,String zonaHoraria, Pais pais){
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.zonaHoraria = zonaHoraria;
        this.pais = pais;
        this.estadios = new ArrayList<>();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getAlturaNivelMar() {
        return alturaNivelMar;
    }

    public void setAlturaNivelMar(float alturaNivelMar) {
        this.alturaNivelMar = alturaNivelMar;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public ArrayList<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(ArrayList<Estadio> estadios) {
         this.estadios = estadios;
    }

    public void agregarEstadio(Estadio e) {
        this.estadios.add(e);
    }
    
    
    
}
