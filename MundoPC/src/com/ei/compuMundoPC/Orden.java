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
public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    //maximo de computadoras
    private static final int maxComputadoras=10;
   
    public Orden(){
        this.idOrden=++contadorOrdenes;
        //instanciamos el arreglo
        computadoras=new Computadora[maxComputadoras];
    }
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras<maxComputadoras){
            computadoras[contadorComputadoras++]=computadora;
        }else{
            System.out.println("se ha superado el maximo de productos: "+maxComputadoras);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #: "+idOrden);
        System.out.println("Computadoras de la orden #"+idOrden+":");
        for(int i=0;i<contadorComputadoras;i++){
        System.out.println(computadoras[i]);
    }
    }
    
}
