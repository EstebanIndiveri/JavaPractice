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
public class Persona { // extends de objeto implicitamente 
    private String nombre;
    private char genero;
    private int edad;
    private String direction;
    
    public Persona(){}//crear objeto sin parametro
    
    public Persona(String nombre){//crear objeto con parametro nombre
        this.nombre=nombre;
    }
    public Persona(String nombre, char genero,int edad, String direction){//objeto completo
        this.nombre=nombre;
        this.genero=genero;//Un caracter M o F;
        this.edad=edad;
        this.direction=direction;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getDirection(){
        return direction;
    }
    public void setDirection(String direction){
        this.direction=direction;
    }
    @Override
    public String toString(){
        return "Persona { "+"nombre= "+nombre+ ", genero= "+genero+ ", edad= "+edad+ ", direction= "+direction+'}';
    }
}

