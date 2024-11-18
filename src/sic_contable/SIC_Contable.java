/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sic_contable;

import modelos.cuentas;
import modelos.documentos;
import modelos.users;
import modelos.libro_diario;
import modelos.libro_mayor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SIC_Contable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuentas cuenta = new cuentas();
        ArrayList<cuentas> listaC = cuenta.getCuentas();
        
        documentos docu = new documentos();
        ArrayList<documentos> listaD = docu.getDocumentos();
        
        users user = new users();
        ArrayList<users> listaU = user.getUsers();
        
        libro_diario libD = new libro_diario();
        ArrayList<libro_diario> listaLD = libD.getLibroDiario();
        
        libro_mayor libM = new libro_mayor();
        ArrayList<libro_mayor> listaLM = libM.getLibroMayor();
        

        
        
    }
    
}
