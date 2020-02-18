/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author estel
 */
public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    //metodos de la clase
    //Los usaran los objetos de esta clase
    public void desplegarNombre(){
        System.out.println("nombre: " +nombre);
        System.out.println("Apellido Paterno: "+apellidoPaterno);
        System.out.println("Apellido Materno: "+apellidoMaterno);
    }
}
