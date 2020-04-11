package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Foreach tradicional:");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nForeach com Lambda #1:");
        aprovados.forEach((aprovado) -> {
            System.out.println(aprovado);
        });

        System.out.println("\nForeach com Lambda #1 (Simplificada):");
        aprovados.forEach(aprovado -> System.out.println(aprovado));

        System.out.println("\nMethod Reference #1");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #2");
        aprovados.forEach(aprovado -> meuImprimir(aprovado));

        System.out.println("\nMethod Reference #1");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println(String.format("Oi! Meu nome é %s", nome));
//        System.out.println("Oi! Meu nome é " + nome);
    }

}
