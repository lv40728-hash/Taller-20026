public class DirectorTecnico extends Persona {
    private int fechaNombramiento;

    public DirectorTecnico () {
        super();
        this.fechaNombramiento = 0;
    }
    public DirectorTecnico (int fechaNombramiento, String nombre, int fecNacimiento) {
        this.fechaNombramiento = fechaNombramiento;
        super(nombre, fecNacimiento);
    }

    public int setFechaNombramiento () {
        return fechaNombramiento;
    }

    public void getFechombramiento (int fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }


}
