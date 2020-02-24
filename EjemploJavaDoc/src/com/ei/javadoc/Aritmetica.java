
package com.ei.javadoc;
/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar,etc
 * @author Esteban Indiveri
 * @version 1.0
 */
public class Aritmetica {
    /**
     * Primer Operando
     */
    int operandoA;
    /**
     * Segundo operando
     */
    int operandoB;
    /**
     * Constructor vacio de la clase
     */
    public Aritmetica(int operandoA, int operandoB){
    this.operandoA=operandoA;
    this.operandoB=operandoB;
    }
    /**
     * Este método realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar(){
        return operandoA+operandoB;
    }
}
