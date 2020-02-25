/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosobreescritura;

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
    //Sobreescribimios el metodo padre heredado
    public String obtenerDetalles(){
        //Observar como accedemos directamente al atributo heredado
        //debido a que se declaro como protected en la clase padre
        //y por tanto la clase hija lo hereda y accede directamente:
        return "Nombre: "+nombre+
                ", sueldo: "+sueldo+
                ", departemento: "+departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
}
