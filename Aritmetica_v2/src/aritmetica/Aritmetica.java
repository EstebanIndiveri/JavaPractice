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
    
    Aritmetica( int arg1, int arg2){
        b=arg2;
        a=arg1;
    }
    int sumar ( int a,int b){
        return a+b;
    }
    int sumar(){
        return a+b;
    }
}
