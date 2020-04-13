package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Anna"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Júlia"));

        boolean encontrou = usuarios.contains(new Usuario("Anna"));
        System.out.println("Encontrou? " + encontrou);
    }
}
