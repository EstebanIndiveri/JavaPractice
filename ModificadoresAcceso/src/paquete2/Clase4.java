/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Clase1;

/**
 *
 * @author estel
 */
public class Clase4 {
    public Clase4(){
        //Constructor protegido, restringido al no ser una subclase
        //super(1,2);
        //Acceso package, y al estar afuera de paquete esta restringido
        //Accesso privado, restringido
        //super(1,2,3,4);
    }
    public void pruebaDesdeClase4(){
        Clase1 c1=new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.atrPublico);
        System.out.println("Atributo protegido: No se puede acceder desde un paqute externo al NO ser una subclase");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso negado");
    
        new Clase1();
    System.out.println("");
    System.out.println("Metodo publico: "+c1.metodoPublico());
    System.out.println("Metodo protegido: No se puede acceder desde un paquete externo al No ser subclase");
    System.out.println("Metodo default: No se puede acceder desde un paquete externo");
    System.out.println("Metodo private: Acceso negado");
    }
    
}
