public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentativas = 0;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Jogador(String nome, int idade, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.numeroTentativas = numeroTentativas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public void adicionarPontos(int pts) {
        this.pontuacao += pts;
    }

    public void perderPontos(int pts) {
        this.pontuacao -= pts;
    }

    public void adicionaTentativa(int quantidade) {
        this.numeroTentativas += quantidade;
    }
}
