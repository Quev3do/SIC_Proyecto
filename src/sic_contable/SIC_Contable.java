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
        
//        System.out.println("CUENTAS:");
//        for(cuentas item : listaC){
//            System.out.println(item.getId_cuenta() + " : " + item.getNombre_cuenta() + ", " + item.getTipo_cuenta());
//        }
//        
//        System.out.println("DOCUMENTOS:");
//        for(documentos item : listaD){
//            System.out.println(item.getId_documento() + " : " + item.getCodigo_doc() + ", " + item.getFecha_doc() + ", " + item.getFecha_registro_doc());
//        }
//        
//        System.out.println("USERS:");
//        for(users item : listaU){
//            System.out.println(item.getId_user() + " : " + item.getUser_name() + ", " + item.getUser_rol());
//        }
//        
//        System.out.println("LIBRO DIARIO:");
//        for(libro_diario item : listaLD){
//            System.out.println(item.getId_lib_diario() + " : " + item.getFecha() + ", " + item.getBalance());
//        }
//        
//        System.out.println("LIBRO MAYOR:");
//        for(libro_mayor item : listaLM){
//            System.out.println(item.getId_transation()+ " : " + item.getCodigo()+ ", " + item.getId_lib_diario() + ", " + item.getConcepto());
//        }
//        
        System.out.println("--SIC SYSTEM--");
        System.out.println("Escoga el menu a mostrar:");
        System.out.println("1 - Ver libro diario.");
        System.out.println("2 - Ver libro mayor.");
        System.out.println("3 - Ver documentos.");
        System.out.println("4 - Ver usuarios.");
        System.out.println("5 - Ver cuentas.");
        System.out.println("0 - Terminar demo.");
        System.out.println("--Por motivos de comodidad se mostrara poca informacion para fines demostrativos--");
        
        Scanner myObj = new Scanner(System.in);

        String opc = myObj.nextLine();
        int opc2 = Integer.parseInt(opc);
        
        
        do{
               switch(opc2){
            case 1:
                System.out.println("ID -- FECHA -- BALANCE");
                for(libro_diario item : listaLD){
                    System.out.println(item.getId_lib_diario() + " : " + item.getFecha() + ", " + item.getBalance());
                }
                break;
            case 2:
                System.out.println("ID -- CODIGO -- ID_DIARIO -- CONCEPTO");
                for(libro_mayor item : listaLM){
            System.out.println(item.getId_transation()+ " : " + item.getCodigo()+ ", " + item.getId_lib_diario() + ", " + item.getConcepto());
        }
                break;
            case 3:
                System.out.println("ID -- CODIGO -- FECHA_DOC -- FECHA_REGISTRO");
                for(documentos item : listaD){
            System.out.println(item.getId_documento() + " : " + item.getCodigo_doc() + ", " + item.getFecha_doc() + ", " + item.getFecha_registro_doc());
       }
                break;
            case 4:
                System.out.println("ID -- NAME -- ROL");
                for(users item : listaU){
            System.out.println(item.getId_user() + " : " + item.getUser_name() + ", " + item.getUser_rol());
        }
                break;
            case 5:
                System.out.println("ID -- NOMBRE_CUENTA -- TIPO");
                for(cuentas item : listaC){
                    System.out.println(item.getId_cuenta() + " : " + item.getNombre_cuenta() + ", " + item.getTipo_cuenta());
                }
                break;
            default:
                System.out.println("No reconocida.");
                break;
        }
        
        }while(opc2 == 0);
    }
    
}
