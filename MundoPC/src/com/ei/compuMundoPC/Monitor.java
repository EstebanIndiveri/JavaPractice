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
public class Monitor {
   private final int idMonitor;
   private String marca;
   private double tamaño;
   private static int contadorMonitores;
   //Constructor vacio llama al contador estatico
   private Monitor(){
       idMonitor=++contadorMonitores;
   }
   
   public Monitor(String marca, double tamaño){
       this();
       this.marca=marca;
       this.tamaño=tamaño;
   }
   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca=marca;
   }
   public double getTamaño(){
       return tamaño;
   }
   public void setTamaño(double tamaño){
       this.tamaño=tamaño;
   }
   
   //Concatena y devuelve
   @Override
   public String toString(){
       return "{ "+"idMonitor= "+idMonitor+", marca= "+marca+", tamaño= "+tamaño+'}';
   }
}
