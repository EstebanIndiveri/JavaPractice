/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author estel
 */
public class Gerente extends Empleado {
   private String departamento;
   
   public Gerente(String nombre,double sueldo, String departamento){
       super(nombre,sueldo);//Esto trae el retorno de nombre y sueldo de la clase padre;
       this.departamento=departamento;
   }
   //Sobreescribimos el metodo heredado de la clase padre;
   public String obtenerDetalles(){
       //Para no repertir el código podemos utilizar el metodo padre y agregar este metodo de la clase hija
       //invoca un metodo sobreescrito
       return super.obtenerDetalles()+", departamento: "+departamento;//con super llamo al padre y solo seteo el dpto
   }
   public String getDepartamento(){
       return departamento;
   }
   public void setDepartamento(String departamento){
       this.departamento=departamento;
   }
}
