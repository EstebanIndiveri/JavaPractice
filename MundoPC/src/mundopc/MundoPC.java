/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.ei.compuMundoPC.*;

/**
 *
 * @author estel
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor monitorSamsung=new Monitor("Samsung",21);
        Teclado tecladoAsus=new Teclado("Bluetooth/Mecanico","Asus");
        Raton ratonRedragon=new Raton("USB", "Redragon");
        Computadora compuGamer=new Computadora("Computadora Gamer",monitorSamsung,tecladoAsus,ratonRedragon);
        
        //Computadora 2:
        Monitor monitorGenerico=new Monitor("ilo",17);
        Teclado tecladoNoga=new Teclado("USB","Noga");
        Raton ratonNoga=new Raton("USB","Noga");
        
        Computadora compuOfimatica=new Computadora("Computadora Ofimática",monitorGenerico,tecladoNoga,ratonNoga);
        
        //computadora3:
        Monitor monitorAcer=new Monitor("Acer",25);
        Teclado tecladoRedragon=new Teclado("Bluetooth","Redragon");
        Raton ratonGenius=new Raton("Bluetooth","Genius");
        
        Computadora compuGamaEntrada=new Computadora("Computadora Gama media",monitorAcer,tecladoRedragon,ratonGenius);
        
        Orden orden1=new Orden();
        orden1.agregarComputadora(compuGamer);
        orden1.agregarComputadora(compuOfimatica);
        orden1.agregarComputadora(compuGamer);
        orden1.mostrarOrden();
        
        Orden orden2=new Orden();
        orden2.agregarComputadora(compuGamaEntrada);
        orden2.agregarComputadora(compuGamer);
        System.out.println("");
        orden2.mostrarOrden();
        
    }
    
}
