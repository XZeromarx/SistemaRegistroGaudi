package model;

/**
 *
 * @author XZeromarx
 */
public class Sala extends Datos{

    private String nombreSala;
    private int cantidadDeLamparas;
    private int temperaturaSala;
    private boolean cierreCentralizado;
    private boolean alarmaContraIncendios;
    private Encargado encargado;
    private String identificador;

    public Sala() {
    }

    public Sala(String nombreSala, int cantidadDeLamparas, int temperaturaSala, boolean cierreCentralizado, boolean alarmaContraIncendios, Encargado encargado) {
        this.nombreSala = nombreSala;
        this.cantidadDeLamparas = cantidadDeLamparas;
        this.temperaturaSala = temperaturaSala;
        this.cierreCentralizado = cierreCentralizado;
        this.alarmaContraIncendios = alarmaContraIncendios;
        this.encargado = encargado;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getCantidadDeLamparas() {
        return cantidadDeLamparas;
    }

    public void setCantidadDeLamparas(int cantidadDeLamparas) {
        this.cantidadDeLamparas = cantidadDeLamparas;
    }

    public int getTemperaturaSala() {
        return temperaturaSala;
    }

    public void setTemperaturaSala(int temperaturaSala) {
        this.temperaturaSala = temperaturaSala;
    }

    public boolean isCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public boolean isAlarmaContraIncendios() {
        return alarmaContraIncendios;
    }

    public void setAlarmaContraIncendios(boolean alarmaContraIncendios) {
        this.alarmaContraIncendios = alarmaContraIncendios;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(){
        String id = java.util.UUID.randomUUID().toString();
        identificador = id;
        this.identificador = id;
    }

}
