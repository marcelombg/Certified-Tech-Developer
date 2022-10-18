package entities;

public class UsuarioJogo {

    private int id;

    private String nome;

    private String nickName;

    private int pontuacao;

    private int nivel;

    public UsuarioJogo(){

    }

    public UsuarioJogo(int id, String nome, String nickName, int pontuacao, int nivel) {
        this.id = id;
        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Metodos customizados
    public void aumentarPontuacao(double pontuacao) {
        this.pontuacao += pontuacao;
    }

    public void subirNivel(double nivel) {
        this.nivel += nivel;
    }

    public void bonus(int valor) {
        if (this.pontuacao > 10) {
            this.pontuacao += valor;
            System.out.println("Você recebeu um bônus por atingir mais de 10 pontos. Sua pontuação atual é: " +  getPontuacao());
        } else {
            System.out.println("Para ganhar um bônus você deve atingir mais que 10 pontos");
        }
    }

    @Override
    public String toString() {
        return "UsuarioJogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nickName='" + nickName + '\'' +
                ", pontuacao=" + pontuacao +
                ", nivel=" + nivel +
                '}';
    }
}

//UsuarioJogo
//        -	nome: String
//        -	nickname: String
//        -	pontuacao: int
//        -	nivel: int

//        +	UsuarioJogo(nome: String, nickname: String)
//        +	aumentarPontuacao(): void
//        +	subirNivel(): void
//        +	bonus( valor: int): void
