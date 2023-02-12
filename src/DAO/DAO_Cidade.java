
package DAO;


import Model.Cidade;
import View.Menu_principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO_Cidade extends DAO_coneccao{
    
//("SELECT a.numeroMatricula, p.id, p.nome, "
//                    + "p.cidade_id, c.nome as nomeCidade, c.uf_id, u.nome as nomeUf "
//                    + "FROM aluno AS a INNER JOIN pessoa AS p ON(a.pessoa_id=p.id) "
//                    + "INNER JOIN cidade AS c ON(p.cidade_id=c.id) "
//                    + "INNER JOIN uf AS u on(u.id=c.uf_id) ORDER BY p.nome");
    public List<Cidade> listar() {
        List<Cidade> cidade = new ArrayList<>();
        try {
            
            PreparedStatement stmt = this.conexao.prepareStatement("select c.cod_cidade,"
                    + " c.nome, u.cod_UF, u.nome as nomeUf from tbl_Cidade c "
                    + "INNER JOIN tbl_UF u ON(c.cod_UF = u.cod_UF) ORDER BY c.nome");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cidade ci = new Cidade();
                ci.setNome(rs.getString("nome"));
                ci.getEstado().setNome(rs.getString("nomeUf"));
                ci.getEstado().setCod(rs.getInt("cod_UF"));
                ci.setCod(rs.getInt("cod_cidade"));
                cidade.add(ci);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cidade;
    }

}
