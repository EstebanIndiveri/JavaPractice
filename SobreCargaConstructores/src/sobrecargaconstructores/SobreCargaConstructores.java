/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstructores;

/**
 *
 * @author estel
 */
public class SobreCargaConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona("Lil",22);
        System.out.println("imprimimos el objeto p1");
        System.out.println(p1);
        
        Persona p2=new Persona("Juan",33);
        System.out.println("\nImprimimos el objeto p2");
        System.out.println(p2);
        
        Empleado e1=new Empleado("Pedro",28,29000);
        System.out.println("\nImprimimos el objeto e1");
        System.out.println(e1);
    }
    
}
