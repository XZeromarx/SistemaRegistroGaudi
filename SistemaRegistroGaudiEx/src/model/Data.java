package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion CON;
    private String query;
    private ResultSet rs;
    private List<String[]> listaObrasYSalas;
    private List<Sala> listaSalas;
    private List<String[]> listaGeneros;
    private List<String[]> listaTecnicas;
    private List<Autor> listaAutor;
    private List<String[]> listaEncargados;
    private List<String[]> listaBusqueda;

    public Data() throws ClassNotFoundException, SQLException {
        CON = new Conexion("localhost", "registroGaudi", "root", "");
    }

    public List getObrasYSalas() throws SQLException {
        listaObrasYSalas = new ArrayList<>();
        String[] resultados;
        query = "SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica',"
                + "genero.nombre AS 'Género', anioCreacion AS 'Año de creación',"
                + "obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho',"
                + "sala.nombre AS 'Ubicación', obra.id AS 'Id Obra' "
                + "FROM obra "
                + "INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id "
                + "INNER JOIN genero ON obra.genero_fk = genero.id "
                + "INNER JOIN sala ON obra.sala_fk = sala.id "
                + "INNER JOIN autor ON obra.autor_fk = autor.id;";
        rs = CON.ejecutarSelect(query);

        while (rs.next()) {

            resultados = new String[8];
            resultados[0] = rs.getString("Nombre Autor");
            resultados[1] = rs.getString("Tecnica");
            resultados[2] = rs.getString("Género");
            resultados[3] = rs.getString("Año de creación");
            resultados[4] = rs.getString("Nombre pintura");
            String alto = rs.getString("alto");
            String ancho = rs.getString("ancho");
            resultados[5] = alto + "x" + ancho;
            resultados[6] = rs.getString("Ubicación");
            resultados[7] = rs.getString("Id Obra");

            listaObrasYSalas.add(resultados);
        }

        return listaObrasYSalas;
    }

    public void eliminarObra(String id) throws SQLException {
        CON.ejecutar("DELETE FROM obra WHERE obra.id = '" + id + "'");

    }

    public void registrarObra(String nombreObra, String tamanio, int anio, String tecnica, String genero, String sala, String autor) throws SQLException {
        CON.ejecutar("CALL registrarObra('" + nombreObra + "','" + tamanio + "'," + anio + ",'" + tecnica + "','" + genero + "','" + sala + "','" + autor + "');");
    }

    public List getNombreSalas() throws SQLException {
        listaSalas = new ArrayList<>();
        query = "SELECT sala.nombre AS 'nombre sala' FROM sala INNER JOIN encargado ON sala.encargado_fk = encargado.id;";
        rs = CON.ejecutarSelect(query);

        Sala s;
        while (rs.next()) {
            s = new Sala();
            s.setNombreSala(rs.getString("nombre sala"));
            listaSalas.add(s);
        }

        return listaSalas;
    }

    public List getNombresGeneros() throws SQLException {
        listaGeneros = new ArrayList<>();
        query = "SELECT nombre FROM genero;";
        rs = CON.ejecutarSelect(query);
        String[] s;
        while (rs.next()) {
            s = new String[1];
            s[0] = rs.getString(1);
            listaGeneros.add(s);
        }
        return listaGeneros;
    }

    public List getNombreTecnicas() throws SQLException {
        listaTecnicas = new ArrayList<>();
        query = "SELECT nombre FROM tecnica;";
        rs = CON.ejecutarSelect(query);
        String[] s;
        while (rs.next()) {
            s = new String[1];
            s[0] = rs.getString(1);
            listaTecnicas.add(s);
        }
        return listaTecnicas;
    }

    public List getNombreAutores() throws SQLException {
        listaAutor = new ArrayList<>();
        query = "SELECT nombre FROM autor;";
        rs = CON.ejecutarSelect(query);
        Autor a;
        while (rs.next()) {
            a = new Autor();
            a.setNombre(rs.getString(1));

            listaAutor.add(a);
        }
        return listaAutor;
    }

    public boolean comprobarUsuario(String user, String pass) throws SQLException {
        query = "SELECT COUNT(*) AS 'user', clave AS 'pass' FROM usuario "
                + "WHERE nombreUsuario = '" + user + "' AND clave = '" + pass + "';";
        rs = CON.ejecutarSelect(query);
        boolean correcto = false;
        String s = null;
        while(rs.next()){
          s = rs.getString(1);  
        }
        if (!("0".equalsIgnoreCase(s))) {
            correcto = true;
        }
        return correcto;
    }

    public List getNombresEncargados() throws SQLException {
        query = "SELECT nombre FROM encargado;";
        rs = CON.ejecutarSelect(query);
        listaEncargados = new ArrayList<>();
        String[] s;
        while (rs.next()) {
            s = new String[1];
            s[0] = rs.getString(1);
            listaEncargados.add(s);
        }
        return listaEncargados;
    }

    public List getResultadosBusquedaNombre(String texto) throws SQLException {

        query = "SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica', "
                + "genero.nombre AS 'Género', anioCreacion AS 'Año de creación', "
                + "obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho', "
                + "sala.nombre AS 'Ubicación', obra.id AS 'Id Obra' "
                + "FROM obra "
                + "INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id "
                + "INNER JOIN genero ON obra.genero_fk = genero.id "
                + "INNER JOIN sala ON obra.sala_fk = sala.id "
                + "INNER JOIN autor ON obra.autor_fk = autor.id "
                + "WHERE obra.nombre LIKE '%" + texto + "%';";
        rs = CON.ejecutarSelect(query);
        listaBusqueda = new ArrayList<>();
        String[] s;
        while (rs.next()) {
            s = new String[8];
            s[0] = rs.getString("Nombre Autor");
            s[1] = rs.getString("Tecnica");
            s[2] = rs.getString("Género");
            s[3] = rs.getString("Año de creación");
            s[4] = rs.getString("Nombre pintura");
            String alto = rs.getString("alto");
            String ancho = rs.getString("ancho");
            s[5] = alto + "x" + ancho;
            s[6] = rs.getString("Ubicación");
            s[7] = rs.getString("Id Obra");
            listaBusqueda.add(s);
        }

        return listaBusqueda;

    }

    public List getResultadosBusquedaId(String id) throws SQLException {

        query = "SELECT autor.nombre AS 'Nombre Autor', tecnica.nombre AS 'Tecnica', "
                + "genero.nombre AS 'Género', anioCreacion AS 'Año de creación', "
                + "obra.nombre AS 'Nombre pintura', tamanio_alto AS 'alto', tamanio_ancho AS 'Ancho', "
                + "sala.nombre AS 'Ubicación', obra.id AS 'Id Obra' "
                + "FROM obra "
                + "INNER JOIN tecnica ON obra.tecnica_fk = tecnica.id "
                + "INNER JOIN genero ON obra.genero_fk = genero.id "
                + "INNER JOIN sala ON obra.sala_fk = sala.id "
                + "INNER JOIN autor ON obra.autor_fk = autor.id "
                + "WHERE obra.id = " + id + ";";
        rs = CON.ejecutarSelect(query);
        listaBusqueda = new ArrayList<>();
        String[] s;
        while (rs.next()) {
            s = new String[8];
            s[0] = rs.getString("Nombre Autor");
            s[1] = rs.getString("Tecnica");
            s[2] = rs.getString("Género");
            s[3] = rs.getString("Año de creación");
            s[4] = rs.getString("Nombre pintura");
            String alto = rs.getString("alto");
            String ancho = rs.getString("ancho");
            s[5] = alto + "x" + ancho;
            s[6] = rs.getString("Ubicación");
            s[7] = rs.getString("Id Obra");
            listaBusqueda.add(s);
        }

        return listaBusqueda;

    }
}
