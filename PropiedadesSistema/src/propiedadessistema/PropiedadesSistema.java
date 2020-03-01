/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadessistema;
import java.util.*;//clase de properties;
/**
 *
 * @author estel
 */
public class PropiedadesSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties propiedades=System.getProperties();
        Enumeration nombrePropiedades=propiedades.propertyNames();//Nos permitira iterar elementos de las prop
        while(nombrePropiedades.hasMoreElements()){
        //Itera hasta que no tenga mas elementos.
        
        //Conversion a un tipo String:
        String nombrePropiedad=(String) nombrePropiedades.nextElement();
        String valorPropiedad=propiedades.getProperty(nombrePropiedad); // viene de la primera Variable.
        System.out.println("LLave: "+nombrePropiedad+"-"+valorPropiedad);
        }
    }
    
}
