public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentaivas = 0;

    public void adicionarPontos(int pts) {
        this.pontuacao += pts;
    }

    public void perderPontos(int pts) {
        this.pontuacao -= pts;
    }

    public void adicionaTentativa(int quantidade) {
        this.numeroTentaivas += quantidade;
    }
}
