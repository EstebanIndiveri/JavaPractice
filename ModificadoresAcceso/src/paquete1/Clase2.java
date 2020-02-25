/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author estel
 */
public class Clase2 {
    public Clase2(){
    System.out.println("");
    new Clase1(1);
    new Clase1(1,2);
    new Clase1(1,2,3);
    System.out.println("Constructor private: Acceso negado");
    
    }
    public void pruevaDesdeClase2(){
        Clase1 c1=new Clase1();
        System.out.println("");
        System.out.println("Atributo público: "+c1.atrPublico);
        System.out.println("Atributo protegido: "+c1.atrProtegido);
        System.out.println("Atributo default: "+c1.atrPaquete);
        System.out.println("Atributo private: Acceso negado");
        System.out.println("");
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protedigo:" +c1.metodoProtegido());
        System.out.println("Metodo paquete:" +c1.metodoPaquete());
        System.out.println("Metodo private: Accesso negado");

    }
}
