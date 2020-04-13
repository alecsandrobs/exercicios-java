package controle;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        int maior = 0;
        System.out.println("Digite 10 números que eu te direi qual deles e o maior.");
        for (int n = 1; n < 11; n++) {
            System.out.printf("%dº número: ", n);
            int numero = new Scanner(System.in).nextInt();
            if (numero > maior)
                maior = numero;
        }
        System.out.printf("O maior número e: %d", maior);
    }
}
