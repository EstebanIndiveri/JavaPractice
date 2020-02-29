/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;
import domain.*;
/**
 *
 * @author estel
 */
public class ManejoExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Division division=new Division(10,0);//Denominador 0, forzamos el error.
            division.visualizarOperacion();
        }catch(OperationException oe){
            System.out.println("Ocurrio un error!");
            oe.printStackTrace();
        }
    }
    
}
