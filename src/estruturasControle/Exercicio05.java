package estruturasControle;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int contador = 0;

        System.out.print("Número: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                contador++;
        }
        System.out.println();
        switch (contador) {
            case 0:
                System.out.printf("O número (%d) é um número primo", numero);
                break;
            default:
                System.out.printf("O número (%d) não é um número primo.", numero);
        }
    }
}
