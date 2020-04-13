package controle;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.print("Digite algo: ");
        String texto = new Scanner(System.in).nextLine();

        for (int l = 0; l < texto.length(); l++) {
            System.out.println(texto.substring(l, l + 1));
        }
    }
}
