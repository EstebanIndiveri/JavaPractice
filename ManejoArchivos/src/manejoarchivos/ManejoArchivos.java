/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;
import static utileria.Archivos.*;
/**
 *
 * @author estel
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //Nota ya debe estar creada la carpeta sobre la que se va a trabajar
    //Asignar permisos a la carpeta
        private static final String NOMBRE_ARCHIVO="C:\\Users\\estel\\OneDrive\\Escritorio\\Proyectos JAVA\\ArchivosCreadosEnJava\\pruebaJava.txt";
    //}
    public static void main(String [] args){
        //Crear un archivo
        crearArchivo(NOMBRE_ARCHIVO);
        
        //Escribir a un archivo
        escribirArchivo(NOMBRE_ARCHIVO);
        
        //Leer de un archivo.
        leerArchivo(NOMBRE_ARCHIVO);
        
        //Anexar informacion al archivo
        anexarArchivo(NOMBRE_ARCHIVO);
        
        //Leer a un archivo:
        leerArchivo(NOMBRE_ARCHIVO);
    }
}
