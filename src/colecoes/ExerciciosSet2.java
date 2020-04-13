package colecoes;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExerciciosSet2 {

    public static void main(String[] args) {

        Set<String> nomesNaoOrdenado = new HashSet<>();
        nomesNaoOrdenado.add("Anna");
        nomesNaoOrdenado.add("Marcos");
        nomesNaoOrdenado.add("Juca");
        nomesNaoOrdenado.add("Pedrinho");

        System.out.println("Não ordenado");
        for (String nome : nomesNaoOrdenado) {
            System.out.println(nome);
        }

        System.out.println();
        SortedSet<String> nomesOrdenado = new TreeSet<>();
        nomesOrdenado.add("Juca");
        nomesOrdenado.add("Anna");
        nomesOrdenado.add("Pedrinho");
        nomesOrdenado.add("Marcos");

        System.out.println("Ordenado");
        for (String nome : nomesOrdenado) {
            System.out.println(nome);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(7);
        numeros.add(4);
        numeros.add(6);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
