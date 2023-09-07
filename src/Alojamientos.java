
import java.util.ArrayList;
import java.util.List;

public class Alojamientos {

    private List<Alojamiento> a = new ArrayList<>();
    
    AgenciaTuristica compania = new AgenciaTuristica();
    
    private Restaurante restaurante = new Restaurante("R1", 20);
    private Restaurante restaurante2 = new Restaurante("R2", 30);
    
    private Direccion direccion = new Direccion("calle 1", "Bogota");
    private Direccion direccion2 = new Direccion("calle 5", "Buenos Aires");
    
    
//"Hotel A", "Dirección A", "Localidad A", "Gerente A", 100, 200, 10, "Restaurante A", 40, true, 2
    
    //Hotel4
    Alojamiento hotel = new Hotel4(restaurante, 100, 200, 10, true, "Hotel A", direccion, "Gerente A");
    
    //Hotel5(int cantSalonConferencia, int cantSuites, int cantLimosinas, Restaurante restaurante, int cantHabitaciones, int numCamas, int cantPisos, boolean gimnasio, String nombre, Direccion direccion, String gerente)
    Hotel hotel2 = new Hotel5(2, 5, 5, restaurante2, 150, 250, 12, false, "Hotel B", direccion, "Gerente B");
    
    //camping "Camping X", "Dirección X", "Localidad X", "Gerente X", false, 5000, 100, 20, true
    //(int cantMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int cantMentroCuadrados, String nombre, Direccion direccion, String gerente)
    Camping camping1 = new Camping(100, 20, true, true, 5000, "Camping X", direccion2, "Gerente X");

    //residencia (int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int cantMentroCuadrados, String nombre, Direccion direccion, String gerente)
    //"Residencia 1", "Dirección 1", "Localidad 1", "Gerente 1", false, 800, 50, true, true
    Residencia residencia1 = new Residencia(50, true, true, true, 800, "Residencia 1", direccion2, "Gerente 1");
    
    
//    
//    compania.agregarAlojamiento(hotel);
//
//    compania.agregarAlojamiento(camping1);
//
//    compania.agregarAlojamiento(residencia1);
}
