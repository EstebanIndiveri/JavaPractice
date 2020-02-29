/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author estel
 */
public interface AccesoDatos {
    public static int MAX_REGISTROS=10;//public y static estan de forma default
    public abstract void insertar();//no implementamos el metodo en la interface
    public abstract void listar();//public y abstract estan por default 
}
