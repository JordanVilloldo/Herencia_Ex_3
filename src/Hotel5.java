
public final class Hotel5 extends Hotel4 {

    private int cantSalonConferencia;

    private int cantSuites;

    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalonConferencia, int cantSuites, int cantLimosinas, Restaurante restaurante, int cantHabitaciones, int numCamas, int cantPisos, boolean gimnasio, String nombre, Direccion direccion, String gerente) {
        super(restaurante, cantHabitaciones, numCamas, cantPisos, gimnasio, nombre, direccion, gerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(int cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
        @Override
    public String toString() {
        return "Hotel5*: " + nombre + ", gerente: " + gerente;
    }

    @Override
    public int precioHabitacion() {
        return super.precioHabitacion() + valorLimosina(cantLimosinas); 
    }


    public int valorLimosina(int cantLimosina) {

        return 15 * cantLimosina;
    }

}
