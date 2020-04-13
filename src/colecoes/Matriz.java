package colecoes;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int alunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int notas = entrada.nextInt();

        double[][] avaliacoes = new double[alunos][notas];

        double total = 0;
        for (int a = 0; a < avaliacoes.length; a++) {
            for (int n = 0; n < avaliacoes[a].length; n++) {
                System.out.printf("Informe a %dª nota do aluno %d: ", n + 1, a + 1);
                avaliacoes[a][n] = entrada.nextDouble();
                total += avaliacoes[a][n];
            }
        }

        double media = total / (alunos * notas);
        System.out.println(String.format("Média da turma: %.2f", media));

        entrada.close();
    }
}
