public class Main{
  public static void main(String[] args){

    Mundial mundial2026 = new Mundial();
    
    Pais mexico = new Pais("Mexico","Bandera de México");
    Pais usa = new Pais("Estados Unidos", "Bandera de Estados Unidos");

    Sede ciudaddemexico = new Sede("Ciudad de México", 2240.0f, "Templado", "UTC-6", mexico, mundial2026);
    Sede nuevaYork = new Sede("Nueva York", 10.0f,"Humedo", "UTC-5", usa,mundial2026);

    mexico.agregarSede(ciudaddemexico);
    usa.agregarSede(nuevaYork);

    Estadio azteca = new Estadio("Estadio Azteca", ciudaddemexico);
    azteca.setCapacidad(87523);
    ciudaddemexico.agregarEstadio(Azteca);

    Estadio metLife = new Estadio("Estadio MetLife", nuevaYork);
    metLife.setCapacidad(82500);
    nuevaYork.agregarEstadio(metLife);

    System.out.println(" Infraestructura del Mundial Cargada ");

    System.out.println("\nPaís: " + mexico.getNombre() + " (" + mexico.getBandera() + ")");
    System.out.println("Sede: " + ciudaddemexico.getCiudad() + " | Clima: " + ciudaddemexico.getClima() + " | Zona: " + ciudaddemexico.getZonaHoraria());
    System.out.println(" -> Estadio: " + azteca.getNombre() + " (Capacidad: " + azteca.getCapacidad() + " espectadores)");

    System.out.println("\nPaís: " + usa.getNombre() + " (" + usa.getBandera() + ")");
    System.out.println("Sede: " + nuevaYork.getCiudad() + " | Clima: " + nuevaYork.getClima() + " | Zona: " + nuevaYork.getZonaHoraria());
    System.out.println(" -> Estadio: " + metLife.getNombre() + " (Capacidad: " + metLife.getCapacidad() + " espectadores)");

  }
}
    

  
