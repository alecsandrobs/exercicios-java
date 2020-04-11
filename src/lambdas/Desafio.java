package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    /*
     * 1. A partir do produto calcular o preço real (com desconto)
     * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
     * 3. Frete: >= 3000 (100)/ < 300 (50)
     * 4. Arredondar: Deixar duas casas decimais
     * 5. Formatar: R$1234,56
     * */

    public static void main(String[] args) {
        Produto laptop = new Produto("Notebook Lenovo", 3200.03, 0.10);
        Produto smartphone = new Produto("Smartphone Xiaomi MI 9T PRO", 2335.67, 0.15);

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500.0 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000.0 ? preco + 100.0 : preco + 50.0;
        Function<Double, String> formatar =
                preco -> ("R$ " + String.format("%.2f", preco)).replace(".", ",");

        String precoLaptop = precoFinal.
                andThen(impostoMunicipal).
                andThen(frete).
                andThen(formatar).
                apply(laptop);
        System.out.println(String.format("O preço do %s é %s: ", laptop.nome, precoLaptop));

        String precoSmartphone = precoFinal.
                andThen(impostoMunicipal).
                andThen(frete).
                andThen(formatar).
                apply(smartphone);
        System.out.println(String.format("O preço do %s é %s: ", smartphone.nome, precoSmartphone));
    }
}
