
package Model;


    
public class Uf {
    private Integer cod;
    private String nome;
    private Cidade[] cidades = new Cidade[50];

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
    }
}
