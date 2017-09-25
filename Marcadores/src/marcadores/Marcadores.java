
package marcadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Marcadores {

  
    public static void main(String[] args) {
  
        Ventana miVentana= new Ventana();
        miVentana.setVisible(true);
        
        Connection conexion;
        String url="jdbc:mysql://localhost:3306/marcador";
        String usuario="root";
        String clave="mysql2017";
        
        try {
            conexion=DriverManager.getConnection(url, usuario,clave);
            System.out.println("por fin");
            String cadena= "INSERT INTO coordenadas (latitud,longitud) VALUES (4.2,8.1)";
            Statement sentencia;
            sentencia=conexion.createStatement();
            sentencia.execute(cadena);
            
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
