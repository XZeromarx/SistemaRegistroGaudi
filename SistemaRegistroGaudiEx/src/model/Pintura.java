package model;

/**
 *
 * @author XZeromarx
 */
public class Pintura extends Datos{
    
    private Autor autor;
    private String tecnica;
    private String genero;
    private int anioCreacion;
    private String nombrePintura;
    private String tamanio;
    private Sala ubicacion;
    

    public Pintura() {
    }

    public Pintura(Autor autor, String tecnica, String genero, int anioCreacion, String nombrePintura, String tamanio, Sala ubicacion) {
        this.autor = autor;
        this.tecnica = tecnica;
        this.genero = genero;
        this.anioCreacion = anioCreacion;
        this.nombrePintura = nombrePintura;
        this.tamanio = tamanio;
        this.ubicacion = ubicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getNombrePintura() {
        return nombrePintura;
    }

    public void setNombrePintura(String nombrePintura) {
        this.nombrePintura = nombrePintura;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Sala getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Sala ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
