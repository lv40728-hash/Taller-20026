public abstract class Persona {
   private String nombre;
   private int fecNacimiento;

   public Persona () {
    this.nombre = "";
    this.fecNacimiento = 0; 
}

public Persona (String nombre, int fecNacimiento) {
    this.nombre = nombre;
    this.fecNacimiento = fecNacimiento;
}

public String setNombre () {
    return nombre;
}
public void getNombre (String nombre) {
    this.nombre = nombre;
}

public int setFecNacimiento () {
    return fecNacimiento;
}
public void getFecNacimiento (int fecNacimiento) {
    this.fecNacimiento = fecNacimiento;
}
}
