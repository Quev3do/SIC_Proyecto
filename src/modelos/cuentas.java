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
public class cuentas {
    private int id_cuenta;
    private String tipo_cuenta;
    private String nombre_cuenta;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<cuentas> listaCuentas;

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }
    
    public cuentas() {
        this.claseConexion = new ClaseConexion();
        this.listaCuentas = new ArrayList<cuentas>();
    }
    
    public ArrayList<cuentas> getCuentas(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_cuentas";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                cuentas cuenta = new cuentas();
                cuenta.setId_cuenta(consulta.getInt("id_cuenta"));
                cuenta.setTipo_cuenta(consulta.getString("tipo_cuenta"));
                cuenta.setNombre_cuenta(consulta.getString("nombre_cuenta"));
                this.listaCuentas.add(cuenta);
            }
            return this.listaCuentas;
        } catch (SQLException ex) {
            Logger.getLogger(cuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertCuenta(cuentas itemI){
        try {
            String sql = "INSERT INTO tbl_cuentas(tipo_cuenta, nombre_cuenta) VALUES(?,?)";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setString(1, itemI.getTipo_cuenta());
            pstm.setString(2, itemI.getNombre_cuenta());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(cuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editCuenta(cuentas itemE){
        try {
            String sql = "UPDATE tbl_cuentas set tipo_cuenta = ?, nombre_cuenta = ?, where idcuenta = ?";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setString(1, itemE.getTipo_cuenta());
            pstm.setString(2, itemE.getNombre_cuenta());
            pstm.setInt(4, itemE.getId_cuenta());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(cuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int deleteCuenta(int itemD){
        try {
            conexionDB = claseConexion.iniciarConexion();
            String sql = "DELETE FROM tbl_cuentas WHERE idcuenta = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemD);
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(cuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
