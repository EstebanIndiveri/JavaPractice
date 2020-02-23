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
public class DispositivoEntrada {
   private String tipoDeEntrada;
   private String marca;
   
   public DispositivoEntrada(String tipoDeEntrada,String marca){
       this.tipoDeEntrada=tipoDeEntrada;
       this.marca=marca;
   }
   public String getTipoDeEntrada(){
       return tipoDeEntrada;
   }
   public void setTipoDeEntrada(String tipoDeEntrada){
       this.tipoDeEntrada=tipoDeEntrada;
   }
   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca=marca;
   }
   
   @Override
   public String toString(){
       return "DispositivosDeEntrada{ marca= "+marca+", tipoDeEntrada= "+tipoDeEntrada+'}';
   }
    
}
