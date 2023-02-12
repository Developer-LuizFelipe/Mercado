
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
   
    private static final String banco = "mercado";
    private static final String usuario = "root";
    private static final String senha = "Sxz211085";
    
    public static Connection getConnect(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
