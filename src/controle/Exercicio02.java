package controle;

import java.time.LocalDate;

public class Exercicio02 {

    public static boolean ehBissexto(int ano) {
        return ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0);
    }

    public static void main(String[] args) {
        int ano = LocalDate.now().getYear();
        System.out.printf("O ano %d %s bissexto.", ano, ehBissexto(ano) ? "é" : "não é");
        for (int i = 1987; i <= ano; i++) {
            System.out.printf("\nAno de %d%s", i, ehBissexto(i) ? " é bissexto." : ".");
        }
    }
}
