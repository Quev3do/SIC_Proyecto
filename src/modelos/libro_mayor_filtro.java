/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import conexion.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class libro_mayor_filtro {
    private int idCuenta;
    private String nombreCuenta;
    private double totalDebe;
    private double totalHaber;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private PreparedStatement pstm;
    
    public int getIdCuenta() {
        return idCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public double getTotalDebe() {
        return totalDebe;
    }

    public double getTotalHaber() {
        return totalHaber;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public void setTotalDebe(double totalDebe) {
        this.totalDebe = totalDebe;
    }

    public void setTotalHaber(double totalHaber) {
        this.totalHaber = totalHaber;
    }
    
    public ArrayList<libro_mayor_filtro> libroMayorFiltro(String fechaInicio, String fechaFin) {
        ArrayList<libro_mayor_filtro> listaLibroMayor = new ArrayList<>();
        this.claseConexion = new ClaseConexion();
        try {
            conexionDB = claseConexion.iniciarConexion();

            // Consulta SQL
            String sql = """
                SELECT 
                    ld.id_cuenta,
                    c.nombre_cuenta AS nombre_cuenta,
                    SUM(ld.debe) AS total_debe,
                    SUM(ld.haber) AS total_haber
                FROM 
                    tbl_lib_diario ld
                JOIN 
                    tbl_cuentas c ON ld.id_cuenta = c.id_cuenta
                WHERE 
                    ld.fecha BETWEEN ? AND ?
                GROUP BY 
                    ld.id_cuenta, c.nombre_cuenta
                ORDER BY 
                    ld.id_cuenta;
            """;
            
            System.out.println(sql);

            pstm = conexionDB.prepareStatement(sql);
            pstm.setString(1, fechaInicio);
            pstm.setString(2, fechaFin);
            ResultSet consulta = pstm.executeQuery();

            // Procesar resultados
            while (consulta.next()) {
                libro_mayor_filtro libroMayor = new libro_mayor_filtro();
                libroMayor.setIdCuenta(consulta.getInt("id_cuenta"));
                libroMayor.setNombreCuenta(consulta.getString("nombre_cuenta"));
                libroMayor.setTotalDebe(consulta.getDouble("total_debe"));
                libroMayor.setTotalHaber(consulta.getDouble("total_haber"));

                listaLibroMayor.add(libroMayor);
            }
            return listaLibroMayor;
        } catch (SQLException ex) {
            Logger.getLogger(libro_mayor_filtro.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}

