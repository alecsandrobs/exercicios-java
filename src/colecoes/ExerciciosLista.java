package colecoes;

import classe.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosLista {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Manoel Tancredo");
        nomes.add("Janine Bones");
        nomes.add("Sandra Silver");
        nomes.add("Kelvin Miller");
        nomes.add("Jhon Green");
        nomes.add("Walter White");
        nomes.add("Joana Dark");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("Quantidade de nomes: " + nomes.size());

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario("Anna");
        usuarios.add(usuario);

        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("Lia"));
        usuarios.add(new Usuario("Bia"));
        usuarios.add(new Usuario("Manu"));

        System.out.println("-------");
        System.out.println(usuarios.get(3).nome);
        System.out.println("-------");

        for (Usuario u : usuarios) {
            System.out.println(u.nome);
        }
    }
}
