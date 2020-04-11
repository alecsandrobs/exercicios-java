package streams.desafio;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.util.Arrays.asList;

public class DesafioMap {

    public static void main(String[] args) {
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         1. Número para string binária... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro... "011" => 3
         * */

        UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> inteiro = texto -> Integer.parseInt(texto, 2);

        numeros.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(inteiro)
                .forEach(System.out::println);
    }
}
