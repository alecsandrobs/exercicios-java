package estruturasControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativa = 0;
        int restante = 0;
        System.out.println("Jogo da adivinhação. Você tem 10 tentativas para acertar um número de 1 a 100.");
        for (int t = 10; t >= 1; t--) {
            tentativa = 10 - (t - 1);
            restante = t - 1;
            System.out.printf("%dª tentativa: ", tentativa);
            try {
                numeroDigitado = new Scanner(System.in).nextInt();
            } catch (NumberFormatException e) {
                numeroDigitado = 0;
            }
            if (numeroGerado == numeroDigitado) {
                System.out.printf("Parabéns!!!\nVocê acertou na %dª tentativa.\n", tentativa);
                break;
            }
            if (numeroDigitado > 100 && numeroDigitado > 0) {
                System.out.printf("O número (%s) não está entre 1-100.\n", numeroDigitado);
                continue;
            }
            System.out.printf("O número digitado (%d) e %s que o gerado. %s\n",
                    numeroDigitado, numeroDigitado > numeroGerado ? "maior" : "menor",
                    restante > 0 ? String.format("(Restam %d %s)", restante, restante > 1 ? "tentativas" : "tentativa") : "");
        }
        System.out.printf("Número gerado: %d.", numeroGerado);
    }
}
