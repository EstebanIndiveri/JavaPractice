/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejointerfaces;
import datos.*;
/**
 *
 * @author estel
 */
public class ManejoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AccesoDatos datos=new ImplementationOracle();//variable tipo datos, almacena un objeto que este 
        ejecutar(datos, "listar");//usando la interface actualmente;
        
        System.out.println(datos);//Apunta a la claseOracle, primera declaración
     
        System.out.println("");
        
        datos=new ImplementationMysql();
        ejecutar(datos,"insertar");
        System.out.println(datos);//Apunta a la clase MYSQL sobreesribimos la variable

        
    }
        private static void ejecutar(AccesoDatos datos, String accion){
            if("listar".equals(accion)){
                datos.listar();
            }else if("insertar".equals(accion)){
                datos.insertar();
            }
        }
}
   
