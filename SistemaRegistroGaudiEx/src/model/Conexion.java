package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private Statement st;
    private ResultSet rs;
    private final Connection CON;

    public Conexion(String server, String bd, String user, String pass) throws ClassNotFoundException, SQLException {
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user=" + user;
        String lineaPass = "password=" + pass;

        String url = protocolo
                + server + "/"
                + bd + "?"
                + lineaUser + "&"
                + lineaPass;

        System.out.println(url);

        Class.forName("com.mysql.jdbc.Driver"); // JAR?
        CON = DriverManager.getConnection(url);
    }

    public void ejecutar(String query) throws SQLException {
        System.out.println(query);

        st = CON.createStatement();
        st.executeUpdate(query);
        close();
    }

    public ResultSet ejecutarSelect(String query) throws SQLException {
        System.out.println(query);

        st = CON.createStatement();
        rs = st.executeQuery(query);
        return rs;
    }

    public void close() throws SQLException {
        st.close();
    }
}
