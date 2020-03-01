/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.peliculas.excepciones;

/**
 *
 * @author estel
 */
public class AccesoDatosEx extends Exception{
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
        this.mensaje=mensaje;
    }
    
}
