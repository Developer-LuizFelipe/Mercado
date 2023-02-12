package Controller;

import DAO.DAO_Factory;
import Model.Funcionario;
import Util.Serviços;
import java.util.List;

public class Controller_Funcionario {

    public Integer Cadastrar(String nome, Integer cidade,
            String logradouro, String numero, String bairro, String cep,
            String cpf, String rg, String telefone, String email, Integer sexo,
            Integer cargo, String data_nasc, Integer filial, String usuario, String senha) {
        Funcionario funcio = new Funcionario();

        funcio.setNome(nome);
        funcio.getCidade().setCod(cidade);
        funcio.setLogradouro(logradouro);
        funcio.setNumero(numero);
        funcio.setBairro(bairro);
        funcio.setCep(cep);
        funcio.setCpf(cpf);
        funcio.setRg(rg);
        funcio.setEmail(email);
        funcio.setTelefone(telefone);
        funcio.setSexo(sexo);
        funcio.setCargo(cargo);
        funcio.getFilial().setCod(filial);
        funcio.setNascimento(Serviços.levar_Data(data_nasc));
        funcio.setUsuario(usuario);
        funcio.setSenha(senha);
        if (funcio.getNascimento() != null) {

            funcio.setCod(DAO_Factory.getDAO_funcionario().salvar(funcio));
        }

        return funcio.getCod();
    }

    public List<Funcionario> Listar() {

        return DAO_Factory.getDAO_funcionario().listar();
    }

    public List<Funcionario> Pesquisar(String pesquisa) {

        return DAO_Factory.getDAO_funcionario().Pesquisar(pesquisa);
    }

    public int editar(String nome, Integer cidade,
            String logradouro, String numero, String bairro, String cep,
            String cpf, String rg, String telefone, String email, Integer sexo,
            Integer cargo, String data_nasc, Integer filial, Integer codigo) {

        Funcionario funcio = new Funcionario();

        funcio.setCod(codigo);
        funcio.setNome(nome);
        funcio.getCidade().setCod(cidade);
        funcio.setLogradouro(logradouro);
        funcio.setNumero(numero);
        funcio.setBairro(bairro);
        funcio.setCep(cep);
        funcio.setCpf(cpf);
        funcio.setRg(rg);
        funcio.setEmail(email);
        funcio.setTelefone(telefone);
        funcio.setSexo(sexo);
        funcio.setCargo(cargo);
        funcio.getFilial().setCod(filial);
        funcio.setNascimento(Serviços.levar_Data(data_nasc));
        if (funcio.getNascimento() != null) {
            int i = DAO_Factory.getDAO_funcionario().atualizar(funcio);
            return 1;
        }
        return 0;
    }

    public void Excluir(Integer cod) {
        DAO_Factory.getDAO_funcionario().excluir(cod);
    }

    public Integer Logar(String usuario, String senha) {
        Funcionario funcio = new Funcionario();
        funcio.setUsuario(usuario);
        funcio.setSenha(senha);
        return DAO_Factory.getDAO_funcionario().logar(funcio);

    }
}
