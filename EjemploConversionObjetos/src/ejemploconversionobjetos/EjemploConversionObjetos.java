/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author estel
 */
public class EjemploConversionObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1.Creamos un tipo de mas alta Jerarquia:
        Empleado empleado;
        //Asignamos una referencia de un objeto de menor jerarquia
        //Esto es un upcasting, no hay necesidad de una notacion especial.
        empleado=new Escritor("Roy",15000,TipoEscritura.CLASICO);
        
        //Sin embargo ya no podemos acceder a los metodos de la clase menor.
        //emp.getTipoDeEscrituraEnTexto();
        
        //Imprimimos los detalles en un metodo generico:
        imprimirDetalles(empleado);
        
        //2.Podemos hacer lo mismo con la clase Gerente.
        //Esto es upcasting por lo que no requiere una sintaxis especial:
        empleado=new Gerente("Laura",19000,"Sistemas");
        
        //pero si queremos acceder directo por la variable empleado
        //Al detalle del objeto Gerente no es posible, se pierde el acceso
        //empleado.getDepartamento();
        
        //utilizamos el mismo metodo para imprimir detalles:
        imprimirDetalles(empleado);
    }
    
    private static void imprimirDetalles(Empleado empleado){
        String resultado=null;
        //imprimir detalles es general para todos ya que es por polimorfismo
        //no se necesita de ninguna conversion
        System.out.println("\nDetalle: "+empleado.obtenerDetalles());
        
    
    
        //pero los detalles de cada clase debemos hacer un downcasting:
        if(empleado instanceof Escritor){
        //Convertimos el objeto al tipo inferior deseado
    
        //Convierte objeto-DownCasting:
        Escritor escritor=(Escritor)empleado;
        //Finalmente podemos acceder a los metodos de la clase Escritor;
        resultado=escritor.getTipoEscrituraEnTexto();
    
        //Otra forma es hacer la conversion en la misma linea de código.
        //para evitar la creacion de variables innecesarias
        resultado=((Escritor)empleado).tipoEscritura.getDescription();
        System.out.println("Resultado tipo Escritura: "+resultado);
        
        System.out.println("");
        }else if(empleado instanceof Gerente){
        //Hacemos el downcasting en la misma linea de codigo:
        resultado=((Gerente)empleado).getDepartamento();
        System.out.println("resultado departamento: "+resultado);
        }
    }
}
