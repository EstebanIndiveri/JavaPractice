/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author estel
 */
public class PruebaAritmetica {
    
    public static void main(String args[]){
        
        int operadorA=6;
        int operadorB=2;
        
        Aritmetica obj1=new Aritmetica(operadorA,operadorB);

        System.out.println("Operador A: "+operadorA+" y operadorB: "+operadorB);
        /* Si llamamos directamente el metodo sumar sin argumentos el valor es cero
        ya que los atributos del objeto nunca se inicializaron
        ya que no se usó el constructor con argumentos sino el constructor vacio
        */
        
        System.out.println("\nResultado suma: "+obj1.sumar());
        System.out.println("\nResultado resta: "+obj1.restar());
        System.out.println("\nResultado multiplicación: "+obj1.multiplicar());
        System.out.println("\nResultado división: "+obj1.dividir());


    }
}
