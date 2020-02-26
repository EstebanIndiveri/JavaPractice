/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author estel
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1=new Empleado("Juan",10000);
        Empleado emp2=new Empleado("Juan",10000);
        compararObjetos(emp1,emp2);
    }
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        //llamada metodo toString:
        //Por default se manda llamar el metodo toString dentro de println:
        System.out.println("Contenido del objeto: "+emp1);
        
        //Revision por referencia:
        if(emp1==emp2){
            System.out.println("Los objetos tienen la misma dirección de memoria");
        }else{
            System.out.println("Los Objetos tienen distinta dirección de memoria");
        }
        if(emp1.equals(emp2)){
            //Sobreescribimos el metodo Equals, tienen el mismo contenido por lo tanto son iguales
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        }else{
            System.out.println("Los objetos No tienen el mismo contenido, No son iguales");
        }
        
        if(emp1.hashCode()==emp2.hashCode()){
            System.out.println("Los objetos tiene el mismo codigo hash");
            
        }else{
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
    
}
