import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {

    private String CNPJ;
    private String razaoSocial;
    private Funcionario funcionario;

    public Empresa(String CNPJ, String razaoSocial) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", funcionario=" + funcionario +
                '}';
    }
}
