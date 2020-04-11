package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);

        Produto produto1 = new Produto("Caneta", 2.50, 0.09);
        imprimir.accept(produto1);
        Produto produto2 = new Produto("Apontador", 1.23, 0.25);
        Produto produto3 = new Produto("Caderno", 10.98, 0.03);
        Produto produto4 = new Produto("Borracha", 1.50, 0.00);
        Produto produto5 = new Produto("Lápis", 0.75, 0.00);

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);

        produtos.forEach(imprimir);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
