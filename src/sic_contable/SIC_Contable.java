/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sic_contable;

import modelos.users;


import java.util.ArrayList;
import java.util.Scanner;

import vistas.Inicio.Inicio;
import vistas.users.usersCrear;

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
        
        users user = new users();
        ArrayList<users> listaU = user.getUsers();
        
        Inicio ini = new Inicio();
        //ini.show();
        
        usersCrear ucr = new usersCrear();
        ucr.show();
    }
    
}
