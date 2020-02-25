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
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        contadorPersonas=10;
        System.out.println("Ejecuta bloque estatico");
    }
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona=++contadorPersonas;//11
    }
    Persona(){
        System.out.println("Ejecuta Constructor");
    }
    public int getIdPersona(){
        return idPersona;
    }
}
