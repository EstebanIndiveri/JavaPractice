/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturnclases;

/**
 *
 * @author estel
 */
public class PalabraReturnClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s=crearObjetoSuma();
        int resultado=s.a + s.b;
        System.out.println("Resultado: "+resultado);
    }
    public static Suma crearObjetoSuma(){
        Suma s=new Suma(3,4);
        return s;
    }
    }
    
    class Suma{
            int a;
            int b;
    
    Suma (int a,int b){//Constructor
        this.a=a;
        this.b=b;
    }
}
