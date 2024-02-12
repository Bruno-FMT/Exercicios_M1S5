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
                    break;
                case 2:
                    Jogador.getListaJogadores();
                    break;
                case 3:
                    System.out.println("Muito Obrigado por Jogar!");
                    break;
            }

            opt = telas.telaInicial();
        }
        System.out.printf("%s | %10s | %3s |\n", "#", "Nome", "Pts");
        System.out.println("*********************");
        Jogador.rankear();
    }
}