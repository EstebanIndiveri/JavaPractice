/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import excepciones.*;
/**
 *
 * @author estel
 */
public class ImplementationMySql implements AccesoDatos{
    private boolean simularError;
    @Override
    public void insertar() throws AccesoDatosEx{ // excepciones de tipo padre, llega a subclase.
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde MySQL");
        }
    }
    
    @Override
    public void listar() throws AccesoDatosEx{
        if(simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
            System.out.println("Listar desde MySQL");
        }
    }
    public boolean isSimularError(){
        return simularError;
    }
    
    @Override
    public void simularError(boolean simularError){
        this.simularError=simularError;
    }
}
