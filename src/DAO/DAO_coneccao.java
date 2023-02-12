
package DAO;

import Util.ConnectionFactory;
import java.sql.Connection;

public class DAO_coneccao {
    
    
     protected Connection conexao;
    
    public DAO_coneccao(){        
        
        this.conexao = ConnectionFactory.getConnect();
    }
}
