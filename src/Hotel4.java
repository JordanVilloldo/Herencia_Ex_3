
public class Hotel4 extends Hotel {

    protected Restaurante restaurante;

    public Hotel4() {
    }

    public Hotel4(Restaurante restaurante, int cantHabitaciones, int numCamas, int cantPisos, boolean gimnasio, String nombre, Direccion direccion, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, gimnasio, nombre, direccion, gerente);
        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + ", restaurante: " + restaurante;
    }


    
    
    

    @Override
    public int precioHabitacion() {
        return super.precioHabitacion() + valorRestaurante(restaurante); 
    }


    public int valorRestaurante(Restaurante r) {

        if (r.getCapacidad() < 30) {
            return 10;
        } else if (r.getCapacidad() >= 30 && r.getCapacidad() <= 50) {
            return 30;
        } else {
            return 50;
        }
    }
    
    
}
