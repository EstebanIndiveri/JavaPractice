/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturn;

/**
 *
 * @author estel
 */
public class PalabraReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado=sumar(3,6);
        System.out.println("Resultado: "+resultado);
        
        // TODO code application logic here
    }
    public static int sumar(int a, int b){
        return a+b;
    }
    
}
