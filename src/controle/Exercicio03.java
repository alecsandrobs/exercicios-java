package controle;

import java.text.DecimalFormat;

public class Exercicio03 {

    public static void calcularMedia(double... notas) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        double soma = 0;
        if (notas.length > 0) {
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.length;

            if (media >= 7 && media <= 10) {
                System.out.printf("Aprovado com média %s.\n", df.format(media));
            } else if (media < 7 && media > 4) {
                System.out.printf("Recuperaçao com média %s.\n", df.format(media));
            } else {
                System.out.printf("Reprovado com média %s.\n", df.format(media));
            }
        } else {
            System.out.println("Não é possível caalcular a média sem notas.");
        }
    }

    public static void main(String[] args) {
        calcularMedia();
        calcularMedia(7.5);
        calcularMedia(8.5, 9);
        calcularMedia(6.5, 5.5, 7);
        calcularMedia(1, 2.5, 4);
    }
}
