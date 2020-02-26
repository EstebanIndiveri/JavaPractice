/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author estel
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
       super(nombre,sueldo);
       this.departamento=departamento;
    }
    //Sobre escritura del metodo heredado:
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo podemos utilizar el metodo
        //del padre y solo agregar a este metodo de la clase hija 
        //esto es invocar un metodo sobreescrito:
        return super.obtenerDetalles()+", departamento: "+departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
}
