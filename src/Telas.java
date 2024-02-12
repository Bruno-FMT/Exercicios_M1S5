import java.security.SecureRandom;
import java.util.Scanner;

public class Telas {

    public int  telaInicial(){

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n*-----------------------*");
        System.out.println("|\t -- Jo-Ken-Po --\t|");
        System.out.println("*-----------------------*");
        System.out.printf("| [1] %10s\t\t|\n", "JOGAR");
        System.out.printf("| [2] %10s\t|\n", "LISTAR JOGADORES");
        System.out.printf("| [3] %10s\t|\n", "RANKING JOGADORES");
        System.out.printf("| [0] %10s\t\t|\n", "SAIR");
        System.out.println("*-----------------------*");
        System.out.print("Informe a opção: ");

        return Integer.parseInt(input.nextLine());
    }

    public Jogador criarJogador(){

        Scanner input = new Scanner(System.in);
        String nomeJogador;
        boolean valida;
        do {
            System.out.print("Nome: ");
            nomeJogador = input.nextLine();
            valida = exiteJogador(nomeJogador);
        } while (valida == false);

        System.out.print("Idade: ");
        int idadeJogador = Integer.parseInt(input.nextLine());

        Jogador jogador = new Jogador(nomeJogador, idadeJogador);
        jogador.setListaJogadores(jogador);

        return jogador;
    }

    public boolean exiteJogador(String nomeJogador) {
        if (Jogador.nomeJogadores.contains(nomeJogador)){
            System.out.println("Jogador já existe.");
            return false;
        } else {
            Jogador.nomeJogadores.add(nomeJogador);
            return true;
        }
    }

    public static boolean continuar() {
        Scanner input = new Scanner(System.in);
        System.out.print("[1] para continuar ou [0] para sair: ");

        int opt = Integer.parseInt(input.nextLine());

        if(opt == 0) {
            return false;
        } else {
            return true;
        }
    }
}
