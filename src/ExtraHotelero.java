public abstract class ExtraHotelero extends Alojamiento {

    protected boolean privado;

    protected int cantMentroCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int cantMentroCuadrados, String nombre, Direccion direccion, String gerente) {
        super(nombre, direccion, gerente);
        this.privado = privado;
        this.cantMentroCuadrados = cantMentroCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantMentroCuadrados() {
        return cantMentroCuadrados;
    }

    public void setCantMentroCuadrados(int cantMentroCuadrados) {
        this.cantMentroCuadrados = cantMentroCuadrados;
    }
    
    
}
