package oo.composicao.desafio;

public class Item {
    final Produto produto;
    final Double quantidade;

    Item(Produto produto, Double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
