/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import java.io.Serializable;
//IO = INPUT OUTPUT
/**
 *
 * @author estel
 */
public class PersonaBean implements Serializable{
    
    private String nombre;
    private int edad;
    
    public PersonaBean(){}
    
    public PersonaBean(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
}
