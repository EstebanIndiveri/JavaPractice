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
public class ImplementationMysql implements AccesoDatos{
    
    @Override//Se instancia no se sobreescribe, primera vez declarado
    public void insertar(){
        System.out.println("Insertar desde MySQL");
    }
    @Override
    public void listar(){
        System.out.println("Listar desde MySQL");
    }
}
