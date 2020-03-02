/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductionjdbc;
import java.sql.*; // clases para el api de JDBC
/**
 *
 * @author estel
 */
public class IntroductionJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //Cadena de conexión de MySql, el parameto useSLL es opcional:Omite el warning cuando no conectamos
        String url="jdbc:mysql://localhost:3306/sga?useSLL=false";
        
        //Cargamos el driver de mySQL
        
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Conectado");
        } catch (ClassNotFoundException ex) {
    System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
        
        try{
            //Carga en memoria la clase de my sql, podemos interactuar:
            Class.forName("com.mysql.cj.jdbc.Driver");
                    //Creamos objeto de conexión:
                    Connection conexion=(Connection)DriverManager.getConnection(url,"root","admin");
                    //Creamos un objeto statement:
                    Statement instruction=conexion.createStatement();
                    //Creamos el Query a ejecutar:
                    String sql="select id_persona, nombre, apellido from persona";
                    ResultSet result=instruction.executeQuery(sql);
                    while(result.next()){
                        //nos posicionamos en la columna 1, registro1:
                        //nos dara el id persona, nombre y apellido de persona
                        System.out.print("id: "+result.getInt(1)+" ");
                        //
                        System.out.print("nombre: "+result.getString(2)+" ");
                        //
                        System.out.println("Apellido: "+result.getString(3));
                    }
                    //Cerranis cada uno de los objetos utilizados
                    result.close();
                    instruction.close();
                    conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
}
