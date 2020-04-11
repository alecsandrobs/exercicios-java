package streams.desafio;

import streams.utils.Produto;
import streams.utils.Util;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class DesafioFilter2 {

    public static void main(String[] args) {

        Predicate<Produto> promocao = produto -> produto.getDesconto() >= 0.3;
        Predicate<Produto> frete = produto -> produto.getPrecoFrete() == 0;
        Predicate<Produto> relevante = produto -> produto.getPreco() >= 500;
        Function<Produto, String> mensagem = produto -> String.format("Aproveite! %s por %s", produto.getNome(), Util.emReal(produto.getPreco()));

        produtos().stream()
                .filter(promocao)
                .filter(frete)
                .filter(relevante)
                .map(mensagem)
                .forEach(System.out::println);

    }

    private static List<Produto> produtos() {
        return asList(
                new Produto("Lápis", 1.99, 0.35, 0),
                new Produto("Notebook", 4899.89, 0.32, 0),
                new Produto("Caderno", 30, 0.45, 0),
                new Produto("Impressora", 1200, 40, 0),
                new Produto("iPad", 3100, 0.29, 0),
                new Produto("Relógio", 1900, 0.12, 0),
                new Produto("Monitor", 800, 0.31, 0)
        );
    }
}
