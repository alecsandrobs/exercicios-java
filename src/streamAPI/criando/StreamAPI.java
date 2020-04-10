package streamAPI.criando;

import streamAPI.utils.Util;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) throws FileNotFoundException {
        String lista = Util.getNomesString("\n");

        Consumer<String> printString = System.out::println;
//        Consumer<Integer> printNumber = System.out::println;

        Stream<String> comunicados = Stream.of(lista);
        System.out.println("---=== comunicados.forEach(print); ===---");
        comunicados.forEach(printString);
        System.out.println("=================================================\n");

        String[] arrayLista = lista.split("\n");

        System.out.println("---=== Stream.of(arrayLista).forEach(print); ===---");
        Stream.of(arrayLista).forEach(printString);
        System.out.println("=================================================\n");

        System.out.println("---=== Arrays.stream(arrayLista).forEach(print); ===---");
        Arrays.stream(arrayLista).forEach(printString);
        System.out.println("=================================================\n");

        System.out.println("---=== Arrays.stream(arrayLista, 1, 8).forEach(print); ===---");
        Arrays.stream(arrayLista, 2, 8).forEach(printString);
        System.out.println("=================================================\n");

        List<String> listaLista = Arrays.asList(arrayLista);
        System.out.println("---=== listaLista.stream().forEach(print); ===---");
        listaLista.stream().forEach(printString);
        System.out.println("=================================================\n");

        System.out.println("---=== listaLista.parallelStream().forEach(print); ===---");
        listaLista.parallelStream().forEach(printString);
        System.out.println("=================================================\n");

//        [[[STREAM INFINITO]]]
//        Stream.generate(() -> "Texto").forEach(printString);
//        Stream.iterate(0, n -> n + 1).forEach(printNumber);
//        [[[STREAM INFINITO]]]
    }
}
