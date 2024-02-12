import java.util.Scanner;

public class Telas {

    public int  telaInicial(){

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n*-----------------------*");
        System.out.println("|\t -- Jo-Ken-Po --\t|");
        System.out.println("*-----------------------*");
        System.out.printf("| [1] %10s\t\t|\n", "JOGAR");
        System.out.printf("| [0] %10s\t\t|\n", "SAIR");
        System.out.println("*-----------------------*");
        System.out.print("Informe a opção: ");

        return Integer.parseInt(input.nextLine());
    }

    public Jogador criarJogador(){

        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nomeJogador = input.nextLine();
        System.out.print("Idade: ");
        int idadeJogador = Integer.parseInt(input.nextLine());

        Jogador jogador = new Jogador(nomeJogador, idadeJogador);
        jogador.setListaJogadores(jogador);

        return jogador;
    }
}
