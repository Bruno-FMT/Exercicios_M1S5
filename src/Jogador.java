import java.util.ArrayList;

public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentativas = 0;

    public Jogador(){}

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String toString(){
        System.out.println("*************************");
        System.out.printf("* Nome: %s\n", getNome());
        System.out.printf("* Idade: %s\n", getIdade());
        System.out.printf("* Tentativas: %d\n", getNumeroTentativas());
        System.out.printf("* Pontos: %d\n", getPontuacao());
        System.out.println("*************************");
        return null;
    }
}
