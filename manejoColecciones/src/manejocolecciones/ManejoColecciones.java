/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;
import java.util.*;//api collection
/**
 *
 * @author estel
 */
public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List miLista=new ArrayList(); // Interface LIST
        miLista.add("1");// Por default es de tipo Object
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add(5);
        //elemento repetido:
        miLista.add("4");
        imprimir(miLista);
        
        Set miSet=new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //no se permiten los elementos repetidos los ignora al compilar:
        miSet.add("300");
        imprimir(miSet);
        
        Map miMapa=new HashMap();
        //Llave, valor:
        miMapa.put("1","Juan");
        miMapa.put("2","Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4","Esperanza");
        imprimir(miMapa.keySet());//Regresa una coleccion del tipo set
        
        imprimir(miMapa.values());//Regresa los valores de todos
        
    }
    private static void imprimir(Collection colection){
        for(Object elemento:colection){
            System.out.println(elemento);
        }
            System.out.println("");
    }
    
}
