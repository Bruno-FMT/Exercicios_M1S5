import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Jogador implements Comparable<Jogador>{

    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentativas = 0;
    public static ArrayList<Jogador> listaJogadores = new ArrayList<>();
    public static ArrayList<String> nomeJogadores = new ArrayList<>();
    public static ArrayList<String> rankig = new ArrayList<>();
    private static int contadorPosicao = 1;

    public void setListaJogadores(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public static void getListaJogadores() throws InterruptedException {
        int n = 1;
        System.out.printf("\n\n| %10s | %s |\n", "Nome", "Idade");
        for (Jogador jogador : Jogador.listaJogadores) {
            System.out.printf("| %10s | %5d |\n", jogador.getNome(), jogador.getIdade());
            n++;
        }
        Thread.sleep(5000);
    }

    public static void rankear() throws InterruptedException {
        Collections.sort(listaJogadores);

        for (Jogador j : listaJogadores){
            System.out.println(j);
        }

        Thread.sleep(4000);
    }

    public Jogador(){}
    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
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


    public void setIdade(int idade) {this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
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
        System.out.printf("%s | %10s | %3d |\n", contadorPosicao, getNome(), getPontuacao());
        contadorPosicao++;
        return "*********************";
    }

    @Override
    public int compareTo(Jogador outroJogador) {
        if (this.pontuacao > outroJogador.getPontuacao()){
            return -1;
        } if (this.pontuacao < outroJogador.getPontuacao()){
            return 1;
        }
        return 0;
    }
}
