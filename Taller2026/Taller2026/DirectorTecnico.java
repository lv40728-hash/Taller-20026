public class DirectorTecnico {
    private int fechaNacimiento;

    public DirectorTecnico () {
        this.fechaNacimiento = 0;
    }
    public DirectorTecnico (int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int setFechaNacimiento () {
        return fechaNacimiento;
    }

    public void getFechaNacimiento (int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
