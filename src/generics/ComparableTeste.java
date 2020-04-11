package generics;

import java.util.TreeSet;

public class ComparableTeste {

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(10);
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(9);
        numeros.add(123);
        numeros.add(-23);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
