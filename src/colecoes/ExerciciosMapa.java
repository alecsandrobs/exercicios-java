package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExerciciosMapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "José");

        System.out.println(usuarios.size());
        System.out.println(usuarios);
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsKey(33));
        System.out.println(usuarios.containsValue("José"));
        System.out.println(usuarios.containsValue("João"));

        System.out.println("-------");
        for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
            System.out.println(usuario.getKey() + " - " + usuario.getValue());
        }
        System.out.println("-------");

        Map<String, Object> pessoa = new HashMap<>();

        pessoa.put("nome", "Andrew Jackson");
        pessoa.put("cpf", "12345678909");

        System.out.println(pessoa);
        System.out.println(pessoa.get("nome"));
        System.out.println(pessoa.get("cpf"));

        for (String chave : pessoa.keySet()) {
            System.out.println(chave);
        }

        for (Object values : pessoa.values()) {
            System.out.println(values.toString());
        }
    }
}
