/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ei.compuMundoPC;

/**
 *
 * @author estel
 */
public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    //Se crea el constructor vacio
    private Computadora(){
        idComputadora=++contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.raton=raton;
        this.teclado=teclado;
    }
    //Una vez declaradas los atributos se crean metodos para instanciar y retornar los mismos:
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Monitor getMonitor(){
        return monitor;
    }
    public void setMonitor(Monitor monitor){
        this.monitor=monitor;
    }
    public Teclado getTeclado(){
        return teclado;
    }
    public void setTeclado(Teclado teclado){
        this.teclado=teclado;
    }
    public Raton getRaton(){
        return raton;
    }
    public void setRaton(Raton raton){
        this.raton=raton;
    }
    @Override
    public String toString(){
        return "Computadora{ idComputadora= "+
                idComputadora+
                ", Nombre: "+nombre+
                ", Monitor:"+monitor+
                ", Teclado: "+teclado+
                ", Raton: "+raton+'}';
    }
}
