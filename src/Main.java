import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t-- Jo-Ken-Po --\t\t");
        System.out.println("| [1] Novo Jogo");
        System.out.println();

        Jogador jogador = new Jogador();

        System.out.print("Entre nome do Jogador: ");
        jogador.setNome(input.nextLine());
        System.out.print("Entre idade do Jogador: ");
        jogador.setIdade(Integer.parseInt(input.nextLine()));

        jogador.toString();
    }
}