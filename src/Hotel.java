public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;

    protected int numCamas;

    protected int cantPisos;

    protected int precioHabitaciones;

    protected Gimnasio gimnasio;

    public int precioHabitacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorRestaurante() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorGimnasio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorLimosina() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
