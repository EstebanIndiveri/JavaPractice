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
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    private final String description;
    
    private TipoEscritura(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
