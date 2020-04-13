package classe;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {
        Usuario jao = new Usuario();
        jao.nome = "Jão Melão";
        jao.email = "jao.melao@email.com";

        Usuario deuci = new Usuario();
        deuci.nome = "Deuci Amaral";
        deuci.email = "amaraldeuci@emeiou.com";

        System.out.println(jao == deuci);
        System.out.println(jao.equals(deuci));
        System.out.println(deuci.equals(jao));

        System.out.println(deuci.equals(new Date()));

    }
}
