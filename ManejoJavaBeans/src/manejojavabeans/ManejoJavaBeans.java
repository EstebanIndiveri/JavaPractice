/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejojavabeans;
import beans.PersonaBean;
/**
 *
 * @author estel
 */
public class ManejoJavaBeans {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaBean bean=new PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(19);
        
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Edad: "+bean.getEdad());
    }
    
}
