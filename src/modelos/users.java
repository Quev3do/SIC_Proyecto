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
public class users {
    private int id_user;
    private String user_name;
    private String user_email;
    private int user_phone;
    private String user_pass;
    private String user_rol;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<users> listaUsers;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(int user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_rol() {
        return user_rol;
    }

    public void setUser_rol(String user_rol) {
        this.user_rol = user_rol;
    }
    
    public users() {
        this.claseConexion = new ClaseConexion();
        this.listaUsers = new ArrayList<users>();
    }
    
    public ArrayList<users> getUsers(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_users";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                users user = new users();
                user.setId_user(consulta.getInt("id_user"));
                user.setUser_name(consulta.getString("user_name"));
                user.setUser_email(consulta.getString("user_email"));
                user.setUser_phone(consulta.getInt("user_phone"));
                user.setUser_pass(consulta.getString("user_password"));
                user.setUser_rol(consulta.getString("user_rol"));
                this.listaUsers.add(user);
            }
            return this.listaUsers;
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertUser(users itemI){
        try {
            String sql = "INSERT INTO tbl_users(user_name, user_email, user_phone, user_pass, user_rol) VALUES(?,?,?,?,?)";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setString(1, itemI.getUser_name());
            pstm.setString(2, itemI.getUser_email());
            pstm.setInt(3, itemI.getUser_phone());
            pstm.setString(4, itemI.getUser_pass());
            pstm.setString(5, itemI.getUser_rol());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int editUser(users itemE){
        try {
            String sql = "UPDATE tbl_users set user_name = ?, user_email = ?, user_phone = ?, user_pass = ?, user_rol = ?,"
                    + " where id_user = ?";
            this.conexionDB = this.claseConexion.iniciarConexion();
            pstm = this.conexionDB.prepareStatement(sql);
            pstm.setString(1, itemE.getUser_name());
            pstm.setString(2, itemE.getUser_email());
            pstm.setInt(3, itemE.getUser_phone());
            pstm.setString(4, itemE.getUser_pass());
            pstm.setString(5, itemE.getUser_rol());
            pstm.setInt(6, itemE.getId_user());
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int deleteUser(int itemD){
        try {
            conexionDB = claseConexion.iniciarConexion();
            String sql = "DELETE FROM tbl_users WHERE id_user = ?";
            pstm = conexionDB.prepareStatement(sql);
            pstm.setInt(1, itemD);
            int respuesta = pstm.executeUpdate();
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
