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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class documentos {
    private int id_documento;
    private String codigo_doc;
    private String fecha_doc;
    private String fecha_registro_doc;
    
    private ClaseConexion claseConexion;
    private Connection conexionDB;
    private Statement statement;
    private PreparedStatement pstm;
    
    public ArrayList<documentos> listaDocumentos;

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getCodigo_doc() {
        return codigo_doc;
    }

    public void setCodigo_doc(String codigo_doc) {
        this.codigo_doc = codigo_doc;
    }

    public String getFecha_doc() {
        return fecha_doc;
    }

    public void setFecha_doc(String fecha_doc) {
        this.fecha_doc = fecha_doc;
    }

    public String getFecha_registro_doc() {
        return fecha_registro_doc;
    }

    public void setFecha_registro_doc(String fecha_registro_doc) {
        this.fecha_registro_doc = fecha_registro_doc;
    }
    
    public documentos() {
        this.claseConexion = new ClaseConexion();
        this.listaDocumentos = new ArrayList<documentos>();
    }
    
    public ArrayList<documentos> getDocumentos(){
        try{
            conexionDB = claseConexion.iniciarConexion();
            statement = conexionDB.createStatement();
            String sql = "SELECT * FROM tbl_documentos";
            ResultSet consulta = statement.executeQuery(sql);
            while(consulta.next()){
                documentos docu = new documentos();
                docu.setId_documento(consulta.getInt("id_documento"));
                docu.setCodigo_doc(consulta.getString("codigo_doc"));
                docu.setFecha_doc(consulta.getString("fecha_doc"));
                docu.setFecha_registro_doc(consulta.getString("fecha_registro"));
                this.listaDocumentos.add(docu);
            }
            return this.listaDocumentos;
        } catch (SQLException ex) {
            Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   public int insertDocumento(documentos itemI) {
    try {
        String sql = "INSERT INTO tbl_documentos(codigo_doc, fecha_doc, fecha_registro) VALUES(?,?,?)";
        this.conexionDB = this.claseConexion.iniciarConexion();
        pstm = this.conexionDB.prepareStatement(sql);
        pstm.setString(1, itemI.getCodigo_doc());

        // Convertir las fechas de String a java.sql.Date
        pstm.setDate(2, java.sql.Date.valueOf(itemI.getFecha_doc())); 
        pstm.setDate(3, java.sql.Date.valueOf(itemI.getFecha_registro_doc()));

        int respuesta = pstm.executeUpdate();
        return respuesta;
    } catch (SQLException ex) {
        Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
}

public int updateDocumento(int idDocumento, documentos documentoEditado) {
    try {
        String sql = "UPDATE tbl_documentos SET codigo_doc = ?, fecha_doc = ?, fecha_registro = ? WHERE id_documento = ?";
        conexionDB = claseConexion.iniciarConexion();
        pstm = conexionDB.prepareStatement(sql);

        // Establecer los valores
        pstm.setString(1, documentoEditado.getCodigo_doc());
        pstm.setDate(2, java.sql.Date.valueOf(documentoEditado.getFecha_doc())); // Fecha de documento
        pstm.setDate(3, java.sql.Date.valueOf(documentoEditado.getFecha_registro_doc())); // Fecha de registro
        pstm.setInt(4, idDocumento); // ID del documento que se va a actualizar

        // Ejecutar la actualización
        int resultado = pstm.executeUpdate();
        return resultado;
    } catch (SQLException ex) {
        Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
        return 0;
    } finally {
        // Cerrar conexión
        try {
            if (pstm != null) pstm.close();
            if (conexionDB != null) conexionDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


    
   public int deleteDocumento(int idDocumento) {
    try {
        // Verificar si el documento existe
        documentos existente = getById(idDocumento);
        if (existente == null) {
            System.out.println("El documento con ID " + idDocumento + " no existe.");
            return 0; // Indicar que no se realizó la eliminación
        }

        // Si existe, proceder a eliminar
        String sql = "DELETE FROM tbl_documentos WHERE id_documento = ?";
        conexionDB = claseConexion.iniciarConexion();
        pstm = conexionDB.prepareStatement(sql);
        pstm.setInt(1, idDocumento);

        int respuesta = pstm.executeUpdate();
        System.out.println("Documento eliminado correctamente.");
        return respuesta;
    } catch (SQLException ex) {
        Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cerrar recursos
        try {
            if (pstm != null) pstm.close();
            if (conexionDB != null) conexionDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return 0; // Retornar 0 en caso de error
}

    
    
    public List<Object[]> cargarDocumentos() {
    List<Object[]> documentos = new ArrayList<>();
    try {
        String sql = "SELECT id, codigo_doc, fecha_doc, fecha_registro FROM tbl_documentos";
        Connection conexion = claseConexion.iniciarConexion();
        PreparedStatement stmt = conexion.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            documentos.add(new Object[]{
                rs.getInt("id"),
                rs.getString("codigo_doc"),
                rs.getDate("fecha_doc"),
                rs.getDate("fecha_registro")
            });
        }

        rs.close();
        stmt.close();
        conexion.close();
    } catch (SQLException ex) {
        Logger.getLogger(documentos.class.getName()).log(Level.SEVERE, null, ex);
    }
    return documentos;
}
}
