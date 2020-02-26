/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author estel
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp=new Empleado("Juan", 10000);
        imprimirDetalles(emp);
        
        System.out.println("");
        
        Gerente ger=new Gerente("Karla",20000,"Finanzas");
        imprimirDetalles(ger);
    }
    //El tipo que recibe el metodo es de tipo padre(Empleado);
    //Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo(Gerente);
    //eso es el polimorfismo, multiples formas pero en tiempo de ejecución;
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
