/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class ClaseConexion {
    private String usuario;
    private String pass;
    private String url;
    private Connection conexion;

    public ClaseConexion() {
        this.usuario = "postgres";
        this.pass = "12345";
        this.url = "jdbc:postgresql://localhost:5432/db_sistema_contable";
    }

    public Connection iniciarConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
            boolean estado = conexion.isValid(5000);
            return conexion;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No se encontró el controlador de PostgreSQL.");
            Logger.getLogger(ClaseConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Error: No se pudo conectar a la base de datos. Verifica la URL, usuario o contraseña.");
            Logger.getLogger(ClaseConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
