package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Lápis", 1.99, 0.35, 0);
        Produto produto2 = new Produto("Notebook", 4899.89, 0.35, 0);
        Produto produto3 = new Produto("Caderno", 30, 0.45, 0);
        Produto produto4 = new Produto("Impressora", 1200, 0.40, 0);
        Produto produto5 = new Produto("IPad", 3100, 0.29, 0);
        Produto produto6 = new Produto("Relógio", 1900, 0.12, 0);
        Produto produto7 = new Produto("Monitor", 800, 0.31, 0);

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7);

        // Filter, filter, map
        Predicate<Produto> superPromocao = produto -> produto.desconto >= 0.30;
        Predicate<Produto> freteFratis = produto -> produto.frete == 0;
        Predicate<Produto> precoRelevante = produto -> produto.preco >= 500;

        Function<Produto, String> chamadaPromocao = produto -> String.format("Aproveite! %s por R$ %s", produto.nome, produto.preco);

        produtos.stream()
                .filter(superPromocao)
                .filter(freteFratis)
                .filter(precoRelevante)
                .map(chamadaPromocao)
                .forEach(System.out::println);
    }
}
