package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExerciciosSet {

    public static void main(String[] args) {

        @SuppressWarnings({"rawtypes", "unchecked"})
        HashSet conjunto;
        conjunto = new HashSet();

        System.out.println("Vazio? " + conjunto.isEmpty());

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Joseph Climber");
        conjunto.add(1);
        conjunto.add('A');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("Joseph Climber");

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("joseph climber");

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println("Contem 'joseph climber'? " + conjunto.contains("joseph climber"));

        conjunto.remove("joseph climber");

        System.out.println("Contem 'joseph climber'? " + conjunto.contains("joseph climber"));
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println("Vazio? " + conjunto.isEmpty());

        conjunto.clear();

        System.out.println("Vazio? " + conjunto.isEmpty());
        System.out.println("Tamanho: " + conjunto.size());

        Set numeros = new HashSet();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        conjunto.add(2);
        conjunto.add("A");
        conjunto.add(false);

        System.out.println(numeros);
        conjunto.add(numeros);

        System.out.println(conjunto);
    }
}
