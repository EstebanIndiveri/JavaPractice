/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author estel
 */
public class SobreCargaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado 1: "+Operaciones.sumar(3,4));//int,int
        System.out.println("Resultado 2: "+Operaciones.sumar(5, 4.1));//int,double
        System.out.println("Restulado 3: "+Operaciones.sumar(7.1, 3));//double,int
        System.out.println("Resultado 4: "+Operaciones.sumar(2.2, 6.8));//double,double
        
        //Cual metodo se manda a llamar?
        System.out.println("Resultado 5: "+Operaciones.sumar(3,1L)); // la L es long int,double
        //cual metodo es?
        System.out.println("Resultado 6: "+Operaciones.sumar(3F,'A'));//la F es float double,int
    }
    
}
