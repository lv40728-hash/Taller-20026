public class CuerpoTecnico extends Persona {
    private Rol rol;

    public CuerpoTecnico (Rol rol, String nombre, int fecNacimiento){
        this.rol = rol;
        super(nombre, fecNacimiento);
    }

    public Rol setRol () {
        return rol;
        super();
    }
    public void getRol (Rol rol) {
        this.rol = rol;
    }

}
