public class Camping extends ExtraHotelero {

    private int cantMaxCarpas;

    private int cantBanios;

    private boolean restaurante;

    public Camping() {
    }

    public Camping(int cantMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int cantMentroCuadrados, String nombre, Direccion direccion, String gerente) {
        super(privado, cantMentroCuadrados, nombre, direccion, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
        @Override
    public String toString() {
        return "Camping: " + nombre + ", gerente: " + gerente;
    }
    
    
}
