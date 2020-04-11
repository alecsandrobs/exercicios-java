package excessao;

import streams.utils.Aluno;

public class Basico {

    public static void main(String[] args) {
        Aluno aluno = null;

        try {
            imprimirNomeAluno(aluno);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
