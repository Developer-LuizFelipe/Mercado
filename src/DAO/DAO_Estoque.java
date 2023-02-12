package DAO;

import Model.Funcionario;
import View.Menu_principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_Estoque extends DAO_coneccao {

    public Integer salvar(Funcionario funcio) {
        Integer last_inserted_id = null;
        try {
            System.out.println("entrou no dao");
            PreparedStatement stmt = this.conexao.prepareStatement("insert into"
                    + " tbl_Funcionario(nome, sexo, cpf, rg, data_nasc, telefone, email,"
                    + "logradouro, numero, bairro, cod_cidade, cep, cargo, cod_filial,"
                    + "usuario, senha) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, funcio.getNome());
            stmt.setInt(2, funcio.getSexo());
            stmt.setLong(3, Long.parseLong(funcio.getCpf()));
            stmt.setLong(4, Long.parseLong(funcio.getRg()));
            stmt.setString(5, funcio.getNascimento());
            stmt.setString(6, funcio.getTelefone());
            stmt.setString(7, funcio.getEmail());
            stmt.setString(8, funcio.getLogradouro());
            stmt.setInt(9, Integer.parseInt(funcio.getNumero()));
            stmt.setString(10, funcio.getBairro());
            stmt.setInt(11, funcio.getCidade().getCod());
            stmt.setString(12, funcio.getCep());
            stmt.setInt(13, funcio.getCargo());
            stmt.setInt(14, funcio.getFilial().getCod());
            stmt.setString(15, funcio.getUsuario());
            stmt.setString(16, funcio.getSenha());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                last_inserted_id = rs.getInt(1);
            }
        } catch (SQLException ex) {
        }
        return last_inserted_id;
    }

    public List<Funcionario> listar() {
        List<Funcionario> funcionarios = new ArrayList<>();
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("SELECT f.cod_funcionario, f.nome,"
                    + " f.cpf, f.rg, f.data_nasc, f.sexo, f.logradouro, f.numero, f.bairro, f.cep,"
                    + " c.nome AS nomeCi, c.cod_cidade, u.cod_UF, u.nome as nomeUf, f.email, f.telefone,"
                    + " f.cargo, fi.cod_filial, fi.nome as nome_filial from tbl_filial fi INNER JOIN "
                    + " tbl_Funcionario f ON(fi.cod_filial = f.cod_filial) INNER JOIN tbl_Cidade c "
                    + " ON(f.cod_cidade = c.cod_cidade) INNER JOIN tbl_UF u ON (c.cod_UF = u.cod_UF)"
                    + " ORDER BY f.cod_filial");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setCod(rs.getInt("cod_funcionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setNascimento(rs.getString("data_nasc"));
                funcionario.setSexo(rs.getInt("sexo"));
                funcionario.setLogradouro(rs.getString("logradouro"));
                funcionario.setNumero(rs.getString("numero"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.getCidade().setNome(rs.getString("nomeCi"));
                funcionario.getCidade().setCod(rs.getInt("cod_cidade"));
                funcionario.getCidade().getEstado().setCod(rs.getInt("cod_UF"));
                funcionario.getCidade().getEstado().setNome(rs.getString("nomeUf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCargo(rs.getInt("cargo"));
                funcionario.getFilial().setCod(rs.getInt("cod_filial"));
                funcionario.getFilial().setNome(rs.getString("nome_filial"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
    }

    public List<Funcionario> Pesquisar(String pesquisa) {
        List<Funcionario> funcionarios = new ArrayList<>();
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("SELECT f.cod_funcionario, f.nome,"
                    + " f.cpf, f.rg, f.data_nasc, f.sexo, f.logradouro, f.numero, f.bairro, f.cep,"
                    + " c.nome AS nomeCi, c.cod_cidade, u.cod_UF, u.nome as nomeUf, f.email, f.telefone,"
                    + " f.cargo, fi.cod_filial, fi.nome as nome_filial from tbl_filial fi INNER JOIN "
                    + " tbl_Funcionario f ON(fi.cod_filial = f.cod_filial) INNER JOIN tbl_Cidade c "
                    + " ON(f.cod_cidade = c.cod_cidade) INNER JOIN tbl_UF u ON (c.cod_UF = u.cod_UF)"
                    + " where f.nome like '%"+pesquisa+"%'ORDER BY f.cod_filial");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setCod(rs.getInt("cod_funcionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setNascimento(rs.getString("data_nasc"));
                funcionario.setSexo(rs.getInt("sexo"));
                funcionario.setLogradouro(rs.getString("logradouro"));
                funcionario.setNumero(rs.getString("numero"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.getCidade().setNome(rs.getString("nomeCi"));
                funcionario.getCidade().setCod(rs.getInt("cod_cidade"));
                funcionario.getCidade().getEstado().setCod(rs.getInt("cod_UF"));
                funcionario.getCidade().getEstado().setNome(rs.getString("nomeUf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCargo(rs.getInt("cargo"));
                funcionario.getFilial().setCod(rs.getInt("cod_filial"));
                funcionario.getFilial().setNome(rs.getString("nome_filial"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
    }

    public int atualizar(Funcionario funcionario) {

        try {
            PreparedStatement stmt = this.conexao.prepareStatement("UPDATE "
                    + " tbl_funcionario SET nome = ?, sexo = ?, cpf = ?, rg = ?, data_nasc = ?,"
                    + " telefone = ?, email = ?, logradouro =?, numero = ?, bairro = ?, "
                    + " cod_cidade = ?, cep =?, cargo = ?, cod_filial = ?"
                    + " WHERE cod_funcionario = ?");
            stmt.setString(1, funcionario.getNome());
            stmt.setInt(2, funcionario.getSexo());
            stmt.setLong(3, Long.parseLong(funcionario.getCpf()));
            stmt.setLong(4, Long.parseLong(funcionario.getRg()));
            stmt.setString(5, funcionario.getNascimento());
            stmt.setString(6, funcionario.getTelefone());
            stmt.setString(7, funcionario.getEmail());
            stmt.setString(8, funcionario.getLogradouro());
            stmt.setInt(9, Integer.parseInt(funcionario.getNumero()));
            stmt.setString(10, funcionario.getBairro());
            stmt.setInt(11, funcionario.getCidade().getCod());
            stmt.setString(12, funcionario.getCep());
            stmt.setInt(13, funcionario.getCargo());
            stmt.setInt(14, funcionario.getFilial().getCod());
            stmt.setInt(15, funcionario.getCod());

            stmt.executeUpdate();
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Estoque.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public void excluir(Integer cod) {

        try {

            PreparedStatement stmt = this.conexao.prepareStatement("delete from tbl_funcionario where cod_funcionario=?");
            stmt.setInt(1, cod);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Integer logar(Funcionario funcio) {
        try {

            PreparedStatement stmt = this.conexao.prepareStatement("SELECT cod_funcionario FROM"
                    + " tbl_Funcionario WHERE usuario = ? AND senha = ? ");
            stmt.setString(1, funcio.getUsuario());
            stmt.setString(2, funcio.getSenha());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                funcio.setCod(rs.getInt("cod_funcionario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (funcio.getCod() != null) {
            return funcio.getCod();
        } else {
            return null;
        }

    }
}
