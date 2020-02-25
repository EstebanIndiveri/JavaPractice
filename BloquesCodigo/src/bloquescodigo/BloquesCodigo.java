/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquescodigo;

/**
 *
 * @author estel
 */
public class BloquesCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona();
        int id=p1.getIdPersona();
        System.out.println("id Persona: "+id);
        
        System.out.println("");
        
        Persona p2=new Persona();
        int id2=p2.getIdPersona();
        System.out.println("id Persona 2: "+id2);
    }
    
}
