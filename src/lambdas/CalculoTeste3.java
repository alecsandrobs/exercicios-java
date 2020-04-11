package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calculo = (a, b) -> {
            return a + b;
        };
        System.out.println(calculo.apply(3.0, 4.0));

        calculo = (a, b) -> a * b;
        System.out.println(calculo.apply(3.0, 4.0));

        BinaryOperator<Integer> calculo2 = (a, b) -> {
            return a + b;
        };
        System.out.println(calculo2.apply(3, 4));

        calculo2 = (a, b) -> a * b;
        System.out.println(calculo2.apply(3, 4));
    }
}
