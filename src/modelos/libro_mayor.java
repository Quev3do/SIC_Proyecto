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
public class libro_mayor {
    private int id_transation;
    private int id_lib_diario;
    private String codigo;
    private String concepto;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<libro_mayor> listaLM;

    public int getId_transation() {
        return id_transation;
    }

    public void setId_transation(int id_transation) {
        this.id_transation = id_transation;
    }

    public int getId_lib_diario() {
        return id_lib_diario;
    }

    public void setId_lib_diario(int id_lib_diario) {
        this.id_lib_diario = id_lib_diario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    public libro_mayor() {
        this.claseConexion = new ClaseConexion();
        this.listaLM = new ArrayList<libro_mayor>();
    }
    
    public ArrayList<libro_mayor> getLibroMayor(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_lib_mayor";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                libro_mayor mayor = new libro_mayor();
                mayor.setId_transation(consulta.getInt("id_transation"));
                mayor.setId_lib_diario(consulta.getInt("id_lib_diario"));
                mayor.setCodigo(consulta.getString("codigo"));
                mayor.setConcepto(consulta.getString("concepto"));
                this.listaLM.add(mayor);
            }
            return this.listaLM;
        } catch (SQLException ex) {
            Logger.getLogger(libro_mayor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertLibroM(libro_mayor itemI){
        try {
            String sql = "INSERT INTO tbl_lib_mayor(id_user, codigo, concepto) VALUES(?,?,?)";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemI.getId_lib_diario());
            pstm.setString(2, itemI.getCodigo());
            pstm.setString(3, itemI.getConcepto());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_mayor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editLibroM(libro_mayor itemE){
        try {
            String sql = "UPDATE tbl_lib_mayor set id_lib_diario = ?, codigo = ?, concepto = ?, where id_transation = ?";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemE.getId_lib_diario());
            pstm.setString(2, itemE.getCodigo());
            pstm.setString(3, itemE.getConcepto());
            pstm.setInt(4, itemE.getId_transation());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_mayor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int deleteLibroM(int itemD){
        try {
            conexionDB = claseConexion.iniciarConexion();
            String sql = "DELETE FROM tbl_lib_mayor WHERE id_transation = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemD);
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(libro_mayor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
