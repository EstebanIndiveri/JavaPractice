/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author estel
 */
public class PasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x=10;
    imprimir(x);
    cambiarValor(x);
    imprimir(x);
    
    }
    public static void cambiarValor(int i){
        i=200;
    }
    
    public static void imprimir(int arg){
        System.out.println("Valor recibido: "+arg);
    }
}
