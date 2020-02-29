 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author estel
 */
public class Division {
    //atributo de la clase
    private int numerador;
  //atributo de clase
    private int denominador;
    
    //Throws e indicamos cual es la excepcion que podria arrojar el constructor.
    public Division(int numerador, int denominador) throws OperationException{
        
        if(denominador==0){
            //throw new Illegal ArgumentException("Denominador igual a cero");
            throw new OperationException("Denominador igual a cero");//mensaje de la exception
        }
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: "+numerador/denominador);
    }
}
