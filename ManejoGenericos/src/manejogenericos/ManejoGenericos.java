/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;
//Importa JAVA.LANG DE MANERA AUTOMATICA NO ES NECESARIO IMPORTAR.
/**
 *
 * @author estel
 */
public class ManejoGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos una sintancia de Clasegenerica para Integer:
        
        ClaseGenerica<Integer> objetoInt=new ClaseGenerica<Integer>(15);
        //Indicamos el tipo de dato que le vamos a asignar. y en el constructo el valor en este caso 15:
        objetoInt.obtenerTipo();
        //Debe darnos java.lang.Integer  
        
        //Creamos una instancia de CalseGenerica para String.
        //Se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr=new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        //Los genericos no pueden ser aplicados a tipos primitivos
        //Por lo que esto marcaria un erro de compilación:
        //ClaseGenerica<int> intPrimitivo=new ClaseGenerica<int>(99);
        
    }
    
}
