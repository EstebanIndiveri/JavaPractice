/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturn2;

/**
 *
 * @author estel
 */
public class PalabraReturn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado= sumar(0,0);
        System.out.println("Resultado: "+resultado);
        
    }
    public static int sumar(int a,int b){
        if(a==0 && b==0){
            System.out.println("Puede proporcionar valoers distintso a cero");
            return 0;
        }else{
        return a+b;
        }
    }
    
}
