/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosobreescritura;

/**
 *
 * @author estel
 */
public class EjemploSobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado=new Empleado("Juan",1000);
        System.out.println(empleado.obtenerDetalles());
        
        Gerente gerente=new Gerente("Karla",2000,"Finanzas");
        System.out.println(gerente.obtenerDetalles());
        
        Gerente gerenteinfo=new Gerente("Patricio",3000,"Ingeniería");
        System.out.println(gerenteinfo.obtenerDetalles());
    }
    
}
