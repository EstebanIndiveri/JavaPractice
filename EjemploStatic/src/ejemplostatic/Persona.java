/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author estel
 */
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    public Persona(String nombre){//CONSTRUCTOR
        contadorPersonas++;
        idPersona=contadorPersonas;
        this.nombre=nombre;
    }
    public String toString(){
        return "Persona[idPersona: "+idPersona+", nombre: "+nombre+"]";
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
