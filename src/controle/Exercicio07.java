package controle;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        String calculo = null;
        System.out.printf("Some os números:");
        while (numero >= 0) {
            System.out.printf("\nNúmero: ");
            numero = new Scanner(System.in).nextInt();
            if (numero >= 0) {
                if (calculo != null)
                    calculo += String.format(" + %d", numero);
                else
                    calculo = Integer.toString(numero);
                System.out.printf("%s = %d.", calculo, soma += numero);
            }
        }
    }
}
