/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;
import domain.*;
/**
 *
 * @author estel
 */
public class ManejoExcepcionesArg {
    public static void main (String args[]) throws OperationException{
        try{
            int op1=Integer.parseInt(args[0]);
            int op2=Integer.parseInt(args[1]);
            Division div=new Division(op1,op2);
            div.visualizarOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
//no procesamos operation exception sino si estan los datos en el array
            System.out.print("ocurrion una excepcion");
            System.out.println("Hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.print("Ocurrió una excepcion");
            System.out.println("Uno de los argumentos no es entero");
            nfe.printStackTrace();
        }catch(OperationException oe){
            System.out.print("Ocurrió una excepcion");
            System.out.println("Se trató de realizar una operación erronea");
            oe.printStackTrace();
        }finally{
            //se ejecuta siempre independiente de cualquier excepción
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
