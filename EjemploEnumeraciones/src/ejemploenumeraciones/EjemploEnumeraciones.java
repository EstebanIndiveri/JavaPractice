/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author estel
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("valor 1: "+Dias.LUNES);
        indicarDia(Dias.LUNES);
    
            //utilizamos la enumeracion de paises:
            System.out.println("Contintente no4: "+Continentes.AMERICA);
            System.out.println("Paises en America: "+Continentes.AMERICA.getPaises());
            //Test de pais por continente:
            System.out.println("");
            indicarPaises(Continentes.AFRICA);

            //imprimimos los continentes:
            System.out.println("");
            imprimirContinentes();
    }
        
        public static void indicarDia(Dias dias){
            switch(dias){
                case LUNES:
                    System.out.println("Primer dia de la semana");
                    break;
                case MARTES:
                    System.out.println("Segundo día de la semana");
                    break;
                default:
                    System.out.println("Continúa para el resto de los días enumerados");
            }
        }
            
            public static void indicarPaises(Continentes continentes){
                switch(continentes){
                    //Podemos usar algun valor constatne de la enumeracion directamente
                    case AFRICA:
                        System.out.println("No.Paiss en: "+continentes+": "+continentes.getPaises());
                        break;
                    default:
                        System.out.println("Y así seguimos con los demás continentes enumerados");
                }
            }
            public static void imprimirContinentes(){
                //utilizamos un forEach:
                for(Continentes c:Continentes.values()){
                    System.out.println("Continente: "+c+", contiene "+c.getPaises()+" paises.");
                }
            }
}
