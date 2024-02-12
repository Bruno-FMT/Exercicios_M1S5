import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Telas telas = new Telas();
        int opt = telas.telaInicial();
        System.out.println();

        while (opt != 0){

            switch (opt){
                case 1:
                    Jogador jogador = telas.criarJogador();
                    Jogo jogo = new Jogo();
                    jogo.jogar(jogador);
                    boolean cont = Telas.continuar();

                    do {
                        jogo.jogar(jogador);
                        cont = Telas.continuar();
                    } while (cont);

                    System.out.println("\nPontuação Bônus");

                    Scanner input = new Scanner(System.in);
                    SecureRandom rand = new SecureRandom();

                    int bonus = rand.nextInt(5) + 1;
                    System.out.print("Esolha um número de 1 á 5: ");
                    int palpite = Integer.parseInt(input.nextLine());

                    if (palpite == bonus) {
                        jogador.adicionarPontos();
                    }

                    break;
                case 2:
                    Jogador.getListaJogadores();
                    break;
                case 3:
                    System.out.printf("%s | %10s | %3s |\n", "#", "Nome", "Pts");
                    System.out.println("*********************");
                    Jogador.rankear();
                    break;
                case 0:
                    System.out.println("Muito Obrigado por Jogar!");
                    break;
            }

            opt = telas.telaInicial();
        }
    }
}