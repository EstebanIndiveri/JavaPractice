/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utileria;
import java.io.*;//para el manejo de Archivos(IO=input/Output);
/**
 *
 * @author estel
 */
public class Archivos {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try{
            //envuelve en el constructor a filewriter
            PrintWriter salida=new PrintWriter(new FileWriter(archivo));
            salida.close();// cerramos el flujo y creamos el archivo
            System.out.println("El archivo se ha creado correctamente\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void escribirArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try{
            PrintWriter salida=new PrintWriter(new FileWriter(archivo));
            String contenido="Contenido a escribir en el archivo";
            salida.println(contenido);//manda a la variable FILE Y ARCHIVO
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try{
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura=entrada.readLine();
            while(lectura!=null){
                System.out.println("LEctura: "+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void anexarArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try{
            PrintWriter salida=new PrintWriter(new FileWriter(archivo,true));//true anexa informacion y respeta lo que hay
            String contenido="Anexando información al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la información correctamente");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
