package colecoes;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        double notasAlunoB[] = new double[3];
        double[] notasAlunoC = {9.9, 8.7, 7.2, 9.4};

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        double totalAlunoA = 0;
        System.out.println(Arrays.toString(notasAlunoA));
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(String.format("Média do aluno A: %f", totalAlunoA / notasAlunoA.length));

        notasAlunoB[0] = 9.7;
        notasAlunoB[1] = 7;
        notasAlunoB[2] = 7.6;
        double totalAlunoB = 0;
        System.out.println(Arrays.toString(notasAlunoB));
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(String.format("Média do aluno B: %f", totalAlunoB / notasAlunoB.length));

        System.out.println(Arrays.toString(notasAlunoC));
        double totalAlunoC = 0;
        for (double nota : notasAlunoC) {
            totalAlunoC += nota;
        }
        System.out.println(String.format("Médica do aluno C: %f", totalAlunoC / notasAlunoC.length));
    }
}
