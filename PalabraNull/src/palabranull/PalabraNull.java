/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabranull;

/**
 *
 * @author estel
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Persona p1=new Persona("Juan");
    System.out.println("Nombre de p1: "+p1.obtenerNombre());
    Persona p2=p1;
    System.out.println("Nombre p2: "+p2.obtenerNombre());
    
    p1=null;
    System.out.println("nombre p2: "+p2.obtenerNombre());
        if(p1 !=null){
        System.out.println("nombre p1: "+p1.obtenerNombre());
        }
    }
    
}
class Persona{
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }

}