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
public class libro_diario {
    private int id_lib_diario;
    private int id_user;
    private int id_documento;
    private int id_cuenta;
    private String fecha;
    private double debe;
    private double haber;
    private double balance;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<libro_diario> listaLD;

    public int getId_lib_diario() {
        return id_lib_diario;
    }

    public void setId_lib_diario(int id_lib_diario) {
        this.id_lib_diario = id_lib_diario;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public libro_diario() {
        this.claseConexion = new ClaseConexion();
        this.listaLD = new ArrayList<libro_diario>();
    }
    
    public ArrayList<libro_diario> getLibroDiario(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_lib_diario";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                libro_diario diario = new libro_diario();
                diario.setId_lib_diario(consulta.getInt("id_lib_dia"));
                diario.setId_user(consulta.getInt("id_user"));
                diario.setId_cuenta(consulta.getInt("id_cuenta"));
                diario.setId_documento(consulta.getInt("id_documento"));
                diario.setFecha(consulta.getString("fecha"));
                diario.setDebe(consulta.getDouble("debe"));
                diario.setHaber(consulta.getDouble("haber"));
                diario.setBalance(consulta.getDouble("balance"));
                this.listaLD.add(diario);
            }
            return this.listaLD;
        } catch (SQLException ex) {
            Logger.getLogger(libro_diario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertLibroD(libro_diario itemI){
        try {
            String sql = "INSERT INTO tbl_lib_diario(id_user, id_cuenta, id_documento, fecha, debe, haber, balance) "
                    + "VALUES(?,?,?,?,?,?,?)";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemI.getId_user());
            pstm.setInt(2, itemI.getId_cuenta());
            pstm.setInt(3, itemI.getId_documento());
            pstm.setString(4, itemI.getFecha());
            pstm.setDouble(5, itemI.getDebe());
            pstm.setDouble(6, itemI.getHaber());
            pstm.setDouble(7, itemI.getBalance());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_diario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editLibroD(libro_diario itemE){
        try {
            String sql = "UPDATE tbl_lib_diario set id_user = ?, id_cuenta = ?, id_documento = ?, fecha = ?, "
                    + "debe = ?, haber, balance = ?,  where id_lib_diario = ?";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemE.getId_user());
            pstm.setInt(2, itemE.getId_cuenta());
            pstm.setInt(3, itemE.getId_documento());
            pstm.setString(4, itemE.getFecha());
            pstm.setDouble(5, itemE.getDebe());
            pstm.setDouble(6, itemE.getHaber());
            pstm.setDouble(7, itemE.getBalance());
            pstm.setInt(8, itemE.getId_lib_diario());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_diario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int deleteLibroD(int itemD){
        try {
            conexionDB = claseConexion.iniciarConexion();
            String sql = "DELETE FROM tbl_lib_diario WHERE id_lib_diario = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemD);
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_diario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
