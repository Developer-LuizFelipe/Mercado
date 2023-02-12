package DAO;

import Model.Cidade;
import Model.Filial;
import View.Menu_principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAO_Filial extends DAO_coneccao {

    public Integer salvar(Filial filial) {
        Integer last_inserted_id = null;
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("insert into"
                    + " tbl_Filial(nome, CNPJ, cod_cidade, logradouro, numero, "
                    + "bairro, cep, email, telefone) values(?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, filial.getNome());
            stmt.setString(2, filial.getCnpj());
            stmt.setInt(3, filial.getCidade().getCod());
            stmt.setString(4, filial.getLogradouro());
            stmt.setString(5, filial.getNumero());
            stmt.setString(6, filial.getBairro());
            stmt.setString(7, filial.getCep());
            stmt.setString(8, filial.getEmail());
            stmt.setString(9, filial.getTelefone());
            
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                last_inserted_id = rs.getInt(1);
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(parentComponent, "");
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return last_inserted_id;
    }

    public List<Filial> listar() {
        List<Filial> filial = new ArrayList<>();
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("SELECT f.cod_filial,"
                    + " f.nome, f.CNPJ, f.logradouro, f.numero, f.bairro, f.cep, c.nome AS nomeCi,"
                    + " c.cod_cidade,u.cod_UF, u.nome as nomeUf, f.email, f.telefone from tbl_Filial "
                    + "f INNER JOIN tbl_Cidade c ON(f.cod_cidade = c.cod_cidade) INNER JOIN tbl_UF u"
                    + " ON (c.cod_UF = u.cod_UF) ORDER BY f.cod_filial");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filial fi = new Filial();
                fi.setCod(rs.getInt("cod_filial"));
                fi.setNome(rs.getString("nome"));
                fi.setCnpj(rs.getString("CNPJ"));
                fi.setLogradouro(rs.getString("logradouro"));
                fi.setNumero(rs.getString("numero"));
                fi.setBairro(rs.getString("bairro"));
                fi.setCep(rs.getString("cep"));
                fi.getCidade().getEstado().setNome(rs.getString("nomeUf"));
                fi.getCidade().getEstado().setCod(rs.getInt("cod_UF"));
                fi.getCidade().setCod(rs.getInt("cod_cidade"));
                fi.getCidade().setNome(rs.getString("nomeCi"));
                fi.setEmail(rs.getString("email"));
                fi.setTelefone(rs.getString("telefone"));

                filial.add(fi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filial;
    }

    public List<Filial> Pesquisar(String pesquisa) {
        List<Filial> filial = new ArrayList<>();
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("SELECT f.cod_filial,"
                    + " f.nome, f.CNPJ, f.logradouro, f.numero, f.bairro, f.cep, c.nome AS nomeCi,"
                    + " c.cod_cidade,u.cod_UF, u.nome as nomeUf, f.email, f.telefone from tbl_Filial "
                    + "f INNER JOIN tbl_Cidade c ON(f.cod_cidade = c.cod_cidade) INNER JOIN tbl_UF u"
                    + " ON (c.cod_UF = u.cod_UF) where f.nome like '%"+pesquisa+"%'ORDER BY f.cod_filial");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filial fi = new Filial();
                fi.setCod(rs.getInt("cod_filial"));
                fi.setNome(rs.getString("nome"));
                fi.setCnpj(rs.getString("CNPJ"));
                fi.setLogradouro(rs.getString("logradouro"));
                fi.setNumero(rs.getString("numero"));
                fi.setBairro(rs.getString("bairro"));
                fi.setCep(rs.getString("cep"));
                fi.getCidade().getEstado().setNome(rs.getString("nomeUf"));
                fi.getCidade().getEstado().setCod(rs.getInt("cod_UF"));
                fi.getCidade().setCod(rs.getInt("cod_cidade"));
                fi.getCidade().setNome(rs.getString("nomeCi"));
                fi.setEmail(rs.getString("email"));
                fi.setTelefone(rs.getString("telefone"));

                filial.add(fi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filial;
    }
    
    
    
    public void atualizar(Filial filial) {

        try {
            PreparedStatement stmt = this.conexao.prepareStatement("UPDATE "
                    + " tbl_filial SET nome = ?, CNPJ = ?, cod_cidade = ?, logradouro =?,"
                    + " numero = ?, bairro = ?, cep =?, email = ?, telefone = ? WHERE cod_filial = ?");
            stmt.setString(1, filial.getNome());
            stmt.setString(2, filial.getCnpj());
            stmt.setInt(3, filial.getCidade().getCod());
            stmt.setString(4, filial.getLogradouro());
            stmt.setString(5, filial.getNumero());
            stmt.setString(6, filial.getBairro());
            stmt.setString(7, filial.getCep());
            stmt.setString(8, filial.getEmail());
            stmt.setString(9, filial.getTelefone());
            stmt.setInt(10, filial.getCod());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Filial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluir(Integer cod) {

        try {

            PreparedStatement stmt = this.conexao.prepareStatement("delete from tbl_filial where cod_filial=?");
            stmt.setInt(1, cod);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
