/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastracto.domain;

/**
 *
 * @author estel
 */
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    //La clase padre no define comportanmiento
    //METODO ABSTRACTO
    public abstract void dibujar();
    
    public String getTipoFigura(){
        return tipoFigura;
    }
    
    public void setTipoFigura(String tipofigura){
        this.tipoFigura=tipofigura;
    }
    public String toString(){
        return "Tipo de figura: "+this.tipoFigura;
    }
}
