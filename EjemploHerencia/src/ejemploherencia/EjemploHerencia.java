/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author estel
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1=new Empleado("Juan",25000);
        System.out.println("Imprimimos el objeto empleado1");
        System.out.println(e1);
        
        Empleado e2=new Empleado("Pedro",15000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDirection("Bogota, Colombia");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        //Al crear un nuevo objeto de java.util.date nos regresa la fecha actual, como newDate() en JS
        Cliente c1=new Cliente(new java.util.Date(),false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);
        //Completamos el bojeto persona asociado a este objeto cliente
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDirection("Mexico, DF");
        c1.setVip(true);
        System.out.println("\nVolvemos a imprimir el objeto cliente1");
        System.out.println(c1);
        System.out.println(c1.getEdad());// Se puede llamar a un objeto y su metodo:
    }
    
}
