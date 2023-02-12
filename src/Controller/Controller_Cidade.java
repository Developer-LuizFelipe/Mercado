
package Controller;

import Model.Cidade;
import java.util.List;

public class Controller_Cidade {
  
    public List<Cidade> buscar(){
        return DAO.DAO_Factory.getDAO_cidade().listar();  
}
}
