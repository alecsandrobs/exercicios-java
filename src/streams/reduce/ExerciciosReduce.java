package streams.reduce;

import java.util.List;
import java.util.function.BinaryOperator;

import static java.util.Arrays.asList;

public class ExerciciosReduce {

    public static void main(String[] args) {
//        List<Integer> numeros = asList(7, 3, 4, 2, 8, 1, 2, 8);
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;

        Integer total = numeros.stream().reduce(soma).get();
        System.out.println(String.format("Total: %s", total));
        System.out.println();

        Integer total2 = numeros.parallelStream().reduce(100, soma);
        System.out.println(String.format("Total 2: %s", total2));
        System.out.println();

        numeros.stream()
                .filter(numero -> numero > 5)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
