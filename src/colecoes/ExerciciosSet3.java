package colecoes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ExerciciosSet3 {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 6) {
            int numero = new Random().nextInt(60);
            if (numero > 0) numeros.add(numero);
        }

        Function<Integer, String> texto = t -> t < 10 ? String.format("0%d", t) : t.toString();
        BinaryOperator<String> valores = (acumulador, numero) -> acumulador + " " + numero;

        System.out.println();
        System.out.println("                NÚMEROS DA SORTE                ");
        System.out.println("=================================================");
        String text = numeros.stream()
                .sorted()
                .map(texto)
                .reduce(valores).get();
        System.out.println("                " + text + "                ");
        System.out.println("=================================================");
    }
}
