/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author estel
 */
public class PalabraThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new Persona("Juan");
        // TODO code application logic here
    }
    
}
class Persona{
    String nombre;//atrubyti de la clase
    
    Persona(String nombre){
        this.nombre=nombre;//this es el objeto Persona(actual)
        
        //Imprimimos el objeto persona
        Imprimir i=new Imprimir();
        i.imprimir(this);//this es el objeto Persona(actual)
    }
}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimri parametros: "+o);//el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): "+this);//this es el objeto imprimir
    }
} 