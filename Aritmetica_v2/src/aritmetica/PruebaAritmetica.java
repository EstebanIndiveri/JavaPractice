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
        
        Aritmetica obj1=new Aritmetica();
        
        int resultado=obj1.sumar(5,4);
        System.out.println("Resultado suma directa obj1:"+resultado);
        /* Si llamamos directamente el metodo sumar sin argumentos el valor es cero
        ya que los atributos del objeto nunca se inicializaron
        ya que no se usó el constructor con argumentos sino el constructor vacio
        */
        
        System.out.println("Resultado suma atributos obj1:"+obj1.sumar());
        
        //Ahora creamos un objeto con el constructor con 2 argumentos
        Aritmetica obj2=new Aritmetica(2,1);
        /* Imprimimos directamente el resultado.
        Al llamar directamente al metodo suma,nos regresa el valor de la suma:
        */
        System.out.println("\nResultado suma atributos obj2: "+obj2.sumar());
    }
}
