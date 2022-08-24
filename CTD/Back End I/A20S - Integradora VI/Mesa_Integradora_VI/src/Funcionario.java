public class Funcionario extends Empresa{

    private String nome;
    private String sobrenome;
    private String telefone;
    private String CPF;
    private Double salario;

    public Funcionario(String CNPJ, String razaoSocial, String nome, String sobrenome, String telefone, String CPF, Double salario) {
        super(CNPJ, razaoSocial);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", CPF='" + CPF + '\'' +
                ", salario=" + salario +
                "} Empresa {" +
                "CNPJ='" + getCNPJ() + '\'' +
                ", razaoSocial='" + getRazaoSocial() + '\'' +
                '}'+"\n" + "\n";
    }
}
