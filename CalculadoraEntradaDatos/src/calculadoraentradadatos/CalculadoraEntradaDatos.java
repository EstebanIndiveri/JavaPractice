/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraentradadatos;
import java.util.*;
import static calculadora.Operations.*;
/**
 *
 * @author estel
 */
public class CalculadoraEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Proporciona el primer valor: ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b=scan.nextInt();
        int sumar=sumar(a,b);
        int restar=restar(a,b);
        int dividir=dividir(a,b);
        int multiplicar=multiplicar(a,b);
        System.out.println("El resultado de la suma es: "+sumar);
        System.out.println("El resultado de la resta es: "+restar);
        System.out.println("El resultado de la division es: "+dividir);
        System.out.println("El resultado de la multiplicacon es: "+multiplicar);
    }
    
}
