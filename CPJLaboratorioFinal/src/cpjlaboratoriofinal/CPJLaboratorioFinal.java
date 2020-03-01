/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpjlaboratoriofinal;
import java.util.Scanner;
import ar.com.peliculas.negocio.*;
/**
 *
 * @author estel
 */
public class CPJLaboratorioFinal {
    private static final Scanner scanner=new Scanner(System.in);
    private static int opcion=-1;
    private static final String nombreArchivo="C:\\Users\\estel\\OneDrive\\Escritorio\\Proyectos JAVA\\ArchivosCreadosPeliculasJava\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli=new CatalogoPeliculasImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mientras la opcion elegida es 0 preguntamos al usuario
        while(opcion!=0){
            try{
                System.out.println("Elige una opción:\n1.-Iniciar el catalogo de peliculas"+
                        "\n2.-Agregar Pelicula\n"
                        +"3.-Listar Peliculas\n"
                        +"4.-Buscar Peliculas\n"
                        +"0.-Salir");
                opcion=Integer.parseInt(scanner.nextLine());
                
                //Lanzamos Switch para las opciones que puedan seleccionarse:
                switch(opcion){
                    case 1:
                        //Creamos al objeto que administra el catalogo de personas
                        //Se crea al escribir por primera vez en el archivo:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    
                    case 2:
                        //Agregamos información al archivo:
                        System.out.println("Introduce el nombre de una pelicula para agregar al catalogo");
                        String nombre=scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    
                    case 3:
                        //Listamos el catalogo completo de peliculas:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                        
                    case 4:
                        //Buscamos la pelicula especificada:
                        System.out.println("Introduce el nombre de la pelicula que deseas buscar: ");
                        String buscar=scanner.nextLine();
                        catalogoPeli.buscarPelicula(buscar, nombreArchivo);
                        break;
                        
                    case 0:
                        System.out.println("¡Gracias por utilizar nuestro catalogo, hasta pronto!");
                        break;
                    
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
            }catch(Exception e){
                System.out.println("¡Ocurrió un Error, intenta nuevamente!");
            }
        }
    }
    
}
