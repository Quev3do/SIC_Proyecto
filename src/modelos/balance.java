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
import java.util.logging.Level;
import java.util.logging.Logger;

public class balance {
    private String debeglobal;
    private String haberglobal;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private PreparedStatement pstm;
    
    public String getDebeGlobal() {
        return debeglobal;
    }
    
    public String getHaberGlobal() {
        return haberglobal;
    }

    public void setDebeGlobal(String txt) {
        this.debeglobal = txt;
    }
    
    public void setHaberGlobal(String txt) {
        this.haberglobal = txt;
    }
    
    public balance getTotalDebeHaberPorRango(String fechaInicio, String fechaFin) {
    balance resultadoBalance = new balance();
    this.claseConexion = new ClaseConexion();
    try {
        conexionDB = claseConexion.iniciarConexion();
        String sql = "SELECT SUM(debe) AS total_debe_global, SUM(haber) AS total_haber_global " +
                     "FROM tbl_lib_diario " +
                     "WHERE fecha BETWEEN ? AND ?";
        pstm = conexionDB.prepareStatement(sql);
        pstm.setString(1, fechaInicio);
        pstm.setString(2, fechaFin);
        
        ResultSet consulta = pstm.executeQuery();
        if (consulta.next()) {
            // Establece los valores directamente en el objeto balance
            resultadoBalance.setDebeGlobal(String.valueOf(consulta.getDouble("total_debe_global")));
            resultadoBalance.setHaberGlobal(String.valueOf(consulta.getDouble("total_haber_global")));
        }
        return resultadoBalance; // Devuelve el objeto balance con los datos
    } catch (SQLException ex) {
        Logger.getLogger(libro_diario.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}

}

