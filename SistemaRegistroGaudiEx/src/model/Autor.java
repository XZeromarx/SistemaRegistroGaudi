package model;

/**
 *
 * @author XZeromarx
 */
public class Autor {
    
    private String nombre;
    private String apellido;
    private String rut;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, String apellido, String rut, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
