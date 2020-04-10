package streamAPI.filter;

import streamAPI.utils.Aluno;
import streamAPI.utils.Produto;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ExerciciosFilter {

    public static void main(String[] args) {
        List<Integer> numeros = asList(3, 2, 4, 7, 8, 7, 6, 1);

        Predicate<Integer> par = numero -> numero % 2 == 0;
        numeros.stream()
                .filter(par)
                .forEach(System.out::println);

        System.out.println();

        produtos().stream()
                .filter(produto -> produto.getPreco() >= 1000)
                .forEach(System.out::println);

        System.out.println();

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> mensagem = aluno -> String.format("Parabéns %s, você foi aprovado(a)!", aluno.nome);
        alunos().stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }

    private static List<Aluno> alunos() {
        return asList(
                new Aluno("Ana", 7.8),
                new Aluno("Bia", 5.8),
                new Aluno("Daniel", 9.8),
                new Aluno("Gui", 6.8),
                new Aluno("Rebeca", 7.1),
                new Aluno("Pedro", 8.8));
    }

    private static List<Produto> produtos() {
        return asList(
                new Produto("GoPro Hero 4 Black", 1200, 0, 0),
                new Produto("Notebook Acer i5 8GB RAM 1TB HD", 2356, 0, 0),
                new Produto("Cabo USB extensor", 30, 0, 0),
                new Produto("Mixer Britânia 2 velocidades", 97, 0, 0));
    }
}
