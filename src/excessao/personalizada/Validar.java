package excessao.personalizada;

import streams.utils.Aluno;

public class Validar {

    private Validar() {
    }

    public static void usuario(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O Aluno está nulo.");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervalo("nota");
        }
    }
}
