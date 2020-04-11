package streams.minmax;

import streams.utils.Aluno;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ExerciciosMinMax {

    public static void main(String[] args) {

        Comparator<Aluno> melhor = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.print("Melhor nota: ");
        System.out.println(alunos().stream().max(melhor).get());
        System.out.println();

        System.out.print("Pior nota: ");
        System.out.println(alunos().stream().min(melhor).get());

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
