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
public class Escritor extends Empleado{
    //utilizamos una enumeración para las opciones de tipo Escritura
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoescritura){
        super(nombre,sueldo);
        this.tipoEscritura=tipoescritura;
    }
    
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo utilizamos el metodo del padre con Super
        return super.obtenerDetalles()+", tipo de escritura: "+tipoEscritura.getDescription();
    }
    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    public String getTipoEscrituraEnTexto(){
        return tipoEscritura.getDescription();
    }
}
