package model;

/**
 *
 * @author XZeromarx
 */
public class Encargado extends Datos{
    
    private String nombre;
    private String rut;
    private String profesion;
    private int anioIngreso;

    public Encargado() {
    }

    public Encargado(String nombre, String rut, String profesion, int anioIngreso) {
        this.nombre = nombre;
        this.rut = rut;
        this.profesion = profesion;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    
    
}
