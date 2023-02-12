
package Model;


public class Cidade {
    private Integer cod;
    private String nome;
    private Uf estado = new Uf();

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

    public Uf getEstado() {
        return estado;
    }

    public void setEstado(Uf estado) {
        this.estado = estado;
    }
}
