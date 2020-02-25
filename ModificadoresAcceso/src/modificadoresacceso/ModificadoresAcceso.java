/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;
import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author estel
 */
public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de accesos a clase 1 desde otras clases
        //Acceso a clase 1 desde Clase2:
        System.out.println("***Acceso desde clase2 a clase1(Mismo paquete)***");
        new Clase2().pruevaDesdeClase2();
        
        //Acesso a Clase1 desde Clase3:
        System.out.println("\n***Acceso desde Clase 3 a Clase 1(Diferente paquete,pero es subclase)***");
        new Clase3().pruebaDesdeClase3();
        
        //Acceso a Clase1 desde Clase4
        //Clase4 NO es una subclase y esta en otro paquete:
        System.out.println("\n***Acceso desde Clase 4 a Clase 1(Diferente paquete, No es una subclase)***");
        new Clase4().pruebaDesdeClase4();
    }
    
}
