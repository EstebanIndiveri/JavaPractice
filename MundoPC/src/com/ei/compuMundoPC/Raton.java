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
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    //constructor para variables
    public Raton(String tipoEntrada,String marca){
        super(tipoEntrada,marca);
        idRaton=++contadorRatones;
    }
    @Override
    public String toString(){
        return "{"+" idRaton= "+idRaton+", "+super.toString();
    }
}
