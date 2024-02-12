import java.security.SecureRandom;
import java.util.Scanner;

public class Jogo {
    private String melhorJogador;
    private int numeroTentativas;

    public void jogar(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        System.out.println("\n\n\n\t\t\t*****************");
        System.out.println("\t\t\tBem-vindo ao jogo");
        System.out.println("\t\t\t*****************\n\n");
        System.out.print("[1] PEDRA -");
        System.out.print("[2] PAPEL -");
        System.out.print("[3] TESOURA\n");

        System.out.printf("Informe sua escolha %s: ", jogador.getNome());

        int opt = Integer.parseInt(input.nextLine());

        int escolhaPc = rand.nextInt(3) + 1;

        switch (opt){
            case 1:
                if (escolhaPc == 2){
                    System.out.println("Você Perdeu!");
                    jogador.adicionaTentativa();
                    if (jogador.getPontuacao() != 0){
                        jogador.perderPontos();
                    }
                    jogador.adicionaTentativa();
                } else if (escolhaPc == 3){
                    System.out.println("Você Venceu");
                    jogador.adicionaTentativa();
                    jogador.adicionarPontos();
                } else {
                    System.out.println("Empate");
                    jogador.adicionaTentativa();
                }
                break;
            case 2:
                if (escolhaPc == 3){
                    System.out.println("Você Perdeu!");
                    jogador.adicionaTentativa();
                    if (jogador.getPontuacao() != 0){
                        jogador.perderPontos();
                    }
                    jogador.adicionaTentativa();
                } else if (escolhaPc == 1){
                    System.out.println("Você Venceu");
                    jogador.adicionaTentativa();
                    jogador.adicionarPontos();
                } else {
                    System.out.println("Empate");
                    jogador.adicionaTentativa();
                }
                break;
            case 3:
                if (escolhaPc == 1){
                    System.out.println("Você Perdeu!");
                    jogador.adicionaTentativa();
                    if (jogador.getPontuacao() != 0){
                        jogador.perderPontos();
                    }
                    jogador.adicionaTentativa();
                } else if (escolhaPc == 2){
                    System.out.println("Você Venceu");
                    jogador.adicionaTentativa();
                    jogador.adicionarPontos();
                } else {
                    System.out.println("Empate");
                    jogador.adicionaTentativa();
                }
                break;
            default:
                System.out.println("Opção Inválida");
                jogar(jogador);
        }
    }
}
