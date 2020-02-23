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
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
    //constructor para inicializar variables
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
                idTeclado=++contadorTeclado;
    }
    @Override
    public String toString(){
        return "{ "+"idTeclado= "+idTeclado+", "+super.toString();
    }
}
