/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones2;
import datos.*;
import excepciones.*;
/**
 *
 * @author estel
 */
public class ManejoExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccesoDatos datos=new ImplementationMySql();//interface
        //Cambiamos el estado a simulacionErro=true
        datos.simularError(true);
        ejecutar(datos,"listar");
        
        //cambiamos el estado de simularError=false;
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos,"insertar");
    }
    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            try{
                datos.listar();
                //Si se van a procesar varias excepciones de la misma jerarquia
            //siempre se debe procesar primero la excepcion de menor jerarquia
            //y postariormente la de mayor jerarquia
            }catch(LecturaDatosEx ex){
                System.out.println("Error lectura: Procesa la excepcion más específica de lectura de datos");
            }catch(AccesoDatosEx ex){
                System.out.println("Error acceso datos: procesa la excepción más generica de acceso a datos");
            }catch(Exception ex){
                System.out.println("Error General");
            }
            finally{
                System.out.println("Procesar Finally es opciona, siempre se ejecutará sin importar si hubo error o no");
                
            }
        }else if("insertar".equals(accion)){
            try{
                datos.insertar();
            }catch(AccesoDatosEx ex){
                System.out.println("Error a acceso datos: Podemos procesar solo la excepcion más genérica");
            } 
            finally{
                System.out.println("Procesar finally es opciona, siempres ejecutará sin importar si hubo error o no");
                }
        }else{
            System.out.println("No se proporcionó ninguna acción conocida");
        }
    }
}
