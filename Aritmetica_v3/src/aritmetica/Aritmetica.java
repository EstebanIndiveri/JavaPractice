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
public class Aritmetica {

    int a;
    int b;
    
    Aritmetica(){}
    
    Aritmetica( int a, int b){
        this.b=b;
        this.a=a;
    }
    int sumar (){
        return a+b;
    }
    int restar(){
        return a-b;
    }
    
    int multiplicar(){
        return a*b;
    }
    int dividir(){
        return a/b;
    }
}
