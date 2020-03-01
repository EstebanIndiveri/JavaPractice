/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;

/**
 *
 * @author estel
 */
//Definimos una clase generica con el operador Diamante<>:
public class ClaseGenerica<T>{
    //Definimos una variable del tipo generico
    T objeto;
    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
         this.objeto=objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getName());
        //cual es su clase y el nombre de la misma, nombre de la clase de tipo generico proporcionado
        //api de reflection, preguntas de manera dinamica a objetos y clases.
    }
}
