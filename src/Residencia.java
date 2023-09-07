public class Residencia extends ExtraHotelero {

    private int cantHabitaciones;

    private boolean descuento;

    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int cantMentroCuadrados, String nombre, Direccion direccion, String gerente) {
        super(privado, cantMentroCuadrados, nombre, direccion, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
        @Override
    public String toString() {
        return "Residencia: " + nombre + ", gerente: " + gerente;
    }
    
}
