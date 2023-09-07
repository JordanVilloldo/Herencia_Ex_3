public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;

    protected int numCamas;

    protected int cantPisos;

    protected int precioHabitaciones;

    protected boolean gimnasio;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, boolean gimnasio, String nombre, Direccion direccion, String gerente) {
        super(nombre, direccion, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
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


    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    @Override
    public String toString() {
        return "Hotel: " + nombre + ", Habitaciones: " + cantHabitaciones + ", Camas: " + numCamas + ", Pisos: " + cantPisos + ", precio: $" + precioHabitaciones + ", gimnasio=" + gimnasio + '}';
    }

    
    

    public int precioHabitacion() {
        
        /*
        $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
        */
        return 50 + cantHabitaciones + valorGimnasio(this.gimnasio);
    }



    public int valorGimnasio(boolean g) {
        int valorAgregadoGimnasio = g ? 50 : 30;
        return valorAgregadoGimnasio;
    }


}
