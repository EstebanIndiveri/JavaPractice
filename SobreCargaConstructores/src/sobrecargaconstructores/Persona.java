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
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
    this.idPersona=++contadorPersonas;
    }
    public Persona(String nombre, int edad){
        this();
        this.nombre=nombre;
        this.edad=edad;
    }
    @Override 
    public String toString(){
        return "Persona { "+"id Persona= "+idPersona+ ", nombre= "+nombre+", edad= "+edad+'}';
    } 
}
