/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastracto.domain;

/**
 *
 * @author estel
 */
public class Circulo extends FiguraGeometrica{
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    public void dibujar(){
        //Comportamiento de la subclase
        System.out.println("Aquí debería dibujar un: "+this.getClass().getSimpleName());
        //Api de reflection
    }
}
