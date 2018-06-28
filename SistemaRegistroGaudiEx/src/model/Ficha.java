package model;

/**
 *
 * @author XZeromarx
 */
public class Ficha extends Datos{
    
    private Sala sala;
    private Pintura pintura;

    public Ficha() {
    }
    
    public Ficha(Sala sala, Pintura pintura) {
        this.sala = sala;
        this.pintura = pintura;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pintura getPintura() {
        return pintura;
    }

    public void setPintura(Pintura pintura) {
        this.pintura = pintura;
    }
    
    
    
}
