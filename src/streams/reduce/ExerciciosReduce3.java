package streams.reduce;

import streams.utils.Aluno;
import streams.utils.Media;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ExerciciosReduce3 {

    public static void main(String[] args) {

        Media media1 = new Media().adicionar(8.3).adicionar(6.7);
        Media media2 = new Media().adicionar(7.9).adicionar(6.6);

        System.out.println(media1.getValor());
        System.out.println(media2.getValor());
        System.out.println(new Media().combinar(media1, media2).getValor());
        System.out.println();

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> nota = aluno -> aluno.nota;
        BiFunction<Media, Double, Media> calcular = (m, n) -> m.adicionar(n);
        BinaryOperator<Media> combinar = (m1, m2) -> new Media().combinar(m1, m2);

        Media media = alunos().stream()
                .filter(aprovado)
                .map(nota)
                .reduce(new Media(), calcular, combinar);

        System.out.println(String.format("A média é: %.2f", media.getValor()));
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
