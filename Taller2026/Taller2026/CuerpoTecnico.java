import enum.Rol;

public class CuerpoTecnico extends Persona {
    private Rol rol;

    public CuerpoTecnico () {
        super();
        this.rol = Rol.DEFAULT;
    }

    public CuerpoTecnico (Rol rol, String nombre, int fecNacimiento){
        super();
        this.rol = rol;
    }

    public Rol setRol () {
        return rol;
        super();
    }
    public void getRol (Rol rol) {
        this.rol = rol;
    }

}
