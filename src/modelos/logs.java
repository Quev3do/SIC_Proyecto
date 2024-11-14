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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class logs {
    private int id_log;
    private int id_user;
    private String fecha_log;
    private String accion;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<logs> listalogs;

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFecha_log() {
        return fecha_log;
    }

    public void setFecha_log(String fecha_log) {
        this.fecha_log = fecha_log;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    
    public logs() {
        this.claseConexion = new ClaseConexion();
        this.listalogs = new ArrayList<logs>();
    }
    
    public ArrayList<logs> getLogs(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_logs";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                logs log = new logs();
                log.setId_log(consulta.getInt("id_log"));
                log.setId_user(consulta.getInt("id_user"));
                log.setFecha_log(consulta.getString("fecha_log"));
                log.setAccion(consulta.getString("accion"));
                this.listalogs.add(log);
            }
            return this.listalogs;
        } catch (SQLException ex) {
            Logger.getLogger(logs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertLog(logs itemI){
        try {
            String sql = "INSERT INTO tbl_logs(id_user, fecha_log, accion) VALUES(?,?,?)";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemI.getId_user());
            pstm.setString(2, itemI.getFecha_log());
            pstm.setString(3, itemI.getAccion());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(logs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editLog(logs itemE){
        try {
            String sql = "UPDATE tbl_logs set id_user = ?, fecha_log = ?, accion = ?, where id_log = ?";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemE.getId_user());
            pstm.setString(2, itemE.getFecha_log());
            pstm.setString(3, itemE.getAccion());
            pstm.setInt(4, itemE.getId_log());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(logs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int deleteLog(int itemD){
        try {
            conexionDB = claseConexion.iniciarConexion();
            String sql = "DELETE FROM tbl_logs WHERE id_log = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemD);
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(logs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
