/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;

import com.gm.dominio.arreglos.Persona;
/**
 *
 * @author estel
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edades[];
        edades= new int[3];
        edades[0]=30;
        edades[1]=15;
        edades[2]=20;
        
        System.out.println("Arreglo enteros indices 0: "+edades[0]);
        System.out.println("Arreglo enteros indices 1: "+edades[1]);
        System.out.println("Arreglo enteros indices 2: "+edades[2]);
        
        Persona personas[];
        personas=new Persona[4];
        personas[0]=new Persona("juan");
        personas[1]=new Persona("Karla");
        personas[2]=new Persona("Pedro");
        
        System.out.println("");
        System.out.println("Arreglo personas indice 0: "+personas[0]);
        System.out.println("Arreglo personas indice 1: "+personas[1]);
        System.out.println("Arreglo personas indice 2: "+personas[2]);
        
        String nombres[]={"Sara","Laura","Carlos","Carmen"};
        System.out.println("");
        for(int i=0; i<nombres.length;i++){
            System.out.println("Arreglo String indice "+i+": "+nombres[i]);
        }
    }
    
}
