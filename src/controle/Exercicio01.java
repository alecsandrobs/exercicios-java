package controle;

public class Exercicio01 {

    public static void ehParDe0a10(int numero) {
        if (numero % 2 == 0 && (numero >= 0 && numero <= 10)) {
            System.out.printf("O número %d informado e par e está entre 0 e 10.\n", numero);
        } else {
            System.out.printf("O número %d informado nao e par ou não está entre 0 e 10.\n", numero);
        }
    }

    public static void main(String[] args) {
        ehParDe0a10(-2);
        ehParDe0a10(-1);
        ehParDe0a10(7);
        ehParDe0a10(10);
        ehParDe0a10(12);
        ehParDe0a10(15);
//        ehParDe0a10(new Random().nextInt(50));
//        ehParDe0a10(new Random().nextInt(10));

    }
}
