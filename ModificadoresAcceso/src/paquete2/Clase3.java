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
public class Clase3 extends Clase1{
    public Clase3(){
        //constructor protegido al ser una subclase puede acceder
        //aqune este en otro paquete
        super(1,2);
        //Acceso package y al estar fuera de paquete esta restringido
        //super(1,2,3);
        //Acceso privado, restringido
        //super(1,2,3,4);
    }
    public void pruebaDesdeClase3(){
        Clase1 c1=new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico+" o heredado: "+atrPublico);
        System.out.println("Atributo protegido(heredado): "+atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Accesso negado");
        //Constructor publico
        new Clase1();
        //Los demas constructores no se pueden probar asi, sino desde el construcor de esta clase
        //Ya que esta es una sublace en otro paquete
        System.out.println("");
        System.out.println("Metodo Publico: "+c1.metodoPublico());
        System.out.println("Metodo protegido (heredado): "+metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
        
        
    }
}
