package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosFila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        System.out.println(fila.isEmpty());

        fila.add("Anna");
        boolean adicionouBia = fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Anderson");

        System.out.println(adicionouBia);

        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println(fila.size());

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        System.out.println(fila.size());
        System.out.println(fila.contains("Rafaela"));
        System.out.println(fila.isEmpty());
    }
}
