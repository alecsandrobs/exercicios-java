package streams.map;

import streams.utils.Util;

import java.util.List;

import static java.util.Arrays.asList;

public class ExerciciosMap {

    public static void main(String[] args) {

        List<Double> numeros = asList(3.50, 1.39, 7.77, 4.00, 6.25, 5.47, 8.99, 10.89, 9.00, 1234567.89, 0.987654321, 12345678.90, 98765432.10);

        System.out.println("---=== Trabalhando com números ===---\n");
        System.out.println("Imprimir os números");
        numeros.forEach(System.out::println);
        System.out.println();

        System.out.println("Aplicar desconto de 7%");
        numeros.stream()
                .map(n -> n * 0.93)
                .map(Util::emReal)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Multiplicar por 2");
        numeros.stream()
                .map(n -> n * 2)
                .map(Util::emValor)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---=== Trabalhando com textos ===---\n");
        Util.getNomesList().stream()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Transforme em maiúscula e substitui espaço por barra");
        Util.getNomesList().stream()
                .map(Util.maiuscula)
                .map(Util.pipe)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Transforme em maiúscula e substitui espaço ou barra por ponto e vírgula");
        Util.getNomesList().stream()
                .map(Util.minuscula)
                .map(Util::semicolon)
                .forEach(System.out::println);
    }

}
