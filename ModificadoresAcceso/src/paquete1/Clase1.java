/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author estel
 */
public class Clase1 {
    public int atrPublico=5;
    protected int atrProtegido=6;
    int atrPaquete=7;
    private int atrPrivado=8;
    
    public Clase1(){}
    
    public Clase1(int i){
        System.out.println("Constructor publico 1");
    }
    protected Clase1(int i, int j){
        System.out.println("Constructo protected 2");
    } 
    Clase1(int i, int j, int k){
        System.out.println("Constructor package 3");
    }
   private Clase1(int i,int j, int k,int l){
       System.out.println("Constructor privado 4");
   }
    
    public int metodoPublico(){
        return 9;
    }
    protected int metodoProtegido(){
        return 10;
    }
    int metodoPaquete(){
        return 11;
    }
    private int metodoPrivado(){
        return 12;
    }
}
