/**
 * Derechos reservados EstebanIndiveri
 */
package ejemplojavadoc;
import com.ei.javadoc.Aritmetica;
/**
 *Clase para probar el concepto de JavaDoc
 * @author Esteban Indiveri
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritemtica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int resultado= new Aritmetica(6,2).sumar();
        System.out.println("Resultado: "+resultado);
    }
    
}
