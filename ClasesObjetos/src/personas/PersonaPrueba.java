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
public class PersonaPrueba {
    public static void main(String args[]){
       Persona p1 = new Persona();
       
       //llamado a un metodo del objeto creado
       System.out.println("valores por default del objeto Persona");
       p1.desplegarNombre();
       
       
       //modificar valores
       p1.nombre="Juan";
       p1.apellidoPaterno="Esparza";
       p1.apellidoMaterno="Lara";
       
       //volvemos a llamar al metodo
       System.out.println("\nNuevos Valores del objeto Persona");
       p1.desplegarNombre();
       
       Persona p2= new Persona();
       System.out.println("Valores por default del objeto Persona");
       p2.desplegarNombre();
       
       //modificar valores
       p2.nombre="Esteban";
       p2.apellidoPaterno="Indiveri";
       p2.apellidoMaterno="sanchez";
       System.out.println("\nNuevos valores del objeto Persona2");
       p2.desplegarNombre();
       
    }
    
}
