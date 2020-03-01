/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatosscanner;
import java.util.*;
/**
 *
 * @author estel
 */
public class EntradaDatosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String captura=null;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un dato: ");
        captura=scan.nextLine();//solicita lineas completas desde la entrada de datos
        while(captura !=null){
            System.out.println("Dato introducido: "+captura);
            captura=scan.nextLine();
        }
    }
    
}
