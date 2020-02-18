/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Date;

public class Cliente extends Persona{
   private int idCliente;
   private java.util.Date fechaRegistro;
   private boolean vip;
   private static int contadorClientes; // propiedad de la clase, siempre suma.
   
   public Cliente(Date fechaRegistro, boolean vip){
       this.idCliente=++contadorClientes;
       this.fechaRegistro=fechaRegistro;
       this.vip=vip;
   }
   public int getIdCliente(){
       return idCliente;
   } 
   public Date getFechaRegistro(){
       return fechaRegistro;
   }
   public boolean isVip(){
       return vip;
   }
   public void setVip(boolean vip){
       this.vip=vip;
   }
   @Override
   public String toString(){
       return super.toString()+" Cliente{ "+ "IdCliente= "+idCliente+", fechaRegistro= "+fechaRegistro
               +", vip= "+vip+'}';
   }
}
