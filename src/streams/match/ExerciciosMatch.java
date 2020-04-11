package streams.match;

import streams.utils.Aluno;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ExerciciosMatch {

    public static void main(String[] args) {

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos().stream().allMatch(aprovado));
        System.out.println(alunos().stream().anyMatch(aprovado));
        System.out.println(alunos().stream().noneMatch(reprovado));

    }

    private static List<Aluno> alunos() {
        return asList(
                new Aluno("Ana", 7.1),
                new Aluno("Luna", 6.1),
                new Aluno("Gui", 8.1),
                new Aluno("Gabi", 10)
        );
    }
}
