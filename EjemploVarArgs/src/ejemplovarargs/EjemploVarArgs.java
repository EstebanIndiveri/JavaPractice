/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovarargs;

/**
 *
 * @author estel
 */
public class EjemploVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNumeros(15,20,3,61,75,18,10);
        System.out.println("");
        imprimirNumeros(15,20,3,61,75,18,10);
        System.out.println("");
        variosParametros("Juan",true,15,20,14,22);
        
    }
    public static void imprimirNumeros(int... numeros){
        int elemento;
        for(int i=0;i<numeros.length;i++){
            elemento=numeros[i];
            System.out.println("Elemento "+i+": "+elemento);
        }
    }
    
    public static void imprimirNumerosForEach(int... numeros){
        for(int numero:numeros){
            System.out.println("El numero es: "+numero);
        }
    }
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Valido: "+valido);
        for(int numero:numeros){
            System.out.println("El numero es: "+numero);
        }
    }
}
