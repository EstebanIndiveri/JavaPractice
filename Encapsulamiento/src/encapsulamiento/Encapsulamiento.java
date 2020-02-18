/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author estel
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona("juan","Perez",false);
        System.out.println("Nombre de p1: "+p1.getNombre());
        
        Persona p2=new Persona("Karla","Gonzalez",false);
        System.out.println("Estado objeto p2: "+p2);
        
        p2.setBorrado(true);
        System.out.println("Estado objeto p2: "+p2);
        
        Persona p3=new Persona();
        System.out.println("Estado objeto p3: "+p3);
    }
    
}
