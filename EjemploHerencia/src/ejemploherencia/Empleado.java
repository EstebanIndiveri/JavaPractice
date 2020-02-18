/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author estel
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // propia de la clase, se sumará siempre no reinicia
    
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado=++contadorEmpleados;//Preincremento para que inicie en 1
        this.sueldo=sueldo;
    }
    public int getIdEmpleado(){
        return idEmpleado;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Empleado {"+" idEmpleado= "+idEmpleado+", sueldo= "+sueldo+'}';
    }
}
