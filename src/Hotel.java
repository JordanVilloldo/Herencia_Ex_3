public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;

    protected int numCamas;

    protected int cantPisos;

    protected int precioHabitaciones;

    protected Gimnasio gimnasio;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, int precioHabitaciones, Gimnasio gimnasio) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
        this.gimnasio = gimnasio;
    }
    
    

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }
    
    

    public int precioHabitacion(int cantHabitaciones, int valorRestaurante, int valorGimnasio, int valorLimosina) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorRestaurante(Restaurante r) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorGimnasio(Gimnasio g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int valorLimosina(int cantLimosina) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
