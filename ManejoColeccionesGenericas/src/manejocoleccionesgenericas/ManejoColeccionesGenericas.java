/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocoleccionesgenericas;
import java.util.*;//List, map entre otras
/**
 *
 * @author estel
 */
public class ManejoColeccionesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lista de tipo String, omitimos el tipo ya que esta declarado anteriormente:
        List<String> miLista=new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");// toma valores repetidos
        imprimir(miLista);
        
        Set<String> miSet=new HashSet<>();
        miSet.add("50");
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");//No toma valores repetidos
        imprimir(miSet);
        
        Map<String, String>miMapa=new HashMap<>();
        miMapa.put("1","Juan");
        miMapa.put("2","Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4","Esperanza");
        imprimir(miMapa.keySet());//Recuperamos las llaves
        imprimir(miMapa.values());//Recuperamos el valor de cada contenido.
    }
    
    static void imprimir(Collection<String>col){
        //Collection es el tipo mas generico definido, se indica el tipo String
        for(String elemento:col){
            System.out.println(elemento+" ");
        }
        System.out.println("");
    }
}
