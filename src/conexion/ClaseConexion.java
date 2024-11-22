/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class ClaseConexion {
    private final String usuario;
    private final String pass;
    private final String url;
    private Connection conexion;

    // Constructor
    public ClaseConexion() {
        this.usuario = "postgres"; // Reemplaza con tu usuario de la base de datos
        this.pass = "1234"; // Reemplaza con tu contraseña de la base de datos
        this.url = "jdbc:postgresql://localhost:5432/db_sistemas_contables"; // Reemplaza con tu URL de la base de datos
    }

    // Método para iniciar la conexión
    public Connection iniciarConexion() {
        try {
            // Cargar el controlador de PostgreSQL
            Class.forName("org.postgresql.Driver");
            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, pass);
            // Verificar si la conexión es válida
            boolean estado = conexion.isValid(50000);
            System.out.println(estado ? "Conexión exitosa" : "Error en la conexión");
            return conexion;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClaseConexion.class.getName()).log(Level.SEVERE, "No se encontró el driver de PostgreSQL", ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClaseConexion.class.getName()).log(Level.SEVERE, "Error al establecer la conexión", ex);
        }
        return null;
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return conexion;
    }
}
