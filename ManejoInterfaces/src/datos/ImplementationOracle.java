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
public class ImplementationOracle implements AccesoDatos {
    
    //sobreescribimos es una implementación en si y        
    //como se instancia en realidad no sobreescribe

    @Override
    public void insertar(){
        System.out.println("Insertar desde Oracle");
    }
    
    @Override
    public void listar(){
        System.out.println("Listar desde Oracle");
    }
}
