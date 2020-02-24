/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author estel
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    
    //Atributo de cada elemento de una enumeracion
    private final int paises;
    
    //constructor de cada elemento de la enumeración
    Continentes(int paises){
    this.paises=paises;
}
public int getPaises(){
return paises;
}
}
