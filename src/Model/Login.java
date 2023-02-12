
package Model;

import java.util.Date;


public class Login {
    private Integer cod;

    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }


}
