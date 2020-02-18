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
public class PruebaCaja {
    public static void main(String args[]){
    
    int ancho=3;
    int alto=2;
    int profundo=6;
    
    Caja caja1= new Caja();
    int resultado=caja1.volumen(ancho, alto, profundo);
    
    System.out.println("resultado de la caja 1 es: "+resultado);
    
    Caja caja2=new Caja(4,2,6);
    int resultado2=caja2.volumen();
    System.out.println("resultado de la caja 2 es: "+resultado2);
    }
}
