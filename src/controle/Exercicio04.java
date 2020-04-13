package controle;

public class Exercicio04 {
    public static void ehNumeroPrimo(int numero) {
        boolean ehPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        System.out.printf("O número %s %s primo.\n", numero, ehPrimo ? "é" : "não é");
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 31; i++) {
            ehNumeroPrimo(i);
        }
    }
}
