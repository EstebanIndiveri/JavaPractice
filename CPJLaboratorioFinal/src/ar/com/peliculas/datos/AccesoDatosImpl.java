/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.peliculas.datos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import ar.com.peliculas.domain.*;
import ar.com.peliculas.excepciones.*;
/**
 *
 * @author estel
 */
public class AccesoDatosImpl implements AccesoDatos{
    
    //METODO PARA VERIFICAR LA EXISTENCIA DEL ARCHIVO(BOOLEAN):
    @Override
    public boolean existe(String nombreArchivo)throws AccesoDatosEx{
        File archivo=new File(nombreArchivo);
        return archivo.exists();
    }
    
    //METODO PARA LEER EL ARRAY DE ARCHIVOS CREADOS:
    @Override
    public List<Pelicula> listar(String nombreArchivo)throws LecturaDatosEx{
        File archivo=new File(nombreArchivo);
        List<Pelicula> peliculas=new ArrayList();// Se crea la variable de arrays de peliculas
        try{
            //Instanciamos para leer el archivo enviado.
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            // lee la linea de peliculas:
            linea=entrada.readLine();
            //Abrimos metodo que itere las lineas de peliculas hasta que la misma sea null
            //y en ese caso termine el ciclo de iteración:
            while(linea!=null){
                Pelicula pelicula=new Pelicula(linea);
                peliculas.add(pelicula);
                //Realizamos una lectura nuevamente si da null se termina el ciclo
                linea=entrada.readLine();
            }
            entrada.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return peliculas;
    }
    
    //METODO PARA ESCRIBIR EN UN ARCHIVO:
    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo,boolean anexar)throws EscrituraDatosEx{
        File archivo=new File(nombreArchivo);
        try{
            //Instanciamos la salida del archivo el nombre del mismo y si existe o no con el booleano:
            PrintWriter salida=new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito correctamente el archivo");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    //METODO PARA BUSCAR UNA PELICULA:
    @Override
    public String buscar(String buscar, String nombreArchivo){
        File archivo =new File(nombreArchivo);
        String resultado=null;
        try{
            //Creamos la instancia para leer un archivo
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            //Instanciamos el indice 0 de inicio:
            int i=0;
            //Realizamos la lectura de los archivos:
            linea =entrada.readLine();
            //Inicializamos un ciclo While para recorrer la linea de archivos.
            while(linea !=null){
                //Instanciamos un if dentro del While para verificar si el archivo tiene contenido.
                //En caso positivo Genera una cadena String en la variable Resultado instanciada 
                //anteriormente
                if(buscar !=null && buscar.equalsIgnoreCase(linea)){
                    resultado="Pelicula "+linea+" encontrada en indice "+i;
                    break;
                }//Realizamos la lectura nuevamente hasta que la misma sea nula.
                linea=entrada.readLine();
                i++;
            }
            //Cerramos la lectura de archivos:
            entrada.close();
            //Instanciamos el catch en caso de ocurrir una excepción:
        }catch(IOException ex){
            ex.printStackTrace();
        }
        //devuelve el resultado en este caso la cadena que haya encontrado en el ciclo.
        return resultado;
    }
    
    //METODO PARA CREAR UN ARCHIVO
    public void crear(String nombreArchivo){
        //instanciamos la variable del archivo a crear
        File archivo=new File(nombreArchivo);
        try{
            //Instanciamos la escritura del nuevo archivo
            PrintWriter salida=new PrintWriter(new FileWriter(archivo));
            //Cerramos la lectura de archivos
            salida.close();
            //mensaje de creación del archivo:
            System.out.println("Se ha creado el archivo correctamente");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    //METODO PARA BORRAR UN ARCHIVO SELECCIONADO
    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx{
        File archivo=new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se ha borrado el archivo correctamente");
    }
    
}
