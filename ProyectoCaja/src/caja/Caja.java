/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author estel
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    Caja(){}
    
    Caja(int ancho, int alto, int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    
    int volumen(){
        return ancho*alto*profundo;
    }
    
    int volumen(int ancho, int alto, int profundo){
        return ancho*alto*profundo;
    }
    
}
