import enums.CategoriaArbitro;

public class Arbitraje {
    private CategoriaArbitro rol;
    private arbitro arbitro;
    private partido partido;

    public Arbitraje () {
        this.rol = CategoriaArbitro.DEFAULT;
        this.arbitro = null;
        this.partido = null;
    }

    public Arbitraje (CategoriaArbitro rol, arbitro arbitro, partido partido) {
        this.rol = rol;
        this.arbitro = arbitro;
        this.partido = partido;
    }

    public CategoriaArbitro getRol() {
        return rol;
    }

    public void setRol(CategoriaArbitro rol) {
        this.rol = rol;
    }

    public arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public partido getPartido() {
        return partido;
    }

    public void setPartido(partido partido) {
        this.partido = partido;
    }

    
}
