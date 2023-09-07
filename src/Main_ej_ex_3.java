
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
public class Main_ej_ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AgenciaTuristica compania = new AgenciaTuristica();

        compania.alojamientosPredeterminados();

        // Consultas
        System.out.println("Todos los alojamientos:");
        List<Alojamiento> todosAlojamientos = compania.obtenerTodosAlojamientos();
        for (Alojamiento alojamiento : todosAlojamientos) {
            System.out.println(alojamiento);
        }

        System.out.println("\nHoteles de más caro a más barato:");
        List<Hotel> hotelesOrdenados = compania.obtenerHotelesDeMasCaroAMasBarato();
        for (Hotel hotel : hotelesOrdenados) {
            System.out.println(hotel.getNombre() + " - Precio: $" + hotel.precioHabitacion());
        }
        System.out.println("\nCampings con restaurante:");
        List<Camping> campingsConRestaurante = compania.obtenerCampingsConRestaurante();
        for (Camping camping : campingsConRestaurante) {
            System.out.println(camping.getNombre());
        }

        System.out.println("\nResidencias con descuento:");
        List<Residencia> residenciasConDescuento = compania.obtenerResidenciasConDescuento();
        for (Residencia residencia : residenciasConDescuento) {
            System.out.println(residencia.getNombre());
        }
    }
}
