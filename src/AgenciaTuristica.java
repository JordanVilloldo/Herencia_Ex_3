
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jordan
 */
public class AgenciaTuristica {

    private final List<Alojamiento> alojamientos;

    public AgenciaTuristica() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public List<Alojamiento> obtenerTodosAlojamientos() {
        return alojamientos;
    }

    public List<Hotel> obtenerHotelesDeMasCaroAMasBarato() {
        //creamos lista hoteles
        List<Hotel> hoteles = new ArrayList<>();

        //recorremos todos los alojamientos
        for (Alojamiento alojamiento : alojamientos) {
            //si el alojamiento pertenece a la clase hotel, lo agregamos a hoteles
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }

        //ordenamos la lista hoteles del mayor precio a menor
        Collections.sort(hoteles, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel h1, Hotel h2) {
                return Double.compare(h2.precioHabitacion(), h1.precioHabitacion());
            }
        });
        return hoteles;
    }

    public List<Camping> obtenerCampingsConRestaurante() {
        List<Camping> campings = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping && ((Camping) alojamiento).isRestaurante()) {
                campings.add((Camping) alojamiento);
            }
        }
        return campings;
    }

    public List<Residencia> obtenerResidenciasConDescuento() {
        List<Residencia> residencias = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia && ((Residencia) alojamiento).isDescuento()) {
                residencias.add((Residencia) alojamiento);
            }
        }
        return residencias;
    }

    public void alojamientosPredeterminados() {
        
    Restaurante restaurante = new Restaurante("R1", 20);
    Restaurante restaurante2 = new Restaurante("R2", 30);

    Direccion direccion = new Direccion("calle 1", "Bogota");
    Direccion direccion2 = new Direccion("calle 5", "Buenos Aires");

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

    alojamientos.add (hotel);
    alojamientos.add (hotel2);
    alojamientos.add (camping1);
    alojamientos.add (residencia1);
}
}
