import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Telas telas = new Telas();
        int opt = telas.telaInicial();
        System.out.println();

        while (opt != 0){
            Jogador jogador = telas.criarJogador();

            opt = telas.telaInicial();
        }

        int n = 1;
        System.out.printf("%s | %10s | %6s", "#", "Nome", "Pts\n");
        for (Jogador jogador : Jogador.listaJogadores) {
            System.out.printf("%d | %10s | %d \n", n, jogador.getNome(), n);
            n++;
        }

    }
}