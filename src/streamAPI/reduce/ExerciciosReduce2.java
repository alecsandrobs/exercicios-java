package streamAPI.reduce;

import streamAPI.utils.Aluno;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ExerciciosReduce2 {

    public static void main(String[] args) {

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> nota = aluno -> aluno.nota;
        BinaryOperator<Double> soma = (a, b) -> a + b;

        alunos().parallelStream()
                .filter(aprovado)
                .map(nota)
                .reduce(soma)
                .ifPresent(System.out::println);
    }

    private static List<Aluno> alunos() {
        return asList(
                new Aluno("Ana", 7.1),
                new Aluno("Luna", 6.1),
                new Aluno("Gui", 8.1),
                new Aluno("Gabi0", 10)
        );
    }
}
