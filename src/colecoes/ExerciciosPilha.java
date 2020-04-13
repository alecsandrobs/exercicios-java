package colecoes;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class ExerciciosPilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.push("O Fascinante Império do Steve Jobs");
        livros.add("O Caçador de Pipas");
        boolean aCabana = livros.add("A Cabana");
        livros.push("Guia Politicamente Incorreto d História do Mundo");

        System.out.println("Adicionou 'A Cabana'? " + aCabana);

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

        System.out.println(livros.size());
        System.out.println(livros.isEmpty());
        System.out.println(livros.contains(null));
        livros.clear();


    }
}
