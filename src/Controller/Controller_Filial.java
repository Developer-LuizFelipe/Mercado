package Controller;

import DAO.DAO_Factory;
import Model.Filial;
import java.util.List;

public class Controller_Filial {

    public Integer Cadastrar(String nome, Integer cidade,
            String logradouro, String numero, String bairro, String cep,
            String cnpj, String telefone, String email) {
        
        Filial filial = new Filial();

        filial.setNome(nome);
        filial.getCidade().setCod(cidade);
        filial.setLogradouro(logradouro);
        filial.setNumero(numero);
        filial.setBairro(bairro);
        filial.setCep(cep);
        filial.setCnpj(cnpj);
        filial.setEmail(email);
        filial.setTelefone(telefone);

        filial.setCod(DAO_Factory.getDAO_filial().salvar(filial));

        return filial.getCod();
    }
    
    public List<Filial> Listar(){
        
        return DAO_Factory.getDAO_filial().listar();   
    }

    public List<Filial> Pesquisar(String pesquisa){
        
        return DAO_Factory.getDAO_filial().Pesquisar(pesquisa);   
    }
    
    
    public void Atualizar (Filial filial){
        DAO_Factory.getDAO_filial().atualizar(filial);
    }
    
    public void Excluir (Integer cod){
        DAO_Factory.getDAO_filial().excluir(cod);
    }
            
}
