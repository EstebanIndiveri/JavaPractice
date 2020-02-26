/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author estel
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    @Override
    public String toString(){
        return "Empleado {"+" nombre= "+nombre+", sueldo= "+sueldo+'}';
    }
    @Override
    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        if(object instanceof Empleado){
            Empleado emp=(Empleado)object;
            if(nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
    int hash=7;
    hash=31 * hash +this.nombre.hashCode();
    hash=31 * hash+Double.valueOf(this.sueldo).hashCode();
    return hash;
    }
}