/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author estel
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] personas={new Persona("Juan"),new Persona("María"),new Persona("Nestor") };
        
        for(Persona p:personas){
            String nombre=p.getNombre();
            System.out.println("Nombre de persona: "+nombre);
        }
        System.out.println("");
        int[] edades={15,20,41,50};
        for(int edad:edades){
            System.out.println("Edad: "+edad);
        }
    }
    
}
    
