public class DirectorTecnico extends Persona {
    private int fechaNombramiento;

    public DirectorTecnico () {
        this.fechaNombramiento = 0;
        super();
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
