/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopalabrafinal;

/**
 *
 * @author estel
 */
public class EjemploPalabraFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("nombre persona: "+ClaseFinal.persona.getNombre());
        
        ClaseFinal.persona.setNombre("otro");
        System.out.println("nombre persona: "+ClaseFinal.persona.getNombre());
    }
    
}
