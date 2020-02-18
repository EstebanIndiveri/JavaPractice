/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadores;

/**
 *
 * @author estel
 */
public class PrecedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("primer Ejemplo Procedencia Operadores");
        int x=5;
        int y=10;
        int z= ++x * y--;
        
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        
        System.out.println("Ejemplo de Ecuación");
        System.out.println(4+5* 6/6);
        System.out.println((4+5)*(6/3));
        
        System.out.println("\nOtro ejemplo");
        //si detecta una cadena, lo demas lo convierte en cadena
        System.out.println("1+2 = " + 1 +2);
        //Los parentesis rompen esta regla, ya que tien la mayor prioridad
        System.out.println("(1+2) = " + (1+2) );
        
        System.out.println("\nOtro Ejemplo2");
        //el operador + es asosiativo a la izquierda
        System.out.println(1+2+"abc");//detecta una operación primero
        System.out.println("abc" +1+2);//detecta una cadena primero
        System.out.println("1"+1);
        
//
    }
    
}
