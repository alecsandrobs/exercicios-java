package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        Calculo calculo = (a, b) -> {
            return a + b;
        };

        System.out.println(calculo.executar(3, 4));

        calculo = (x, y) -> x * y;

        System.out.println(calculo.executar(3, 4));

        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
