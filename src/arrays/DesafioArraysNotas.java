package arrays;

import java.util.Scanner;

public class DesafioArraysNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Quantidade de notas: ");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print(String.format("%dª nota: ", i + 1));
            notas[i] = entrada.nextDouble();
            total += notas[i];
        }

        System.out.println(String.format("A média do aluno %s é: %f", nome, total / notas.length));

        entrada.close();
    }
}
